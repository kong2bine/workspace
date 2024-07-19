import axios from "axios";
import { useEffect, useState } from "react"
import { getStuList } from "./apis";

const DelStu=()=>{

  const[stuList, setStuList] = useState([]);

  useEffect(()=>{

    getStuList()
    .then((res)=>{
      setStuList(res.data);
  
    })
    .catch((error)=>{
      alert('오류!!!')
      console.log(error)
    })
  },[])

  function deleteStu(stuNum){
    axios
    .delete(`/deleteStudent/${stuNum}`)
    .then((res)=>{
      alert('🗑⭕')

      //stuList라는 STATE 변수의 값을 변경한다 -> 재랜더링되면서 그림을 새롭게 그림
      //state 변수의 값은 state 변경 함수를 사용해서 변경!

      //데이터베이스에서 삭제한 학생 정보를 stuList 에서도 삭제
      stuList.forEach((stu,i)=>{
        if(stu.stuNum == stuNum ){
          stuList.splice(i,1);
        }
      });

      // const result = stuList.filter((stu)=>{return stu.stuNum != stuNum});
      // setStuList([...result]);

      // const arr = [1,2,3,4,5,6,7,8];
      // const result1 = arr.filter((num)=>{num>5});
      // const result2 = arr.filter((num)=>{num%2==0});


      
      setStuList([...stuList]);
    })
    .catch((error)=>{
      alert('🗑❌')
      console.log(error)
    })

  }


  return(
    <div>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>학생명</td>
            <td>삭제</td>
          </tr>
        </thead>
        <tbody>
          {
            stuList.map((stu,i)=>{
              return(
                <tr key={i}>
                  <td>{stuList.length-i}</td>
                  <td>{stu.stuName}</td>
                  <td><button type="button" onClick={(e)=>{deleteStu(stu.stuNum)}}>삭제</button></td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default DelStu