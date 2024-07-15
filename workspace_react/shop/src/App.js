import logo from './logo.svg';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import axios from 'axios';
import { Link, Route, Routes } from 'react-router-dom';
import Detail from './Detail';
// 2024.7.10
function App() {
  //상품 목록 데이터  
  const itemList = data;
 
  return (
    <div className="App">
      <div className="header">
        Book Shop
        <Link to={'/list'}>상품목록</Link>
        <Link to={'/detail'}>상품상세</Link>                
      </div>
       <div className="banner">
        <img src={process.env.PUBLIC_URL + '/header.jpg'}/>      
       </div>

       {/* 이동할 수 있는 페이지의 url들 */}
       <Routes>
        <Route path='/' element={<div>메인페이지</div>} />
        <Route path='/list' element={<ItemList item_list= {itemList}/>} />
        <Route path='/detail/:id' element={<Detail item_list={itemList}/>} />
        <Route path='*' element={<div>잘못된 페이지입니다.</div>} />       
       </Routes>

       {/* <ItemList item_list= {itemList} /> */}

      </div>
  );
}
//넘어오는 데이터의 key값과 동일한 값을 {}안에 감싸서 넣기!
const Test =({name, age})=>{
  console.log(name);
  console.log(age);
  return(
    <div>shalala</div>
  )
}

export default App;
