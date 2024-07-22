import logo from './logo.svg';
import './reset.css'
import './App.css';
import { Route, Routes } from 'react-router-dom';
import BoardList from './BoardList';

function App() {
  return (
    <div className="container">
      <div className="header">
        <div>
          <span>Login</span>
          <span>Join</span>
        </div>
        <h1>자유게시판</h1>
      </div>
      <div className='content'>

      {/* 게시글 목록 페이지 */}
      <Routes>
        <Route path='/' element={<BoardList/>}/>
      </Routes>
      </div>
    </div>
  );
}

export default App;
