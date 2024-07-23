import logo from './logo.svg';
import './reset.css'
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import BoardList from './pages/BoardList';
import JoinForm from './pages/JoinForm';
import LoginForm from './pages/LoginForm';

function App() {
  const navigate = useNavigate();
  return (
    <div className="container">
      <div className="header">
        <div>
          <span onClick={(e)=>{navigate('/loginForm')}}>Login</span>
          <span onClick={(e)=>{navigate('/joinForm')}}>Join</span>
        </div>
        <h1>자유게시판</h1>
      </div>
      <div className='content'>


      <Routes>

        {/* 게시글 목록 페이지 */}
        <Route path='/' element={<BoardList/>}/>

        {/* 회원가입 페이지 */}
        <Route path='/joinForm' element={<JoinForm/>}/>

        {/* 로그인 페이지 */}
        <Route path='/loginForm' element={<LoginForm/>}/>


      </Routes>
      </div>
    </div>
  );
}

export default App;
