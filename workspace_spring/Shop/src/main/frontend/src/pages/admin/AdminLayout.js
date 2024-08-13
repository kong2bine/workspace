import React, { useState } from 'react'
import { Outlet, useNavigate } from 'react-router-dom'
import ItemManage from './ItemManage';


const AdminLayout = () =>{
  const itemVO = [{
    'itemCode' : 1,
    'itemName' : 'java',
    'itemPrice' : 1000,
    'itemIntro' : '!!',
    'itemStock' : 0,
    'itemStatus' : null,
    'cateCode' : 2,
    'imgList' :0
  }
]


  const navigate = useNavigate();
  //상단 메뉴 버튼 클릭시 보여지는 화면
  const [clickMenuBtn, setClickMenuBtn] = useState();
  //사이드 메뉴 정보를 관리하는 state 변수
  const [sideMenu, setSideMenu] = useState('itemManage');
  //사이드 메뉴를 화면에 그리는 함수
  function drawSideMenu(){
    //상단 메뉴에서 상품관리 클릭 시
    if(sideMenu == 'itemManage'){
      return(
        <>
          <li>
            <span onClick={()=>{navigate('/admin/itemManage')}}>상품관리</span>
            <span><i class="bi bi-caret-right-fill"></i></span>
          </li>
          <li>
            <span onClick={()=>{navigate('/admin/regItem')}}>상품등록</span>
            <span><i class="bi bi-caret-right-fill"></i></span>
          </li>
          <li>
            <span onClick={()=>{navigate('/admin/categoryManage')}}>카테고리관리</span>
            <span><i class="bi bi-caret-right-fill"></i></span>
          </li>
        </> 
      );  
    }
    
    //상단 메뉴에서 구매관리 클릭 시
    else if(sideMenu == 'saleManage'){
      return(
        <>
        <li>
          <span>이 달의 구매내역</span>
          <span><i class="bi bi-caret-right-fill"></i></span>
        </li>
        <li>
          <span>구매정보 관리</span>
          <span><i class="bi bi-caret-right-fill"></i></span>
        </li>
      </> 
      )
    }
    //상단 메뉴에서 유저관리 클릭 시
    else if(sideMenu == 'userManage'){
      return(
        <>
        <li>
          <span>유저검색</span>
          <span><i class="bi bi-caret-right-fill"></i></span>
        </li>
        <li>
          <span>유저정보변경</span>
          <span><i class="bi bi-caret-right-fill"></i></span>
        </li>
        <li>
          <span>탈퇴유저 관리</span>
          <span><i class="bi bi-caret-right-fill"></i></span>
        </li>
      </>
        
      )
    }
    //상단 메뉴에서 매출관리 클릭 시
    else if(sideMenu == 'recordManage'){
      return(
        <>
        <li>
          <span>이달의 매출</span>
          <span><i class="bi bi-caret-right-fill"></i></span>
        </li>
        <li>
          <span>월별 매출</span>
          <span><i class="bi bi-caret-right-fill"></i></span>
        </li>
        <li>
          <span>카테고리별 매출</span>
          <span><i class="bi bi-caret-right-fill"></i></span>
        </li>
      </> 
        
      )
    }

  }
  


  return (
    <div>
     <div className='menu-div'>
        <ul className='menu-ul'>
          <li><span onClick={()=>{
            setSideMenu('itemManage')
            navigate('/admin/itemManage')
            }}>상품관리</span></li>
          <li><span onClick={()=>{
            setSideMenu('saleManage')
            navigate('/admin/categoryManage')
            }}>구매관리</span></li>
          <li><span onClick={()=>{setSideMenu('userManage')
            navigate('/admin/searchUser')
          }}>유저관리</span></li>
          <li><span onClick={()=>{setSideMenu('recordManage')
            navigate('/admin/recordOfMonth')
          }}>매출관리</span></li>
        </ul>
      </div>
      <div className='side-menu-div'>
          <ul className='side-menu-ul'>
            {
              drawSideMenu()
            }
          </ul>
        <Outlet/>
      </div>
     
    </div>
    
  )
}


export default AdminLayout