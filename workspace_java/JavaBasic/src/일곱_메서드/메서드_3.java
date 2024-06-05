package 일곱_메서드;
//2024.6.5 4교시

//매개변수(parameter) : 메서드 정의 부분의 소괄호 안에서 정의된 변수

public class 메서드_3 {
    public static void main(String[] args) {
        tellYourName("자바");
        tellYourName("홍");

        //tellYourName(5); 매개변수의 자료형 일치 필요!
    }

    public static void tellYourName(String name){ //String name = "00";가 실행되었구나
        System.out.println("제 이름은 " + name);
    }

}
