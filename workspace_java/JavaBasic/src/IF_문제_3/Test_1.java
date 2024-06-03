package IF_문제_3;

import java.util.Scanner;

//2024.06.03 6교시
public class Test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 변의 길이 : ");
        int a = sc.nextInt();
        System.out.print("두번째 변의 길이 : ");
        int b = sc.nextInt();
        System.out.print("세번째 변의 길이 : ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && a+c>b){
            System.out.println("삼각형 가능");
        }
        else{
            System.out.println("삼각형 불가능");
        }
    }
}
