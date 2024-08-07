import React, { useEffect, useState } from 'react'
import './ItemList.css'
import axios from 'axios';

const ItemList = () => {
//상품 목록을 저장할 state변수
const [itemList, setItemList] = useState([]);

//상품 목록 조회
useEffect(()=>{
  axios.get('/api_item/itemList',itemList)
  .then((res)=>{
    setItemList(res.data)
  })
  .catch((error)=>{
    console.log(error)
})
},[])

console.log(itemList);

  return (
    <div className='item-list-div'>
      {
        itemList.map((item, i)=>{
          return(
            <div className='item-div' key={i}>
              <img src='http://localhost:8080/upload/${item.imgList[0].attachedFileName}'/>
              <h4>{item.ItemList}</h4>
              <p>{'￦'+item.itemPrice.toLocaleString() + '원'}</p>
            </div>
          );
        })
      }
  </div>
  )
}

export default ItemList