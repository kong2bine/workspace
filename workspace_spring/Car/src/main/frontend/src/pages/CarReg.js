import React from 'react'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const CarReg = () => {
  const navigate = useNavigate();
  return (
    <div>
        <div>🚗 차량등록</div>
          <div>제조사</div>
            <select>
              <option>현대</option>
              <option>기아</option>
              <option>쌍용</option>
            </select>
          <div>모델명 <input></input></div>
          <div>차량가격 <input></input></div>
          <button type='button'>등록</button>
      <tbody>
        <div>🚓차량목록</div>
        <table>
        </table>
      </tbody>
    </div>
  )
}

export default CarReg