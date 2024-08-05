import React, { useRef, useState } from 'react'
import '../user/Join.css';
import { useDaumPostcodePopup } from 'react-daum-postcode';
import axios from 'axios';
import Modal from '../../common/Modal';
import { useNavigate } from 'react-router-dom';
import { joinValidate } from '../../validate/joinValidate'; 
import userEvent from '@testing-library/user-event';



const Join = () => {

  //버튼 활성화 여부
  const [isDisabled, setIsDisabled] = useState(true);

  //daum 주소 api 팝업창을 띄우기 위한 함수선언
  const open = useDaumPostcodePopup();
  
  //네비게이트
  const navigate = useNavigate();

  //주소 검색 팝업창이 닫힐 때 실행되는 함수
  function handleComplete(data){

    //우편번호
    console.log(data.zonecode);
    //도로명주소
    console.log(data.roadAddress);

    //input 태그에 검색한 내용 넣어주기!
    setJoinData({
      ...joinData,
      post : data.zonecode,
      memAddr : data.roadAddress
    })
  }

  //주소 검색버튼 클릭 시 실행되는 함수
  function handleClick(){
    open({onComplete : handleComplete});
  }

  // input 태그를 참조하는 변수
  const email_1 = useRef();
  const email_2 = useRef();


  //회원가입 쿼리 시 가져갈 데이터
  const [joinData, setJoinData] = useState({
    memId : '',
    memPw: '',
    confirmPw:'',
    memName:'',
    memTel:'',
    post:'',
    memAddr:'',
    addrDetail:'',
    memEmail:''
  });

  //태그를 참조할수있음
  const memId_valid_tag = useRef();  //아이디
  // <div ref={memId_valid_tag}></div> ** 이렇게 하는거보다 아래처럼 줄이는게 죠아

  const memName_valid_tag = useRef(); //이름
  const confirmPw_valid_tag = useRef();
  const memPw_valid_tag = useRef();
  const memTel_valid_tag = useRef();

  const valid_tag = [
    memId_valid_tag
    , memPw_valid_tag
    , confirmPw_valid_tag
    , memName_valid_tag
    , memTel_valid_tag
  ];

  //유효성 검사 결과를 저장하는 변수 
  let valid_result;


  // const valid_tag - useRef([]);

  // <div ref={valid_tag[0]}></div> -> 아이디
  // <div ref={valid_tag[1]}></div> -> 이름
  // 이렇게 배열로 하는게 편함

  //유효성 검사 결과를 저장하는 변수
  const[validResult, setValidResult] = useState();


  function changeJoinData(e){
    // 입력한 데이터
    const newData = {
      ...joinData,
        [e.target.name] : e.target.name !== 'memEmail' ? 
                                            e.target.value :
                                            email_1.current.value + email_2.current.value
    }

    // 입력한 데이터에 대한 validation 처리
    // validation 처리 : 모든 데이터가 유효한 데이터면 리턴 true
    const result = joinValidate(newData, valid_tag, e.target.name);
    setValidResult(result);

    // joinValidate(newData, memId_valid_tag, memName_valid_tag);
    // 배열안하면 이렇게 따로 입력해줘야함 ▲

    //유효성 검사 끝난 데이터를 joindata에 저장! 
    setJoinData(newData);

  }


  //회원가입 버튼 클릭 시 insert 쿼리 실행하러 가기
  function join(){
    //유효성 검사 결과가 false면 회원가입 로직 중지 
    if(!valid_result){
      alert('입력 데이터를 확인하세요.');
      return ;
    }

    axios.post('/api_member/join', joinData)
    .then((res)=>{
      //모달창 띄움
      setIsShow(true);

      //로그인 페이지 이동
      navigate('/login');
    })
    .catch((error)=>{
      console.log(error);
    })
  }

  //아이디 중복 확인 체크 
  function checkId(){
    if(joinData.memId == ''){
      alert('ID 입력')
      return ;
    }

     //아이디를 자바에서 중복 체크확인 쿼리.
    axios.post(joinData.memId)
    .then((res)=>{
      const result = res.data;
      alert(result ? 'ID 중복' : '사용가능');

      if(!result){
        setIsDisabled(false);
      }
    })
    .catch((error)=>{
      alert('아이디 중복 오류')
      console.log(error);
    });
  }

  //비밀번호 일치 확인



  //모달창 랜더링 여
  const [isShow, setIsShow] = useState(false);

  // 모달창 안의 내용을 생성하는 함수
  function setModalContent(){
    return(
      <div>
      <h3>✨ 모달창 ✨</h3>
        <hr/>
      <p>
        🌙 WELCOME TO OUR BOOK SHOP
      </p>
    </div>
    );
    
  }


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
                   onClick={(e)=>{}}>중복확인</button>
                </div>
                <div className='feedback' ref={memId_valid_tag}></div>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td><input className='form-control' type='password'
              name='memPw' onChange={(e)=>{changeJoinData(e)}}/>
              <div className='feedback' ref={memPw_valid_tag}></div>
              </td>
            </tr>
            <tr>
              <td>비밀번호 확인</td>
              <td><input className='form-control' type='password'
              name='memPw' onChange={(e)=>{changeJoinData(e)}}/>
              <div className='feedback' ref={confirmPw_valid_tag}></div>
              </td>
            </tr>
            <tr>
              <td>이름</td>
              <td>
                <input className='form-control' type='text'
              name='memName' onChange={(e)=>{changeJoinData(e)}}/>
              <div className='feedback' ref={memName_valid_tag}></div>
              </td>
            </tr>
            <tr>
              <td>연락처</td>
              <td><input className='form-control' type='text' placeholder='숫자만 입력하세요'
              name='memTel' onChange={(e)=>{changeJoinData(e)}}/>
              <div className='feedback' ref={memTel_valid_tag}></div>
              </td>
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
      <button className='btn btn-success' type='button' onClick={join}>회원가입</button>
    </div>

    {/* 회원가입 성공시 열리는 모달 */}
    {isShow ? <Modal isShow={isShow} content={setModalContent} setIsShow={setIsShow} /> : null}
  </div>
  )
}

export default Join