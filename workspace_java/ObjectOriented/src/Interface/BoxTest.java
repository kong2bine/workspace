package Interface;
//2024.6.14 3교시

//Wrapper클래스 : 기본 자료형을 클래스로 표현한 것
//래퍼클래스는 기본자료형처럼 사용하면 됨
//int -> Integer
//double -> Double
//boolean -> Boolean
//float -> Float

public class BoxTest {
    public static void main(String[] args) {
        //정수 10을 클래스화
        Integer a = Integer.valueOf(10);
        Integer c = 10;

        Box b = new Box();
        b.setBox(10); // 10 ->Integer 
    }
}
