import { useNavigate, useParams } from "react-router-dom";
import BoardList from "./BoardList";

// const Aaa=({넘어오는 데이터 이름})=>{}
const Detail=({board_list})=>{
  const navigate = useNavigate();

  //url로 넘어오는 데이터 받기
  const params = useParams();
  const boardNum = params.boardNum;

  let board = null;
  for(const e of board_list){
    if(e.boardNum == boardNum){
      board = e;
    }
  }



  
  return(
    <div>
      <h3>게시글 상세 정보</h3>
     <div>글 번호 : {board.boardNum}</div>
     <div>제목 : {board.title}</div>
     <div>내용 : {board.content}</div>
     <div>작성자 : {board.writer}</div>
     <div>작성일 : {board.createDate}</div>
      <button type="button">뒤로가기</button>
      <button type="button" onClick={(e)=>{
        board_list.forEach((board, i) => {
          if(board.boardNum == boardNum){
            board_list.splice(i,1);
            //ㄴ i : 몇번째 반복인지...
          }
        });
        //board_list.splice(?,1);

      navigate('/')
      }}>삭제</button>
    </div>
  )
}

export default Detail