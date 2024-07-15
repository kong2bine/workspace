import { useNavigate } from 'react-router-dom';
import './BoardList.css'

//게시글 목록 컴포넌트
const BoardList = ({board_list})=>{

  //여기서 navigate는 변수가 아닌 함수임!
  //선언시에는 상관없지만 사용할 때는 navigate(); 이렇게 써야 함.
  const navigate = useNavigate();


  return(
    <>
  <table>
    <thead>
      <tr>
       <td>글번호</td>
       <td>제 목</td>
       <td>작성자</td>
       <td>작성일</td>
      </tr>
    </thead>
    <tbody>
      {
        board_list.map((board, i)=>{
          return(
          <tr key={i}>
            <td>{board.boardNum}</td>
            {/* Link로 하는 방법
                <Link to = '/datail'> */}
            <td><span onClick={(e)=>{
              navigate(`/detail/${board.boardNum}`)
            }}>{board.title}</span></td>
            <td>{board.writer}</td>
            <td>{board.createDate}</td>
          </tr>
          );
        })
      }
    </tbody>
  </table>
  <button type="button" onClick={(e)=>{navigate('/writeForm')}}>글쓰기</button>
  </>
  );
}

export default BoardList