package 여섯_배열.문제;

import java.util.Scanner;

public class Test_1_14_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test14(2);

    }

    public static void test14(int num){
        //삼항연산자
        //? 앞은 참 또는 거짓을 판단할 수 있는 조건
        //? 뒤는 앞에 있는 조건이 참일 떄 실행 할 조건
        //: 뒤 맨 앞에 있는 조건이 거짓일 때 나오는 것(?) 뭐더라ㅜㅜ
        int a = 10 > 5 ? 1: 2;

        if(num % 2 == 0){
            System.out.println("짝수");
        }
        else{
            System.out.println("홀수");
        }

        //ㄴ위의 if문을 삼항연산자로 표현하면
        // System.out.println(num % 2 ==0 ? "짝수" : "홀수");
    }

    //15번 메소드
    public static void test15(int a, int b){
        if(a%2==0 && b%2==0){
            System.out.println("둘 다 짝수");
        }
        else if (a % 2 !=0 && b % 2 !=0){
            System.out.println("둘 다 홀수");
        }
        else{
            System.out.println("하나만 짝수");
        }

    }
}
