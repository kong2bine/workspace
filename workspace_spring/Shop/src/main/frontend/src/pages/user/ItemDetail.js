import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom'

const ItemDetail = () => {
  const navigate = useNavigate();
  const [itemDetail, setItemDetail] = useState([])

  //상품 상세 조회
  useEffect(()=>{
    axios.get('/api_item/itemDetail')
    .then((res)=>{
      setItemDetail(res.data)
    })
    .catch((error)=>{
      console.log(error)
    })
  })

  
  


  return (
    <div>
       <div>
        <div>{itemDetail.imgLsit}</div>
          <p>{itemDetail.itemName}</p>
          <p>가격 : {'￦'+ itemDetail.itemPrice.toLocaleString() + '원'}</p>
          <p>{itemDetail.itemStock}</p>
          {/* <p>{totalPrice}</p> */}
          <button type='button'>구매하기</button>
          <button type='button'>장바구니에 담기</button>
          <div>{itemDetail.itemIntro}</div>
          <div>{itemDetail.imgLsit[0].attachedFileName}</div>
        </div> 
    </div>
  )
}

export default ItemDetail