package 네번째_조건문;

/*
    점수를 키보드로 입력받음(정수)
    키보드로 입력 받은 점수가
    90 <= x <= 100 'A'출력
    80 <= x <= 89 'B'출력
    70 <= x <= 79 'C'출력
    x < 70 'D'출력
*/

import java.util.Scanner;

public class Switch_예제_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하시오 : ");
        int score = sc.nextInt();

        //정수와 정수의 연산결과는 무조건 정수
        switch(score / 10){
            case 9,10 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            default:
                System.out.println("D");


        }

    }
}
