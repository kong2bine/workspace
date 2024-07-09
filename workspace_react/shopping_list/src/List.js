function List(props){
  return(
    <div className="box">
    <h3>장보기 목록</h3>
    {
      props.list.map((item,i)=>{
        return (
          <div key={i} className="item=div">
            <span className="item">{item}</span>
            <button type="button" onClick={(e)=>{
              // [...] 전개연산자
              const copyList = [...props.list];              
              copyList.splice(i,1);
              props.setList(copyList);

              //위 세 줄 = 아래 두 줄
              //props.list.splice(i,1);
              //props.setList([...props.list]);

            }}>삭제</button>
          </div>
        ); 
      })
    }
  </div>
  )
}

export default List;