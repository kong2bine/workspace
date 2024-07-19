// 2024.7.19
//서버와 통신하는 기능을 모아놓은 js

import axios from "axios";

//학생 목록 조회 api
export const getStuList=()=>{
  const reponse = axios.get('/getStuList');
  return reponse;
}
//ㄴ이거 function getStuList(){} 이걸로 써도ㅇㅇ

export const stuInfo = (stuNum)=>{
  const response = axios.get(`/stuInfo/${stuNum}`);
  return response;
}

//학생의 점수 정보 등록(변경)
export const updateScore = (data)=>{
  const response = axios.put('/updateScore', data);
  return response;
}
