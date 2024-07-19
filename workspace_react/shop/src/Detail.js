import { useParams } from 'react-router-dom';
import './Detail.css'
import ItemList from './ItemList';
import { useEffect, useState } from 'react';

const Detail=({item_list})=>{
  //url로 전달되는 데이터 받기
  //1번 방식
  const params = useParams();
  console.log(params);
  // console.log(params.id);

  //2번 방식
  const{id}= useParams();
  //console.log(`전달된 상품번호 : ${id}`)
  //console.log(ItemList);

  let findItem = null;
  
  item_list.forEach((item, i)=>{
    if(item.itemNum == id){
      findItem = item;
    }
  })

  //useEffect();
  //컴포넌트의 라이프사이클(생애주기) 사이에 필요한 기능 추가

  //컴포넌트의 상태 3가지
  //mount : 최초에 컴포넌트가 생성됐을 때
  //update : 컴포넌트가 재랜더링되는 상태
  //unmount : 컴포넌트가 사라질 때

  const [num, setNum] =useState(0);
  const [num1, setNum1] =useState(0);

  //해당 컴포넌트가 랜더링되면 마지막에 실행됨 : mount되면 실행
  //mount(컴포넌트를 새로 읽을 때)+ update(재랜더링) 될 때 실행
  //useEffect의 두번째 매개변수(dependency)가 없으면  mount+upadate될 때 실헹
  useEffect(()=>{
    console.log(1);
  });

  //mount(컴포넌트를 새로 읽을 때) 될 때 실행
  //두번째 매개변수로 빈 배열을 전달하면 mount 될 때만 시행됨
  useEffect(()=>{
    console.log(2);
  },[]);

  //두번째 매개변수에 배열 형태로 state변수를 넣으면 
  //해당 ㄴuseEffect는 mount + 배열에 넣은 state값이 변경되어 재랜더링 될 때 실행
  useEffect(()=>{
    console.log(3);
  },[num]);

  useEffect(()=>{
    console.log(4);
  },[num, num1]);
  
  useEffect(()=>{
    console.log(5);

    return ()=>{
      console.log(6)
      //useEffect 안 return 값은 mount될 때 실행x
      //update 시 실행 & 가장 먼저 실행됨
      //return에 들어간 값은 unmount될 때도 실행됨
    };  
  },[num]);

  //언마운트 될 때만 7 출력
  useEffect(()=>{
    return()=>{
      console.log(7)
    }
  },[]);

  return(
    <>
      <button type='button' onClick={(e)=>{
        setNum(num+1);
      }}>num값 변경</button>
      <div>num = {num}</div>

      <button type='button' onClick={(e)=>{
        setNum1(num1+1);
      }}>num1값 변경</button>
      <div>num1 = {num1}</div>



      <div className="item-info">
        <div>
        <img src={process.env.PUBLIC_URL + '/' + findItem.imgName}/>
        </div>
        <div>
          <h4>{findItem.itemName}</h4>
          <p>{findItem.itemNum}</p>
          <button type="button">주문하기</button>
        </div>
      </div>
      <div className='intro'>
        상품소개입니다
      </div>
    </>
  )
}

export default Detail;