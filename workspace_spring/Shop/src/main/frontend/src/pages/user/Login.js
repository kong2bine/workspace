import axios from 'axios';
import React, { useState } from 'react'
import { json, useNavigate } from 'react-router-dom';
import Modal from '../../common/Modal';

const Login = (setLoginInfo) => {

  //Login 버튼 클릭 시 화면에 보여지는 모달창의 상태
  const [beforeLoginModla, setBeforeLoginModal] = useState(false)

  //login 쿼리가 실행된 후 보여지는 모달창의 상태
  const [afterLoginModal, setAfterLoginModal] = useState(false)

  //로그인 성공 실패 여부를 저장하는 변수
  const [isLoginSuccess, setIsLoginSuccess] = useState(false)


  //window.sessionStorage.setItem('member', JSON.stringify());

  const data = window.sessionStorage.getItem('member');
  console.log(data)
  console.log(data.memId);

 // const result = JSON.parse(data);
 //console.log(result);


  const navigate = useNavigate();

  const [loginData, setLoginData] = useState({
    memId : '',
    memPw : ''
  });

  //입력한 id,pw를 loginData에 저장하는 함수(입력할 때 마다 실행)
  function changeLoginData(e){
    setLoginData({
      ...loginData,
      [e.target.name] : e.target.value
    });
  }

  //login 버튼 클릭시 실행
  function successLogin(){
    //id,pw 입력 여부 확인
    if(loginData.memId == '' || loginData.memPw == ''){
      //모달창 상태를 보이게 변경
      setBeforeLoginModal(true);
      return ;   
    }

    axios.post('/api_member/login',loginData)
    .then((res)=>{
      setAfterLoginModal(true)
      //자바에서 null 데이터가 전달되면 res.data는 빈문자('')데이터로 변환함      
      if(res.data != ''){
        setIsLoginSuccess(false);        
        
        // alert('📖📗📘📚📙📔📖📕')

        // const loginInfo = {
        //   memId : res.data.memId,
        //   memName : res.data.memName,
        // //   memRole : res.data.memRole
        // }
        // //window.sessionStorage.setItem('loginInfo',JSON.stringify(loginInfo))
        // setLoginInfo(loginInfo);

        // navigate('/bookList')
      }

      else{ //로그인 성공시
        setIsLoginSuccess(true);
        // alert('ID / PW 확인🤢');
        const loginInfo ={
          memId : res.data.memId,
          memName : res.data.memName,
          memRole : res.data.memRole
        }
        
        //로그인 정보를 가진 객체를 문자열 형태로 변환
        //객체 ->문자열로 변환한 데이터를 JSON 데이터로 부른다
        const json_loginInfo = JSON.stringify(loginInfo);

        //sessionStorage에 로그인한 회원의 아이디, 이름, 권한정보 등록
        window.sessionStorage.setItem('loginInfo','hong')

      }
      setAfterLoginModal(true);
      
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  //login 쿼리 실행 후 뜨는 모달 안의 내용
  function drawModalContent(){
    return(
      <>
        {
          isLoginSuccess
          ?
          <div>📚WELCOME TO OUR BOOK SHOP📚</div>
          :
          <div>ID & PW 확인😡</div>
        }
      </>
    )
  }

  //login 쿼리 실행 후 뜨는 모달 안의 확인 버튼 클릭 시 실행되는 내용
  function handleBtn(){
    if(isLoginSuccess){//로그인 성공 시 확인 버튼 내용
      //로그인 성공 시 상품 목록 페이지로 이동
      navigate('/')
    }
  }

  return (
    <div className='login-table-div'>
      <table className='login-table'>
        <tbody>
          <tr>
            <td>아이디</td>
            <td>
              <input type='text' name='memId' placeholder='Input your ID' onChange={(e)=>{changeLoginData(e)}}></input>
              </td>
          </tr>
          <tr>
            <td>비밀번호</td>
            <td>
            <input type='password' name='memPw' placeholder='Input your password' onChange={(e)=>{changeLoginData(e)}}></input>
            </td>
          </tr>
        </tbody>
      </table>
      <button type='button' onClick={(e)=>{successLogin()}}>로그인</button>

      {/* login 중 id, pw 입력 여부 확인 모달창 */}
      {
        beforeLoginModla
        ?
        <Modal content={()=>{
          return(
            <div>ID, PW 필수 입력</div>
          )
        }}
            setIsShow={setBeforeLoginModal}
            clickCloseBtn={()=>{
              alert(1);
            }}/>
        :
        null
      }

      {/* 로그인 쿼리 실행 후 뜨는 모달 */}
      {
        afterLoginModal
        ?
        <Modal content={drawModalContent}
              setIsShow={setAfterLoginModal}
              clickCloseBtn={handleBtn}
        />
        :
        null
      }
    
    </div>

  )
}

export default Login