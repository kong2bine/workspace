import { useNavigate } from "react-router-dom";

const Item=({item})=>{
  console.log(item);
  //navigate는 함수
  //navigate 변수는 이렇게
  //navigate(); 함수는 이렇게 써야함
  //navigate('이동할 url');
  //navigate('-1'); -> 한 페이지 뒤로 가기
  //navigate('2'); -> 두 페이지 앞으로 가기
  const navigate = useNavigate();

  return(
    <div className="book-name">
    <img onClick={(e)=>{
      navigate(`/detail/${item.itemNum}`);
    }} src={process.env.PUBLIC_URL + '/' + item.imgName}/>
    <h3>{item.itemName}</h3>
    <p>{item.price}</p>         
  </div>
    
  );
}
export default Item;

//리액트는 페이지 이동x
//단, 페이지 이동처럼 보이게 할 수 ㅇ