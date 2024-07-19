//rafce 입력
import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import { getStuList } from './apis';

const Score = () => {
  const [stuList, setStuList] = useState([]);
  const navigate = useNavigate();

  useEffect(()=>{
    getStuList()
    .then((res)=>{
      setStuList(res.data);
    })
    .catch((error)=>{
      console.log(error)
    })
  },[])
  

  
  return (
    <div>
      <table>
        <thead>
          <tr>
            <td>NO</td>
            <td>학생명</td>
            <td>입력</td>
          </tr>
        </thead>
        <tbody>
        {
            stuList.map((stu,i)=>{
              return(
                <tr key={i}>
                <td>{stuList.length-i}</td>
                <td>{stu.stuName}</td>
                <td>
                  <button type='button' onClick={(e)=>{navigate(`/regScore/${stu.stuNum}`)}}>입력</button>
                </td>
              </tr>
              );
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default Score