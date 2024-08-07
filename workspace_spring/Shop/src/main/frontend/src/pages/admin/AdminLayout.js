import React from 'react'
import { Outlet } from 'react-router-dom'

const AdminLayout = () => {
  return (
    <div>
      관리자 전용 페이지입니다
      <Outlet/>
    </div>
    
  )
}

export default AdminLayout