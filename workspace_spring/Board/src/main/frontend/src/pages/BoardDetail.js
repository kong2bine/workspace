import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';
import * as boardApi from '../apis/boardApi';
import * as replyApi from '../apis/replyApi';

const BoardDetail = () => {
  const {boardNum} = useParams();

  //게시글 상세 정보를 저장할 변수
  const [boardDetail,setBoardDetail] = useState({});

  //댓글 목록을 저장할 변수
  const [replyList, setReplyList] = useState([]);

  //게시글 상세정보 조회
  useEffect(()=>{
    boardApi.getBoardDetail(boardNum)
    .then((res)=>{
      setBoardDetail(res.data);
    })
    .catch((error)=>{
      alert('상세보기 오류입니다')
      console.log(error)
    })
  },[])

  useEffect(()=>{
    replyApi.getReplyList(boardNum)
    .then((res)=>{
      setReplyList(res.data);
    })
    .catch((error)=>{
      console.log(error);
    });
  },[])



  return (
    <div>
      <div>
        글번호 : {boardDetail.boardNum}
        <table>
          <tbody>
            <tr>
              <td>작성일</td>
              <td>{boardDetail.createDate}</td>
              <td>작성자</td>
              <td>{boardDetail.memId}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={3}>{boardDetail.title}</td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={3}>{boardDetail.content}</td>
            </tr>
          </tbody>
        </table>
      </div>

      <div>
        <button type='button' className='btn'>목록가기</button>
        <button type='button' className='btn'>수정</button>
        <button type='button' className='btn'>삭제</button>
      </div>

      <div>
        {
          replyList.map((reply, i)=>{
            return(
              <div>
                <div>{reply.replyDate}</div>
                <div>{reply.memId}</div>
                <div>{reply.replyContent}</div>
              </div>
            )
          })
        }
      </div>
    </div>
  )
}

export default BoardDetail