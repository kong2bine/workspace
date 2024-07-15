import { useParams } from 'react-router-dom';
import './Detail.css'
import ItemList from './ItemList';

const Detail=({item_list})=>{
  //url로 전달되는 데이터 받기
  //1번 방식
  const params = useParams();
  console.log(params);
  // console.log(params.id);

  //2번 방식
  const{id}= useParams();
  console.log(`전달된 상품번호 : ${id}`)
  console.log(ItemList);

  let findItem = null;
  
  item_list.forEach((item, i)=>{
    if(item.itemNum == id){
      findItem = item;
    }
  })

  

  return(
    <>
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