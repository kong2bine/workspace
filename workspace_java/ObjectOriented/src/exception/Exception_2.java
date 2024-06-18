package exception;
//2024.6.18 1,2교시

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("첫번째 : ");
            int a = sc.nextInt();
            System.out.print("두번째 : ");
            int b = sc.nextInt();

            System.out.println(a/b);
        }catch (ArithmeticException exception){
            //Exception클래스는 모든 exception클래스의 부모 클래스다.
            //ㄴArithmeticException,InputMismatchException,NullPointerException 등
            System.out.println("수학적 오류 발생~");
        }catch (InputMismatchException e){
            System.out.println("입력 자료형 불일치!");
        }


        System.out.println("프로그램 종료");
    }
}
