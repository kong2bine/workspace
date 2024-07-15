import logo from './logo.svg';
import './App.css';
import { Link, Route, Routes } from 'react-router-dom';
import data from './data';
import BoardList from './BoardList';
import Detail from './Detail';
import Write from './Write';
import { useState } from 'react';
import InputTest from './InputTest';

function App() {
  //게시글 목록
  //let board_list = data;
  const [boardList, setBoardList] = useState(data);



  return (
    <div className="App">
      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path='/'element={<BoardList board_list={boardList}/>} />

        {/* 게시글 상세 정보 페이지 */}
        <Route path='/detail/:boardNum'element={<Detail board_list={boardList}/>}/>

        {/* 글쓰기 페이지 */}
        <Route path='/writeForm'element={<Write board_list={boardList} setBoardList={setBoardList}/>}></Route> 

        {/*input 값 입력받기 연습 */}
        <Route path='/test'element={<InputTest/>}/>  
      </Routes>
      
    
    </div>
  );
}




export default App;