import React from 'react'
import axios from 'axios';

const regSales = () => {
  return (
    <div>
      구매자명 <input></input>
      색상<input></input>
      모델<input></input>
      연락처<input></input>
      <button type='button'>등록</button>
    </div>
  )
}

export default regSales