import logo from './logo.svg';
import './reset.css'
import './App.css';
import { json, Route, Routes, useNavigate } from 'react-router-dom';
import BoardList from './pages/BoardList';
import JoinForm from './pages/JoinForm';
import LoginForm from './pages/LoginForm';
import { useEffect, useState } from 'react';
import BoardDetail from './pages/BoardDetail';
import BoardWrite from './pages/BoardWrite';

function App() {
  const navigate = useNavigate();

  const [loginInfo, setLoginInfo] = useState({});
  
  useEffect(()=>{
    const loginDataString = window.sessionStorage.getItem('loginInfo');

    if(loginDataString != null){
      const loginData = JSON.parse(loginDataString);
      setLoginInfo(loginData);
    }
  },[]);

  return (
    <div className="container">
      <div className="header">
        <div>
          {
            loginInfo.memId == null
            ?
            <>
              <span onClick={(e)=>{navigate('/loginForm')}}>Login</span>
              <span onClick={(e)=>{navigate('/joinForm')}}>Join</span>
            </>
            :
            <div>
              {loginInfo.memName}님 반갑습니다
              <span onClick={(e)=>{
                //세션스토리지에 저장된 로그인 정보를 제거
                window.sessionStorage.removeItem('loginInfo');
                setLoginInfo({});
                alert('로그아웃!')
                navigate('/')
              }}>Logout</span>
            </div>
          }   
        </div>
        <h1>자유게시판</h1>
      </div>
      <div className='content'>


      <Routes>

        {/* 게시글 목록 페이지 */}
        <Route path='/' element={<BoardList loginInfo={loginInfo}/>}/>

        {/* 회원가입 페이지 */}
        <Route path='/joinForm' element={<JoinForm/>}/>

        {/* 로그인 페이지 */}
        <Route path='/loginForm' element={<LoginForm setLoginInfo={setLoginInfo}/>}/>

        {/* 게시글 작성 페이지 */}
        <Route path='writeForm'element={<BoardWrite loginInfo={loginInfo}/>}/>

        {/* 게시글 상세보기 페이지 */}
        <Route path='/boardDetail'element={<BoardDetail/>}/>

      </Routes>
      
      </div>
    </div>
  );
}

export default App;
