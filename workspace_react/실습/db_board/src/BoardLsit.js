import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

// 2024.7.15
const BoardList =()=>{
  const navigate = useNavigate();
  //게시글 목록이 저장될 state 변수
  const [boardList, setBoardList] = useState([]);
  
  //게시글 목록 조회
  useEffect(()=>{

    axios
    .get('/boardList')
    .then((res)=>{
      console.log(res.data);
      setBoardList(res.data);
    })
    .catch((error)=>{
      //alert('오류발생!\n개발자 모드로 콘솔 확인하세요')
      // \n : 한 줄 개행
      console.log(error);
    });
  },[])

  
  return(
    <div>
      <table>
        <thead>
          <tr>
            <td>글번호</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
          </tr>
        </thead>
        <tbody>
          {
            boardList.map((board, i)=>{
              return(
                <tr key={i}>
                  <td>{board.boardNum}</td>
                  <td>
                    <span onClick={()=>{
                      navigate(`/detail/${board.boardNum}`);
                    }}>{board.boardTitle}</span>
                    </td>
                  <td>{board.boardWriter}</td>
                  <td>{board.createDate}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
      <button type="button" onClick={(e)=>{navigate('/writeForm')}}>글쓰기</button>
    </div>
  );
}

export default BoardList;