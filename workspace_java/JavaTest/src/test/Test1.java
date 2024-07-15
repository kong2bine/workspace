package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("숫자를 입력하세요: ");
            numbers[i] = sc.nextInt();
        }


        int a = numbers[0], b = numbers[1], c = numbers[2];
        int num;

        if (a < b) { num = a; a = b; b = num; }
        if (a < c) { num = a; a = c; c = num; }
        if (b < c) { num = b; b = c; c = num; }

        System.out.println("큰 수부터 나열: ");
        System.out.println(a + " " + b + " " + c);
    }
}
