import React from 'react'

const LoginForm = () => {
  return (
    <div>
        <table>
        <tbody>
          <tr>
            <td>아이디</td>
            <td><input type='text'></input></td>
          </tr>
          <tr>
            <td>비밀번호</td>
            <td><input type='password'></input></td>
          </tr>
          </tbody>
        </table>
        <button className='btn-div' type='button'>로그인</button>      
    </div>
  )
}

export default LoginForm