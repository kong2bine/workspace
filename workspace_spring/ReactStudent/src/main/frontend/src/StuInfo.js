import axios from "axios";
import { useEffect, useState } from "react"
import { useNavigate, useParams } from "react-router-dom";
import { stuInfo } from "./apis";

const StuInfo=()=>{
  const navigate = useNavigate();
  const[stuDetail, setStuDetail]=useState({});
  const params = useParams();

  useEffect(()=>{
    axios
    .get(`/stuInfo/${params.stuNum}`)
    //stuInfo(stuNum)
    .then((res)=>{
      setStuDetail(res.data)
      
    })
    .catch((error)=>{
      alert('상세보기 오류')
      console.log(error)
    })
  },[])
  return(
    <div>
      <table>
        <thead>
          <tr>
            <td>이름</td>
            <td>{stuDetail.stuName}</td>
            <td>나이</td>
            <td>{stuDetail.stuAge}</td>
          </tr>
          <tr>
            <td>연락처</td>
            <td>{stuDetail.stuTell}</td>
            <td>주소</td>
            <td>{stuDetail.stuAddr}</td>
          </tr>
          <tr>
            <td>국어점수</td>
            <td>{stuDetail.korScore}</td>
            <td>영어점수</td>
            <td>{stuDetail.engScore}</td>
          </tr>
          <tr>
            <td>수학점수</td>
            <td>{stuDetail.mathScore}</td>
            <td>평균</td>
            <td>{
            Math.round((stuDetail.korScore + stuDetail.engScore + stuDetail.mathScore)/3*100)/100
            }</td>
          </tr>
        </thead>
        <tbody></tbody>
      </table>
      <button type="button" onClick={(e)=>{navigate('/')}}>뒤로가기</button>
    </div>

  )
}

export default StuInfo