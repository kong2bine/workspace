package IF_문제_1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 40;

//        Scanner sc =new Scanner(System.in);
//        System.out.println("숫자를 입력하시오.");
//        int num = sc.nextInt();

        if(num1 + num2 > 50){
            System.out.println("두 수의 합이 50보다 큽니다.");
        }
        else{
            System.out.println("두 수의 합이 50 이하입니다.");
        }

    }
}
