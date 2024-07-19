import { toBeEnabled } from "@testing-library/jest-dom/matchers"
import axios from "axios";
import { useEffect, useState } from "react"
import './StudentList.css'
import { useNavigate } from "react-router-dom";
import * as api from './apis';
import { getStuList } from "./apis";
//import{getStuList} from './apis'; <-이렇게 필요한 것만 가져오는 것도 가능
//대신 ㄴ이렇게 가져오면 api.getStuList가 아닌 getStuList라고 써주면 됨

const StudentList =()=>{

  //학생 목록을 저장할 state 변수
  const[stuList, setStuList] = useState([]);
  const navigate = useNavigate();

  useEffect(()=>{
    getStuList()
    .then((res)=>{
      setStuList(res.data);
    })
    .catch((error)=>{
      console.log(error)
    })
  },[]);
  
  return(
    <div>
      <table>
        <thead>
          <tr>
            <td>NO</td>
            <td>학생명</td>
            <td>국어점수</td>
            <td>영어점수</td>
            <td>수학점수</td>
            <td>평균</td>
          </tr>
        </thead>
        <tbody>
          {
            stuList.length == 0 
            ?
            <tr>
              <td colSpan='6'>조회된 데이터가 없습니다</td>
            </tr>
            :
            stuList.map((stu,i)=>{
              const avg = (stu.korScore + stu.engScore + stu.mathScore)/3
              return(
                <tr key={i}>
                  <td>{i+1}</td>
                  <td><span onClick={(e)=>{navigate(`/stuInfo/${stu.stuNum}`)}}>{stu.stuName}</span></td>
                  <td>{stu.korScore}</td>
                  <td>{stu.engScore}</td>
                  <td>{stu.mathScore}</td>
                  <td>{Math.round(avg*100)/100}</td>
                </tr>
              )
            })
          }
        </tbody>
      
      </table>
    </div>
  )

}
export default StudentList