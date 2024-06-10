package class_basic;
//2024.6.10 4교시

//좋은 클래스의 여건
//1.멤버변수는 반드시 초기값을 설정
//2. 초기값 설정은 멤버변수의 선언과는 별도로 진행

//생성자 : 선언한 변수의 값을 초기화 할 용도로 사용
//문법
/*
    public 클래스명(){

    }
*/
//클래스 안에는 반드시 생성자가 존재해야 함!!
/*만약 클래스 안에 생성자를 하나도 선언하지 않았다면 눈에 보이지 않는
기본 생성자를 자동으로 만들어 줌(내용도 없고, 매개변수도 없는 생성자)*/
//기본 생성자의 형태 : public Account(){}
//ㄴ생성자가 호출은 되나 아무것도 나타나지 않음
//생성자는 필요에 따라 여러개 만들 수 있음


public class Account {
    String accNumber;
    String owner;
    int money; //예금액

    //생성자(변수의 초기화)
    //생성자의 이름은 클래스명과 동일하게 작성. 리턴타입x
    public Account(){
        accNumber = "미정";
        owner = "미정";
        money = 10000;
    }

    public Account(int a){
        money = a;

        Account acc1 = new Account();
    }

    //모든 변수의 값을 초기화하는 메소드
    public void setAccount(String accNumber, String owner, int money){
        //this.xx : 이 클래스에서 선언한 xx
        this.accNumber = accNumber;
        this.owner = owner;
        this.money = money;
    }

    public void printAccount(){
        System.out.println("계좌 번호 : " + accNumber);
        System.out.println("계좌주 : " + owner);
        System.out.println("예금액 : " + money);
        //ㄴSystem.out.println("예금액 : "+this.money);라고 작성 가능
        // 위 출력문은 (this)가 생략된 형태
    }

}
