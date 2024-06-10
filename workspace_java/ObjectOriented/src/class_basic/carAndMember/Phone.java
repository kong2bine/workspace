package class_basic.carAndMember;
//2024.6.10 5교시

//접근제한자 : 메서드나 멤버변수의 사용 범위를 제한하는 것
// 클래스, 메서드, 멤버변수에서 사용
//1. public : 프로젝트(현재 이 클래스(Phone)는 ObjectOriented 라는 프로젝트에서 작성되고 있음) 내에 존재하면 접근 가능
//2. default : 같은 패키지(지금 carAndMember 패키지에서 작성중) 내에 있으면 접근 가능
//3. protected : 일단 패스하고 상속에서 가르쳐 주실거임
//4. private : 변수 혹은 메서드가 선언된 클래스 안에서만 접근 가능

//멤버 변수에는 무조건 private - 밖에서 접근 못해버리게 하려고(직접 접근을 막기 위해)
//메서드는 무조건 public - 변수의 값을 읽는 메서드를 만들고, 우회로 접근해 만들게 하기 위해


public class Phone {
    int price;
    public String modelName;
    String brand;
    //ㄴ앞에 아무것도 적지 않는 것이 default 접근제한자임

    public Phone(){
        this.price = 0;
        this.modelName = "";
    }

    public void setPrice(int price){
        if(price < 0){
            this.price = 0;
        }
        else{
            this.price = price;
        }
    }
}
