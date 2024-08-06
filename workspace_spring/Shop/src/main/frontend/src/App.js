import './App.css';
import './reset.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import UserLayout from './pages/user/UserLayout';
import AdminLayout from './pages/admi/AdminLayout';
import Join from './pages/user/Join';
import Login from './pages/user/Login';
import { BookList } from './pages/user/BookList';

function App() {
  const navigate = useNavigate();
  return (
    <div className="container">
     <div className='login-div'>
      <div>
        <ul className='header-menu'>
          <li>
            <span onClick={(e)=>{navigate('/login')}}>LOGIN</span>
          </li>
          <li onClick={(e)=>{navigate('/join')}}>JOIN</li>
        </ul>
      </div>
      <div className='banner'>
        <div>
          <img className='banner-img' src='http://localhost:8080/images/library.jpg'/>
        </div>
        <div className='title-div'>BOOK SHOP</div>
      </div>
      </div>

     <div className='layout-div'>
      <Routes>
      {/* 일반 유저용 */}
      <Route path='/' element={<UserLayout/>}>
        {/* 상품 목록 화면 */}
        <Route path='/bookList' element={<BookList/>}/>
        {/* 회원 가입 */}
        <Route path='join' element={<Join/>}/>
        {/* 로그인 페이지 */}
        <Route path='login' element={<Login/>}/>
      </Route>


      {/* 관리자용 */}
      <Route path='/admin' element={<AdminLayout/>}>
        <Route path='test1' element={<div>상품 등록페이지</div>}/>
      </Route>
      

      </Routes>
     </div>
    </div>
  );
}

export default App;
