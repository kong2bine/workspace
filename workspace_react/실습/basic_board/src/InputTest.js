import { useState } from "react";

const InputTest =()=>{
    //input태그에 입력한 내용을 저장하는 변수
  const [inputData, setInputData] = useState('');
  const [inputData2, setInputData2] = useState('');

  const[stu,setStu] = useState({
    stuName : '',
    age : 0,
    score : 0,
    addr : ''
    //중복된 키 사용시 제일 마지막에 선언된 내용만 가지게 됨
  });
  
function changStu(e){
  setStu({
    ...stu,
    [e.target.name] : e.target.value
  });
} 

  return(

    <div>
      
      <div>
      이름 : <input type='text' onChange={(e)=>{
         console.log(e.target.value);          
         inputData = e.target.value;
          //변수말고 함수->setInputData();이거 써야 재랜더링 해줌
         setInputData(e.target.value);
       }}/> <br/>
  
       나이 : <input type='text' onChange={(e)=>{
         setInputData2(e.target.value);
         //e.target : 이벤트가 발생한 태그
       }}/>
     </div> 
  
     <div>
       학생명 : <input type='text' name='stuName' onChange={(e)=>{
         changStu(e);          
  
       }}/><br/>
       나이 : <input type='text' name='age' onChange={(e)=>{
         changStu(e);
       }}/><br/>
       점수 : <input type='text' name='score' onChange={(e)=>{
         changStu(e);
       }}/><br/>
       주소 : <input type='text' name='addr' onChange={(e)=>{
         changStu(e);
       }}/><br/>
     </div>
  
     <div>
       이름 : {stu.stuName}<br />
       나이 : {stu.age}<br />
       점수 : {stu.score}<br />
       주소 : {stu.addr}<br />
     </div>
     
    </div>


 
  );
}

export default InputTest