import logo from './logo.svg';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import CarReg from './pages/CarReg';

function App() {
  const navigate = useNavigate();
  return (
    <div className="container">
      <div className="header">
        <thead>
          <table className='menu'>
            <tr>
              <td><span onClick={()=>{navigate('/')}}>홈</span></td>
              <td><span onClick={()=>{navigate('/carReg')}}>차량관리</span></td>
              <td><span onClick={()=>{navigate()}}>판매 정보 등록</span></td>
              <td><span onClick={()=>{navigate()}}>판매 목록</span></td>
            </tr>
          </table>
        </thead>
      </div>

      {/* ------ */}
      <div className='content'>
      <Routes>
        <Route path='/' element={<mainPage/>}/>
      </Routes>

      </div>
    </div>
  );
}

export default App;
