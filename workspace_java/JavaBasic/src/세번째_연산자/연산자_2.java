package 세번째_연산자;

//2024.5.30 6교시
public class 연산자_2 {
    public static void main(String[] args) {
        // '!'부정연산자: 참 또는 거짓의 결과를 반대로 만듦.
        boolean b1 = true;
        System.out.println(b1);
        System.out.println(!b1);

        b1 = !b1;
        System.out.println(b1);

        //대입연산자
        int num = 5;

        //num변수의 값을 1 증가
        System.out.println(num = num + 1);

        num = num + 1;
        num += 1;
        //위 두개 같은 말임
        System.out.println(num); //8

        num -= 10; // num = num -10;
        num *= 3; //num =num * 3;

    }
}
