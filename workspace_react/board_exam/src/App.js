import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

// 2024.7.5
function App() {
  const [isShow, setIsShow] = useState(false);
  const [index, setIndex] = useState(0);

  const board_list = [
    {
      boardNum : 1,
      tilte : '첫번째 게시글',
      content : '첫번째 내용',
      writer : '김자바'
    }, 
    {
      boardNum : 2,
      tilte : '두번째 게시글',
      content : '두번째 내용',
      writer : '고길동'
    }, 
    {
      boardNum : 3,
      tilte : '세번째 게시글',
      content : '세번째 내용',
      writer : '최리액트'
    }

  ];
return(
  <div className="APP">
    <div className="container">
      <table>
        <thead>
          <tr>
            <td>글번호</td>
            <td>제목</td>
            <td>작성자</td>
          </tr>
        </thead>
        <tbody>
          {
            board_list.map((board, i)=>{
              return (
                <tr key={i}>
                  <td>{board.boardNum}</td>
                  <td>
                    <span className="title-span" onClick={()=>{
                      setIsShow(true);
                      setIndex(i);
                    }}>{board.tilte}</span>
                  </td>
                  <td>{board.writer}</td>
                </tr>
              );
            })
          }
        </tbody>
      </table>

      {
        isShow ? <Detail board = {board_list[0]}/> : null
      }


    </div>
    </div>
    
)
}

function Detail(props){
  return(
  <div className="detail">
    글번호 : {props.board.boardNum} <br></br>
    글제목 : {props.board.tilte} <br></br>
    글내용 : {props.board.content} <br></br>
    작성자 : {props.board.writer} <br></br>
  </div>
  );

}

export default App;
