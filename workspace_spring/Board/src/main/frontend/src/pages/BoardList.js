import axios from "axios"
import { useEffect, useState } from "react"
import * as boardApi from '../apis/boardApi';
import React from 'react'
// ../ : 현재폴더의 상위폴더에

const BoardList = ()=>{

  //조회된 게시글 목록을 저장할 변수
  const [boardList, setBoardList] = useState([])

  //게시글 목록 조회
  useEffect(()=>{
    boardApi.getBoardList()
    .then((res)=>{
      setBoardList(res.data);
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
      <div className="board-list-div">
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
        <tbody>
          {
            boardList.map((board, i)=>{
              return (
                <tr key={i}>
                  <td>{boardList.length -i}</td>
                  <td>{board.title}</td>
                  <td>{board.memId}</td>
                  <td>{board.createDate}</td>
                </tr>
              )
            })
          }
        </tbody>
        </table>
      </div>
      <div className="btn-div">
        {
          loginInfo.memId != null
          ?
          <button className="btn" type="button">글쓰기</button>
          :
          null
        }
      </div>
    </div>    
  )
}

export default BoardList;