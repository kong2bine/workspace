import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom"

const RegStu=()=>{

  const navigate = useNavigate();
  const[stuInfo, setStuInfo] = useState({
    stuName : '',
    stuAge : '',
    stuTell : '',
    stuAddr : ''  
  })

  function changeStuInfo(e){
    setStuInfo({
      ...stuInfo,
      [e.target.name] : e.target.value
    });
  }

  function insertBoard(){
    //이름 입력 확인
    const nameInput = document.querySelector('input[name="stuName"]')
    if(nameInput.value == ''){
      alert('이름을 입력하세요')
      nameInput.focus();
      return;
    }    
    axios
    .post('/regStu',stuInfo)
    .then((res)=>{
      alert('학생을 등록했습니다.')
      navigate('/');
    })
    .catch((error)=>{
      alert('오류')
      console.log(error)
    })

  }

  return(
    <div>
      이름 <input name="stuName" onChange={(e)=>{changeStuInfo(e)}}></input><br/>
      나이 <input name="stuAge" onChange={(e)=>{changeStuInfo(e)}}></input><br/>
      연락처 <input name="stuTell" onChange={(e)=>{changeStuInfo(e)}}></input><br/>
      주소 <input name="stuAddr" onChange={(e)=>{changeStuInfo(e)}}></input><br/><br/>
      <button type="button" onClick={(e)=>{insertBoard()}}>글쓰기</button>
    </div>
  )

}

export default RegStu