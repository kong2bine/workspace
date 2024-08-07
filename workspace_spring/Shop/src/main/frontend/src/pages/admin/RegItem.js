import axios from 'axios'
import React, { useEffect, useState } from 'react'

const RegItem = () => {
  //카테고리 목록을 저장할 state 변수
  const [categoryList, setCategoryList] = useState([]);

  //상품등록 시 가져가야할 데이터를 저장할 변수
  const [regBook, setRegBook] = useState({
    cateCode : '',
    itemName : '',
    itemPrice : '',
    itemStatus : ''
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

  function changeRegBook(e){
    setRegBook({
      ...regBook,
      [e.target.name] : e.target.value
    });
  }

  function regSuccess(){
    axios.post('/admin/itemList',)
    .then((res)=>{
      console.log(res.data)
      //모달창      
    })
    .catch((error)=>{
      console.log(error)
    })
  }
  

  return (
    <div>
      <div>
        <div>상품 카테고리</div>
        <select>
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
        name='itemCode' onChange={(e)=>{changeRegBook(e)}}></input>
      </div>
      <div>
        <div>상품 가격</div>
        <input type='text'
        name='itemCode' onChange={(e)=>{changeRegBook(e)}}></input>
      </div>
      <div>
        <div>상품 소개</div>
        <input type='text'
        name='itemCode' onChange={(e)=>{changeRegBook(e)}}></input>
      </div>
      <button type='button' className='btn btn-primary'
              onClick={(e)=>{regSuccess()}}>상품 등록</button>
    </div>
    //등록 성공시 모달로 '상품을 등록했습니다' 띄우기
    //모달의 '확인'버튼 클릭시 모달창 끄기
  )
}

export default RegItem