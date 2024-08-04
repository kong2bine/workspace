import axios from 'axios';
import React, { useRef, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import * as memberApis from '../../apis/memberApis'
import './Join.css'
import { useDaumPostcodePopup } from 'react-daum-postcode';
import Modal from '../../common/Modal';

const Join = () => {
  const navigate =useNavigate();
  // 버튼 활성화 여부
  const [isOk, setIsOk] = useState(true);
  //daum 주소 api 팝업창을 띄우기 위한 변수
  const open = useDaumPostcodePopup();

  //주소 검색 팝업창이 닫힐 때 실행되는 함수
  function handleComplete(data){
    //우편주소
    console.log(data.zonecode);
    //도로명주소
    console.log(data.roadAddress);

    //input태그에 검색한 내용 넣어주기
    setJoinData({
      ...joinData,
      post : data.zonecode,
      memAddr : data.roadAddress
    });
  }

  //검색버튼 클릭 시 실행되는 함수
  function handleClick(){
    open({onComplete : handleComplete});
  }


  //input태그를 참조하는 변수
  const email_1 = useRef();
  const email_2 = useRef();

  //회원 가입 쿼리 시 가져갈 데이터
  const [joinData, setJoinData] = useState({
    memId : '',
    memPw : '',
    confirmPw : '',
    mamName : '',
    memTel : '',
    post : '',
    memAddr : '',
    memDetail : '',
    memEmail : ''
  });

  function changeJoinData(e){
    // 이메일 변경시(삼항연산자)
    // setJoinData({
    //   ...joinData,
    //   [e.target.name] : e.target.value != 'memEmail'
    //    ? e.target.value : 
    //    email_1.current.value + email_2.current.value
    // })

    //이메일 변경시
    if(e.target.name == 'memEamil'){
      setJoinData({
        ...joinData,
        [e.target.name] : email_1.current.value + email_2.current.value
      })      
    }
    else{
      setJoinData({
        ...joinData,
        [e.target.name] : e.target.value
      })
    }

  }

  //회원가입 버튼 클릭 시 insert 쿼리 실행하러 가기
  function join(){
  axios.post('/api_member/join',joinData)
  .then((res)=>{
    alert('🎉✨🎊🎀🎁')
    //모달창 띄워
    setIsShow(true)
  })
  .catch((error)=>{
    console.log(error)
  })
  }

  //모달창 랜더링 여부
  const [isShow, setIsShow] = useState(false);

  //모달창 안의 내용을 생성하는 함수
  function setModalContent(){
    return(
      <div>🌙 WELCOME TO OUR BOOK SHOP </div>
    )
  }

  //====================================내가 한거ㅎ 재확인 필수!!

  function changeJoinData(e){
    if(e.target.name == 'memId'){
      setIsOk(true);
    }

    setJoinData({
      ...joinData,
      [e.target.name] : e.target.value
    });
  }

  //아이디 중복 확인 함수
  function checkId(){
    alert('ID 입력😐')
    return ;
  }

  //아이디 값을 가지고 자바로 가서 중복 확인 쿼리 실행
  memberApis.checkId(joinData.memId)
  .then((res)=>{
    const result = res.data;
    alert(result ? 'ID 중복' : '사용가능')

    //사용 가능한 ID 입력시
    if(!result){
      setIsOk(false);
    }

  })
  .cath((error)=>{
    alert('오류!!')
     console.log(error)   
  })

  //회원가입 버튼 클릭 시
  function join(){
    if(joinData.memPw != joinData.confirmPw){
      alert('비밀번호 재확인')
      return ;
    }    
  }

  //회원가입
  axios.post(joinData)
  .then((res)=>{
    alert('로그인 성공🎉✨🎊')
    
    navigate('/loginForm')
  })
  .catch((error)=>{
    console.log(error)
  })



  return (
    <div className='join-div'>

      <div>
          <table className='join-table'>
            <tbody>
            <tr>
              <td>아이디</td>
              <td>
                <div className='inline-input'>
                  <input className='form-control' type='text' 
                  name='memId' onChange={(e)=>{changeJoinData(e)}}/>
                  <button className='btn btn-primary' type='button'
                   onClick={(e)=>{checkId()}}>중복확인</button>
                </div>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td><input className='form-control' type='password'
              name='memPw' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td>비밀번호 확인</td>
              <td><input className='form-control' type='password'
              name='memPw' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td>이름</td>
              <td><input className='form-control' type='text'
              name='memName' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td>연락처</td>
              <td><input className='form-control' type='text' placeholder='숫자만 입력하세요'
              name='memTel' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td rowSpan={3}>주소</td>
              <td>
               <div className='inline-input'>
                  <input value={joinData.post} className='form-control' type='text' placeholder='우편번호' readOnly={true} onClick={handleClick}
                  name='post' onChange={(e)=>{changeJoinData(e)}}/>
                  <button className='btn btn-primary' type='button'
                  onClick={handleClick}>검색</button>
               </div>
              </td>
            </tr>
            <tr>
              <td><input value={joinData.memAddr} className='form-control' type='text' placeholder='주소' readOnly={true} onClick={handleClick}
              name='memAddr' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td><input className='form-control' type='text' placeholder='상세주소'
              name='addrDetail' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
            <td>이메일</td>
              <td>
                <div className='inline-select'>
                  <input className='form-control' type='text' ref={email_1}
                  name='memEmail' onChange={(e)=>{changeJoinData(e)}}/>
                  <select className='form-control' ref={email_2}
                  name='memEmail' onChange={(e)=>{changeJoinData(e)}}>
                    <option value={'@naver.com'}>naver.com</option>
                    <option value={'@daum.net'}>daum.net</option>
                    <option value={'@google.com'}>google.com</option>
                  </select>
                </div>
              </td>
            </tr>
            </tbody>
          </table>
        

      </div>
     <div className='btn-div'>
        <button className='btn btn-success' type='button' onClick={(e)=>{join()}}>회원가입</button>
      </div>

      {/* 회원가입 성공시 열리는 모달 */}
      {
        isShow ? <Modal isShow={isShow} content={setModalContent} setIsShow={setIsShow}/>: null
      }

    </div>
  )
}

export default Join