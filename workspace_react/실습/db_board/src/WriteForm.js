import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate } from "react-router-dom"

const WriteForm=()=>{

  const navigate = useNavigate();
  //입력한 내용을 저장하는 state 변수
  const[board, setBoard] = useState({
    boardTitle : '',
    boardWriter : '',
    boardContent : ''
  });

  //글 등록 버튼 클릭 시 실행하는 함수
  function insertBoard(){
    //제목이 비었으면?
    const title_input = document.querySelector('input[name="boardTitle"]')
    if(title_input.value == ''){
      alert('제목은 필수입력입니다')
      title_input.focus();
      return ;
    }
    
    if(board.boardTitle == ''){
      alert('제목은 필수입력입니다')
    }


    axios
    .post('/regBoard', board)
    .then((res)=>{
      alert('게시글이 등록되었습니다')
      navigate('/')
    })
    .catch((error)=>{
      alert('글 등록 오류')
      console.log(error)
    })
  }

  //입력값 세팅
  function changeBoard(e){
    setBoard({
      ...board,
      [e.target.name] : e.target.value
    });
  }


  return(
    <div>
      <div>
      제목 : <input name='boardTitle' onChange={(e)=>{changeBoard(e)}}/> <br/>
      작성자 : <input name='boardWriter' onChange={(e)=>{changeBoard(e)}}/> <br/>
      내용 : <textarea name='boardContent' onChange={(e)=>{changeBoard(e)}}></textarea> <br/>
      </div>
      <button type="button" onClick={(e)=>{insertBoard()}}>등록</button>
    </div>
  )
}

export default WriteForm