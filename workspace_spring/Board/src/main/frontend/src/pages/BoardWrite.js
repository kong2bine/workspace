import axios from 'axios'
import React, { useState } from 'react'
import * as boardApi from '../apis/boardApi'
import { useNavigate } from 'react-router-dom'

const BoardWrite = ({loginInfo}) => {
  const navigate = useNavigate();

  //글 등록 시 가져갈 데이터
  const [insertData, setInsertData] = useState({
    memId : loginInfo.memId,
    title : '',
    content : ''
  })

  function changeInsertData(e){
    setInsertData({
      ...insertData,
      [e.target.name] : e.target.value
    });
  }
  
  function regBoard(){
    // axios
    // .post('/board/insert', insertData)
    boardApi.insertBoard(insertData)
    .then((res)=>{
      alert('글 등록 완료')
      navigate('/')
    })
    .catch((error)=>{
      alert('글 등록 오류🤢')
      console.log(error)
    })
  }

  return (
    <div>
      <div>
        제목 <input type='text' name='title'onChange={(e)=>{changeInsertData(e)}}/>
      </div>
      <div>
        내용 <textarea name='content' onChange={(e)=>{changeInsertData(e)}}></textarea>
      </div>
      <button className='btn' type='button' onClick={(e)=>{regBoard()}}>글등록</button>
    </div>
  )
}

export default BoardWrite