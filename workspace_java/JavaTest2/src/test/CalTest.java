package test;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculate cal = new Calculate();

        System.out.println("첫 번 째 수 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번 째 수 : ");
        int num2 = sc.nextInt();

        cal.setNumber(num1, num2);

        System.out.println("두 정수의 합 : " + cal.getSum());

        System.out.println("두 정수 중 큰 수 : " + cal.getMax() );

        System.out.println("두 정수 사이의 정수들의 평균 : " +cal.getAvg() );

    }
}
