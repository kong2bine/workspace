package exception;
//2024.6.18 1교시

import java.util.Scanner;

//예외처리
/*
    예외처리 문법
    try{
        예외가 발생할 수 있는 코드 작성
    }catch(Exception e){
        예외 발생 시 실행 코드
    }finally{ ->생략 가능
        예외가 발생하든, 하지 않든, 무조건 실행할 코드
    }
 */
public class Exception_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("첫번째 : ");
            int a = sc.nextInt();
            System.out.print("두번째 : ");
            int b = sc.nextInt();

            System.out.println(a/b);
        }catch (Exception e) { //예외에 대한 정보가 들어있는 클래스
            System.out.println("오류 발생!!");
            //ㄱ예외 발생 이유를 문자열로 간략히 전달
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}
