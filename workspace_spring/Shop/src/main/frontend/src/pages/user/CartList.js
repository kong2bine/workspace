import './CartList.css'
import axios from 'axios';
import React, { useEffect, useState } from 'react'

const CartList = (loginInfo) => {

  //조회된 장바구니 목록을 저장할 변수
  const[ cartList, setCartList ]= useState([]);

  //장바구니 목록 조회
  useEffect(()=>{
    const loginInfo = JSON.parse(window.sessionStorage.getItem('loginInfo'));

    axios.get(`/api_cart/getCartList/${loginInfo.memId}`)
    .then((res)=>{
      console.log(res.data)
      setCartList(res.data)

    })
    .catch((error)=>{
      alert('장바구니 조회 오류🤢🛒')
      console.log(error)
    })
  },[])

  console.log();

  return (
    <div className='cart-list-div'>
      <div className='cart-table-div'>
        <h1 className='cart-title'>🛒My cart</h1>
        <table className='cart-list-table'>
          <colgroup>
            <col width='5%'/>
            <col width='5%'/>
            <col width='*'/>
            <col width='10%'/>
            <col width='10%'/>
            <col width='12%'/>
            <col width='20%'/>
            <col width='10%'/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td><input type='checkbox' checked={true}/></td>
              <td>상품정보</td>
              <td>가격</td>
              <td>수량</td>
              <td>구매가격</td>
              <td>구매일시</td>
              <td></td>
            </tr>
          </thead>
          <tbody>
            {
              cartList.map((cart,i)=>{
                return(
                  <tr key={i}>
                    <td>{cartList.length - i}</td>
                    <td><input type='checkbox' checked={true}/></td>
                    <td className='img-td'>
                      <img src={`http://localhost:8080/upload/${cart.itemVO.imgList[0].attachedFileName}`}/>
                      <span>{cart.itemVO.itemName}</span>
                    </td>
                    <td>{'￦'+cart.itemVO.itemPrice.toLocaleString()}</td>
                    <td><input type='number' className='form-control' defaultValue={cart.cartCnt}/></td>
                    <td>{'￦'+(cart.itemVO.itemPrice * cart.cartCnt).toLocaleString()}</td>
                    <td>{cart.cartDate}</td>
                    <td><button type='button' className='btn btn-primary'>삭 제</button></td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
      </div>
      <div className='cart-under-btn'>
        <button type='button' className='btn btn-primary'>선택삭제</button>
        <button type='button' className='btn btn-primary'>선택구매</button>
      </div>
    </div>
  )
}

export default CartList