package 세번째_연산자;

import java.util.Scanner;

/*
키보드로 이름, 국어점수, 영어점수, 수학점수를 입력받는다.
단, 점수들은 정수만 입력한다고 가정한다.
모든 정보를 입력받은 후
입력받은 이름, 국어점수, 영어점수, 수학점수와 총점 및 평균을 출력
*/
public class 연습문제 {
    public static void main(String[] args) {
        //변수 선언
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("국어점수 : ");
        int korScore = sc.nextInt();
        System.out.print("영어점수 : ");
        int engScore = sc.nextInt();
        System.out.print("수학점수 : ");
        int mathScore = sc.nextInt();
        int totalScore;
        double avg;

/*        System.out.print("이름 입력 : ");
        name = sc.next ();

        System.out.println("국어 점수 : ");
        korScore = sc.nextInt();
        System.out.println("영어 점수 : ");
        engScore = sc.nextInt();
        System.out.println("수학 점수 : ");
        mathScore = sc.nextInt();*/

        //총점&평균
        totalScore = korScore + engScore + mathScore;
        avg = totalScore / 3.0;

        //결과 출력
        System.out.println();
        System.out.println("----------입력 결과---------");
        System.out.println("이름 : " + name);
        System.out.println("국어점수 : " + korScore);
        System.out.println("영어점수 : " + engScore);
        System.out.println("수학점수 : " + mathScore);
        System.out.println("총점 : " + totalScore);
        System.out.println("평균 : " + avg);

    }

    }

