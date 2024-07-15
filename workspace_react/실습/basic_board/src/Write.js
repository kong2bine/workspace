import { useState } from "react";
import { useNavigate } from "react-router-dom";

//글쓰기페이지
const Write=({board_list, setBoardList})=>{
  const navigate = useNavigate();

  console.log('등록 전 게시글 목록')
  console.log(board_list);

  const[board,setBoard]= useState({
    boardNum : 0,
    title : '',
    writer : '',
    createDate : '',
    content : '',
  })
  
  function changeBoard(e){
    setBoard({
      ...board,
      [e.target.name] : e.target.value
    });    
  }

  return(
    <div className="submitList">
      글번호<input type="text" name="boardNum" onChange={(e)=>{changeBoard(e)}}></input><br/>
      제목 <input type="text"name="title" onChange={(e)=>{changeBoard(e)}}></input><br></br>
      작성자<input type="text" name="writer" onChange={(e)=>{changeBoard(e)}}></input><br></br>
      작성일<input type="date" name="createDate" onChange={(e)=>{changeBoard(e)}}></input><br></br>
      내용<textarea name="content" onChange={(e)=>{changeBoard(e)}}></textarea><br></br>
      <button type="button" onClick={(e)=>{
        setBoardList([...board_list, board]);
        navigate('/');
        }}>글등록</button>
    </div>

  )

}

export default Write