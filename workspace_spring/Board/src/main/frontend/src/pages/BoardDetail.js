import React, { useEffect, useState } from 'react'

const BoardDetail = () => {
  const [boardContent,getBoardContent] = useState({
    createDate : '',
    memId : '',
    title : '',
    content : ''
  });
  

  return (
    <div>
      <table>
        <tr>
          <td>작성일</td>
          <td></td>
          <td>작성자</td>
          <td></td>
        </tr>
        <tr>
          <td>제목</td>
          <td colSpan={3}></td>
        </tr>
        <tr>
          <td>내용</td>
          <td colSpan={3}></td>
        </tr>
      </table>
      <button type='button'>목록가기</button>
      <button type='button'>수정</button>
      <button type='button'>삭제</button>
    </div>
  )
}

export default BoardDetail