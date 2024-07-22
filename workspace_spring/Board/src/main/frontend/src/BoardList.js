import axios from "axios"
import { useEffect, useState } from "react"

const BoardList = ()=>{

  const [board, setBoard] = useState([])

  //게시글 목록 조회
  useEffect(()=>{
    axios
    .get('/board/list')
    .then((res)=>{
      setBoard(res.data);
    })
    .catch((error)=>{
      alert('게시글 목록 조회 오류!')
      console.log(error)
    })   
  },[])
  
  return(
    <div className="boardListContainer">
      <div className="search-div">
        <select>
          <option>제목</option>
          <option>작성자</option>
        </select>
        <input type="text"></input>
        <button className="btn">검색</button>
      </div>
      <dib className="board-list-div">
      <table>
        <colgroup>
          <col width='10%'/>
          <col width='*'/>
          <col width='20%'/>
          <col width='20%'/>
        </colgroup>
        <thead>
          <tr>
            <td>NO</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
          </tr>
        </thead>
        </table>
      </dib>
      <dib className="button-div"></dib>
      <button className="btn" type="button">글쓰기</button>
    </div>    
  )
}

export default BoardList