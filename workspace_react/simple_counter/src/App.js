import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Viewer from './Viewer';
import Controller from './Controller';

// 2024.7.8
function App(){
  console.log(1);
  let[count, setCount] = useState(0);

  function changeCount(num){
    //console.log(num);
    const result = count + Number(num);
    console.log(result);

    setCount(result);
  }

  return(
    <div className="App">
      <h2>Simple Counter</h2>
      <Viewer count={count}/>
      <Controller changeCount={changeCount}/>
    </div>
  );

}


export default App;
