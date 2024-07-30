import logo from './logo.svg';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import CarReg from './pages/CarReg';
import MainBoard from './pages/MainBoard';

function App() {
  const navigate = useNavigate();
  return (
    <div className="container">
      <div className="header">
        <thead>
          <table className='menu'>
            <tr>
              <td><span onClick={()=>{navigate('/')}}>홈</span></td>
              <td><span onClick={()=>{navigate('/registration')}}>차량관리</span></td>
              <td><span onClick={()=>{navigate()}}>판매 정보 등록</span></td>
              <td><span onClick={()=>{navigate()}}>판매 목록</span></td>
            </tr>
          </table>
        </thead>
      </div>

      {/* ------ */}
      <div className='content'>
      <Routes>
        {/* 메인화면 */}
        <Route path='/' element={<MainBoard/>}/>

        {/* 치량관리화면 */}
        <Route path='/registration' element={}/>

        {/* 치량등록화면 */}
        <Route path='/registration' element={<CarReg/>}/>

        {/* 치량목록화면 */}
        <Route path='/registration' element={<CarReg/>}/>
      </Routes>

      </div>
    </div>
  );
}

export default App;
