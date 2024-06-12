package 상속;
//2024.6.12 5교시

//메서드 오버라이딩(Overriding)
// ㄴ : 상속 관계에서 부모클래스의 메서드를 자식클래스에서 재정의 할 수 있음
public class Cake {
    public void eat(){
        System.out.println("케익을 먹습니다.");
    }
}

class CheeseCake extends Cake{
    public void eat(){
    //ㄴ오버라이딩 : 매개변수가 같음에도 불구하고 오류가 나지 않는 이유
        super.eat(); //부모 클래스의 eat()메서드 호출
        System.out.println("치즈케익을 먹습니다.");
    }

}