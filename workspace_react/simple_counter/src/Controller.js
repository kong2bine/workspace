function Controller(props){
  console.log(2);

  return(
    <div className="box">
    <button type="button" value="-10" onClick={(e)=>{
      props.changeCount(e.target.value);
    }}>-10</button>
    <button type="button" value="-1" onClick={(e)=>{
      props.changeCount(e.target.value);
    }}>-1</button>
    <button type="button" value="+1" onClick={(e)=>{
      props.changeCount(e.target.value);
    }}>+1</button>
    <button type="button" value="+10" onClick={(e)=>{
      props.changeCount(e.target.value);
    }}>+10</button>
  </div>

  );
}

export default Controller;