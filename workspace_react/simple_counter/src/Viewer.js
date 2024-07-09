// 2024.7.8

//Viewer컴포넌트
function Viewer(props){
  return(
    <div className="box">
      <h3>현재카운터</h3>
      <p>{props.count}</p>
    </div>
  )

}

export default Viewer;
//export default 컴포넌트명 : 내보내기
// ㄴ Viewer라는 컴포넌트를 다른 곳에서도 쓸 수 있게함