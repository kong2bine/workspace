//item_list는 현재 쇼핑몰에서 판매하고 있는 상품들의 목록 정보이다.
//아래 데이터를 참고하여 요구사항을 해결하시오.
const item_list = [
  {
    item_name : '여름 셔츠',
    price : 25000,
    brand : 'java마켓',
    size : [90, 100, 110]
  },
  {
    item_name : '라운드 티',
    price : 20000,
    brand : 'java마켓',
    size : [90, 95, 100, 105, 110]
  },
  {
    item_name : '데님 청바지',
    price : 30000,
    brand : 'python마켓',
    size : [90, 100, 110, 120]
  },
  {
    item_name : '슬림 면바지',
    price : 35000,
    brand : 'python마켓',
    size : [90, 95, 100]
  }
];

//1. 'java마켓'에서 팔고 있는 상품들의 상품명과 가격을 각각 콘솔창에 출력하여라.
for(let i = 0; i<item_list.length; i++){
  console.log(item_list[i].item_name);
}
for(let e = 0; e<item_list.length; e++){
  console.log(item_list[e].price);
}

//2. 95사이즈를 구매할 수 있는 상품들의 상품명을 콘솔창에 출력하시오.
item_list.forEach((lists)=>{
  if(lists.size.includes(95)){
    console.log(lists.item_name);
  }
})





//3. '등록 및 출력' 버튼을 클릭하면 입력 내용 저장 후 콘솔창에 데이터를 출력하시오.
function addItem(){
    alert("상품명을 입력하시오");
     

}
