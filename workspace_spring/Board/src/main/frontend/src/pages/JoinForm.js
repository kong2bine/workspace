import React, { useState } from 'react'
import './JoinForm.css'
import * as memberApi from '../apis/memberApi'
import { useNavigate } from 'react-router-dom'

const JoinForm = ()=>{
  const navigate = useNavigate();
  //버튼 활성화 여부 state 변수
  const [isDisabled, setIsDisabled] = useState(true);

  //회원가입 시 가져가야하는 데이터를 저장할 state 변수
  const [joinData, setJoinData] = useState({
    memId :'',
    memPw :'',
    confirmPw : '',
    memName :'',
    gender :'male'
  });

  //input 태그에 값 입력 시 joinData 변경
  function changeJoinData(e){
    //아이디 input 태그의 값이 변경되면 회원가입 버튼을 비활성화
    if(e.target.name == 'memId'){
      setIsDisabled(true);
    }

    setJoinData({
      ...joinData,
      [e.target.name] : e.target.value
    });
  }

  //아이디 중복 확인 함수
  function checkId(){
    //아이디 미입력시
    if(joinData.memId == ''){
      alert('아이디 입력💢😡🤬')
      return ;
    }
    //아이디 값을 가지고 자바로 가서 중복 확인 쿼리를 실행
    memberApi.checkId(joinData.memId)
    .then((res)=>{
        //true-> 아이디 사용 불가능
        //false-> 아이디 사용 가능
      const result = res.data;

      if(result){
        alert('❗아이디 중복입니다❗')
      }
      else{
        alert('사용가능(╹ڡ╹ )')
      }
      //ㄴ 삼항연산자로 쓰면 -> alert(result ? 'ID중복' : '사용가능');

      //사용 가능한 id면 버튼 활성화
      if(!result){
        setIsDisabled(false);
      }

    })
    .catch((error)=>{
      alert('아이디 입력💢💢😡🤬')
      console.log(error)
    })
  }

  //회원가입 버튼 클릭 시 실행
  function join(){
    //validation 처리(유효성 검사)
    if(joinData.memPw != joinData.confirmPw){
      alert('입력한 비밀번호가 일치하지 않습니다')
      return ;
    }

    //아이디 4~8글자
    const idLength = joinData.memId.length;
    if(idLength<4 || idLength >10){
      alert('아이디는 4~10 글자로 입력해야 합니다')
      return;
    }


    //회원가입
    memberApi.join(joinData)
    .then((res)=>{
      alert('회원가입 완료😎')

      //로그인페이지로 이동
      navigate('/loginForm')


    })
    .catch((error)=>{
      console.log(error);
    });
  }

  return(
    <div className="join-div">  
      <div>
        <p>아이디</p>
          <div className='id-area'>
            <input className='inp' type='text' 
            name='memId'onChange={(e)=>{changeJoinData(e)}}/>
            <button className='btn' onClick={(e)=>{checkId()}}>중복확인</button>
          </div>
      </div>
      <div>
        <p>비밀번호</p>
        <input className='inp' type='password' 
        name='memPw' onChange={(e)=>{changeJoinData(e)}}></input>
      </div>
      <div>
        <p>비밀번호 확인</p>
        <input className='inp' type='password'
        name='confirmPw' onChange={(e)=>{changeJoinData(e)}}></input>
      </div>
      <div>
        <p>이름</p>
        <input className='inp' type='text'
        name='memName' onChange={(e)=>{changeJoinData(e)}}></input>
      </div>
      <div className='gender-div'>
        <div><span>성별</span></div>
        <div>
          <input type='radio' name='gender'value="male"
           onChange={(e)=>{changeJoinData(e)}}
           //onClick={(e)=>{changeJoinData(e)}} 
           checked={joinData.gender == 'male'}
           />남
        </div>
        <div>
          <input type='radio' name='gender'value="female" 
          onChange={(e)=>{changeJoinData(e)}}
          //onClick={(e)=>{changeJoinData(e)}}
          checked={joinData.gender == 'female'}
          />여
        </div>
      </div>
      <div>
      <button type='button' className='btn' 
      onClick={join} disabled={isDisabled}>회원가입</button>

      </div>
      
    </div>
  )
}
export default JoinForm