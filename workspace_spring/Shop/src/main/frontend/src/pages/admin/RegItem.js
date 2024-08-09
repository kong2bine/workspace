import axios from 'axios'
import React, { useEffect, useState } from 'react'

const RegItem = () => {
  //첨부파일을 저장할 state 변수
  const [mainImg, setMainImg] = useState(null);
  const [subImg, setSubImg] = useState(null);

  //카테고리 목록을 저장할 state 변수
  const [categoryList, setCategoryList] = useState([]);
  
  //상품등록 실패시 보여지는 함수
  const [isItemSucces, setItemSucces] = useState(false);

  //상품등록 시 가져가야할 데이터를 저장할 state 변수
  const [insertItemData, setInsertItemData] = useState({
    itemName : '',
    itemPrice : '',
    itemIntro : '',
    cateCode : 1
  })


  //카테고리 목록 조회
  useEffect(()=>{
    axios.get('/admin/getCateList')
    .then((res)=>{
      setCategoryList(res.data);
    })
    .catch((error)=>{
      console.log(error);
    })
  },[])

    //INPUT태그에 값 입력 시 isnertItemData 변수에 입력 값 저장 함수
  function changeInsertItemData(e){
    setInsertItemData({
      ...insertItemData,
      [e.target.name] : e.target.value
    });
  }

  //상품 등록 버튼 클릭 시
  //post(url, data, config)
  //get(url, config)
  //put(url, data, config)
  //delete(url,config)
  function insertItem(){
    //axios 통신으로 자바로 갈 때 첨부파일이 있으면
    //반드시 아래의 설정코드를 axios에 추가 
    const fileConfig = {headers : {'Content-Type':'multipart/form'}}

    //위의 설정코드를 axios 통신할 떄 추가하면 
    //자바로 넘어가는 데이터를 전달하는 방식이 달라짐
    //첨부파일이 있는 데이터를 자바로 전달하기 위해서는 form태그를 사용해서 전달

    //1.form 태그 생성
    const itemForm = new FormData();

    //2.form 객체에 데이터 추가
    //itemForm.append('itemName', '상품1');
    //itemForm.append('itemPrice', 10000);

    itemForm.append('itemName', insertItemData.itemName);
    itemForm.append('itemPrice', insertItemData.itemPrice);
    itemForm.append('itemIntro', insertItemData.itemIntro);
    itemForm.append('cateCode', insertItemData.cateCode);
    itemForm.append('mainImg', mainImg);
    itemForm.append('subImg', subImg);

    //3. 데이터를 가진 form 객체를 axios 통신에서 자바로 전달
    //axios.post('/admin/insertItem',insertItemData, fileConfig)
    axios.post('/admin/insertItem',itemForm, fileConfig)
    .then((res)=>{
      if(res.data == ''){
        alert('상품등록')
        setItemSucces(false)        
      }
      else{
        setItemSucces(true)
      }
      //상품정보
      const itemInfo = {
        cateCode : res.data.cateCode,
        itemName : res.data.itemName,
        itemPrice : res.data.itemPrice,
        itemIntro : res.data.itemIntro
      }

      const json_itemInfo = JSON.stringify(itemInfo)

      window.sessionStorage.setItem(
        'itemInfo',json_itemInfo);

        //setItemInfo(itemInfo);
    })
    .catch((error)=>{
      console.log(error)
    })
  }
  

  return (
    <div>
      <div className='join-div'>
        <div>
          <div>상품 카테고리</div>
          <select name='cateCode' onChange={(e)=>{changeInsertItemData(e)}}>
            {
              categoryList.map((category, i)=>{
                return(
                  <option key={i} value={category.cateCode}>{category.cateName}</option>
                )
              })
            }
          </select>
        </div>
        <div>
          <div>상품명</div>
          <input type='text'
          name='itemName' onChange={(e)=>{changeInsertItemData(e)}}></input>
        </div>
        <div>
          <div>상품 가격</div>
          <input type='text'
          name='itemPrice' onChange={(e)=>{changeInsertItemData(e)}}></input>
        </div>
        <div>
          <div>상품 소개</div>
          <input type='text'
          name='itemIntro' onChange={(e)=>{changeInsertItemData(e)}}></input>
        </div>
        <div>
          <input type='file' onChange={(e)=>{
            //선택한 파일 정보(배열 형태로 가져 옴)
            console.log(e.target.files[0]);
            setMainImg(e.target.files[0]);
          }}/>
        </div>
        <div>
          <input type='file' onChange={(e)=>{
            console.log(e.target.files[0]);
            setSubImg(e.target.files[0]);
          }}/>
        </div>
        <div>
        <button type='button' className='btn btn-primary'
                onClick={(e)=>{insertItem()}}>상품 등록</button>
        </div>
        </div>
    </div>
      //등록 성공시 모달로 '상품을 등록했습니다' 띄우기
      //모달의 '확인'버튼 클릭시 모달창 끄기
  )
}

export default RegItem