import React from 'react'
import axios from 'axios';

const CarReg = () => {
  return (
    <div>
      <thead>
        🚗 차량등록
        <table>
          <tr>
            <td>제조사 <input></input></td>
            <td>모델명 <input></input></td>
            <td>차량가격 <input></input></td>
          </tr>          
        </table>
        <button type='button'>등록</button>
      </thead>
      <tbody>
        🚓차량목록
        <table>

        </table>
      </tbody>
    </div>
  )
}

export default CarReg