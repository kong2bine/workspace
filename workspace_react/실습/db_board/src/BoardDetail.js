import axios from "axios";
import { useEffect, useState } from "react"
import { useNavigate, useParams } from "react-router-dom";
import BoardList from "./BoardLsit";

const BoardDetail = ()=>{
  const navigate = useNavigate();

  //route의 url로 전달되는 데이터 받기
  const params = useParams();
  console.log(params)

  //상세정보를 저장할 state 변수
  const [board, setBoard] = useState({});

  //DB에서 상세 조회한 내용을 화면에 출력
  useEffect(()=>{
    axios
    .get(`/boardDetail/${params.boardNum}`)
    .then((res)=>{
      console.log(res.data);
      setBoard(res.data);
    })
    .catch((error)=>{
      alert('오류발생')
      console.log(error)
    });
  },[]);

  function deleteBoard(){
    if(window.confirm('삭제하시겠습니까?')){
      axios
      .delete(`/deleteBoard/${board.boardNum}`)
      .then((res)=>{
        alert('삭제 완료')
        navigate('/');
      })
      .catch((error)=>{
        alert('삭제 오류');
        console.log(error)
      });
    }    

  }

  return(
    <div>
      <table className="list">
        <tbody>
        <tr className="head">
          <td>글 번호</td>
          <td>{board.boardNum}</td>
          <td>작성자</td>
          <td>{board.boardWriter}</td>
          <td>작성일</td>
          <td>{board.createDate}</td>
        </tr>
        <tr>
          <td>제목</td>
          <td colSpan={6}>{board.boardTitle}</td>
        </tr>
        <tr>
          <td>내용</td>
          <td colSpan={6}>{board.boardContent}</td>
        </tr>
        </tbody>
      </table>
      <button type="button" onClick={()=>{navigate(-1)}}>뒤로가기1</button>
      <button type="button" onClick={()=>{navigate('/')}}>뒤로가기2</button>
      <button type="button" onClick={()=>{deleteBoard()}}>삭제</button>
    </div>
  )
}

export default BoardDetail