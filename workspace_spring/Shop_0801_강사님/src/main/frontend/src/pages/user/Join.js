
import React from 'react'
import './Join.css'

const Join = () => {
  return (
    <div className='join-div'>
      <div>
        <table className='join-table'>
          <tbody>
            <tr>
              <td>아이디</td>
              <td>
                <div className='inline-input'>
                  <input className='form-control' type='text'/>
                  <button className='btn btn-primary' type='button'>중복확인</button>
                </div>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td>
                <input className='form-control' type='password'/>
              </td>
            </tr>
            <tr>
              <td>비밀번호 확인</td>
              <td>
              <input className='form-control' type='password'/>
              </td>
            </tr>
            <tr>
              <td>이름</td>
              <td>
              <input className='form-control' type='text'/>
              </td>
            </tr>
            <tr>
              <td>연락처</td>
              <td>
              <input className='form-control' type='text' placeholder='숫자만 입력하세요'/>
              </td>
            </tr>
            <tr>
              <td>주소</td>
              <td>
                <div className='inline-input'>
                  <input className='form-control' type='text' placeholder='우편번호'/>
                  <button className='btn btn-primary' type='button'>검 색</button>
                </div>
              </td>
            </tr>
            <tr>
              <td></td>
              <td>
                <input className='form-control' type='text' placeholder='주소'/>
              </td>
            </tr>
            <tr>
              <td></td>
              <td>
                <input className='form-control' type='text' placeholder='상세주소'/>
              </td>
            </tr>
            <tr>
              <td>이메일</td>
              <td>
                <div className='inline-select'>
                  <input className='form-control' type='text'/>
                  <select className='form-control'>
                    <option>naver.com</option>
                    <option>google.com</option>
                  </select>
                </div>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className='btn-div'>
        <button type='button' className='btn btn-primary'>회원가입</button>
      </div>
    </div>
  )
}

export default Join