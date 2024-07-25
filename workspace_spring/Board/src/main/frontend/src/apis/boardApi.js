
// 2024.7.23
// == 게시판 테이브에서 사용하는 axis 모음 ==//

import axios from "axios"

//게시글 목록 조회
export const getBoardList =()=>{
  const response = axios.get('/board/list')
  return response;
}

//게시글 등록
export const insertBoard = (data) => {
  const response = axios.post('/board/insert', data);
  return response;
}

//게시글 상세정보
export const getBoardDetail = (boardNum) =>{
  const response = axios.get(`/board/detail/${boardNum}`);
  return response;
}