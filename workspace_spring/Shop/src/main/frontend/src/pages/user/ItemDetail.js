import './ItemDetail.css'
import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const ItemDetail = () => {
  const navigate = useNavigate();

  const {itemCode} = useParams();

  //조회한 정보정도 데이터를 저장할 state 변수
  const [itemDetail, setItemDetail] = useState([])

  //console.log('@@@' + itemDetail.itemPrice.toLocaleString());

  //대표 이미지명을 저장할 변수
  const [mainImgName, setMainImgName] = useState('')

  //상세 이미지명을 저장합 변수
  const [subImgName, setSubImgName] = useState('')

  //총 가격을 저장하는 state 변수
  const [totalPrice, setTotalPrice] = useState(0);

  //수량을 저장 할 변수
  const [itemCnt, setItemCnt] = useState(1);

  //장바구니 담기 버튼 클릭 시 자바로 가져가는 데이터
  const [insertCartData, setInsertCartData] = useState({
    'itemCode' : itemCode,
    'cartCnt' : itemCnt,
    'memId' : JSON.parse( window.sessionStorage.getItem('loginInfo')).memId
  });

  //상품 상세 조회
  useEffect(()=>{
    axios.get(`/api_item/getItemDetail/${itemCode}`)
    .then((res)=>{
      console.log(res.data)

      //조회한 정보에서 대표이미지명, 서브이미지명 찾기
      let img1 = '';
      let img2 = '';
      res.data.imgList.forEach((img,i)=>{
        if(img.isMain == 'Y'){
          img1 = img.attachedFileName;
        }
        else{
          img2 = img.attachedFileName;          
        }
      })

      setMainImgName(img1);
      setSubImgName(img2);
      setItemDetail(res.data);
      setTotalPrice(res.data.itemPrice)
    })
    .catch((error)=>{
      console.log(error)
    })
  },[])

  //수량이 변경되면 실행되는 함수
  function changeItemCnt(e){
    const cnt = Number(e.target.value)

    if(cnt < 1 || cnt > 10){
      alert('수량은 최소 1개, 최대 10까지 구매 가능합니다😊')
      setItemCnt(1)
      setTotalPrice(itemDetail.itemPrice)

       //장바구니 등록 시, 필요 시 수량 데이터를 변경
       setInsertCartData({...insertCartData, 'cartCnt':1});
    }
    else{
      setTotalPrice(itemDetail.itemPrice * Number(e.target.value))
      setItemCnt(e.target.value)

      //장바구니 등록 시, 필요 시 수량 데이터를 변경
      setInsertCartData({...insertCartData, 'itemCnt':e.target.value});
    }
  }

  //장바구니 담기 버튼 클릭 시 실행하는 함수
  function insertCart(){    
    axios.post('/api_cart/insert',insertCartData)
    .then((res)=>{
      const result = window.confirm('장바구니에 담기 완료🛒 더 구매하고 싶은 책이 있으신가요?📚😏')

      //취소를 선택하면 장바구니 목록 페이지로 이동
      if(!result){
        navigate('/getCartList')
      }
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  return (
    <div className='item-detail-div'>
      <div className='item-info-div'>
        <img src={`http://localhost:8080/upload/${mainImgName}`}/>
      <div>
        <h1>{itemDetail.itemName}</h1>
        <p>가격 : {Object.keys(itemDetail).length == 0 ?
                  '' :
                  '￦'+ itemDetail.itemPrice.toLocaleString()}</p>
        <div className='item-cnt-div'>
          <p>수량</p>
          <input type='number' className='form-control' 
                value={itemCnt} onChange={(e)=>{
                  changeItemCnt(e)
          }}></input>
        </div>
        <p>총 가격 : {'￦'+ totalPrice.toLocaleString()+'원'}</p>
        <div className='item-button-div'>
          <button type='button' className='btn btn-primary'>구매하기</button>
          <button type='button' className='btn btn-primary'
          onClick={(e)=>{insertCart()}}>장바구니에 담기</button>
        </div>
      </div>
      </div>
      <div className='item-intro-div'>
        {itemDetail.itemIntro}
      </div>
      <div className='detail-img-div'>
      <img src={`http://localhost:8080/upload/${subImgName}`}/>
      </div>
    </div>
  )
}

export default ItemDetail