package 복습;
//2024.7.15

//메서드: 반복되서 사용되는 내용을 하나의 기능으로 정의
//메서드 사용 :  메서드의 정의, 메서드의 호출
//메서드의 정의 : 클래스 안, 다른 메서드의 밖에서 작성
public class Retry_메서드 {
    public static void main(String[] args) {
        System.out.println("hello~");
        System.out.println("hello~");
        System.out.println("hello~");

        //메서드의 호출
        //정의한 메서드명과 일치해야 호출할 수 ㅇ
        //정의한 메서드명과 매개변수 정보를 일치시켜야 함
        //매개변수 정보: 매개변수의 수, 매개변수의 자료형
        sayHello();
        sayHello();
        sayHello();
    }

    //메서드의 정의
    //접근제한자 리턴타입 메서드명(매개변수들){
    //      실행할 내용
    // }
    public static void sayHello(){
        System.out.println("hello");
    }
}
