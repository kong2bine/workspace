package 네번째_조건문;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        int x = 7;



        //x의 값이 7이면 '1' 출력, 그렇지 않으면 '2' 출력
        //만약에
        if(x==7){
            System.out.println(1);
        }
        //그렇지 않으면(그 밖에 모두 다)
        else{
            System.out.println(2);
        }

        //if와 else가 동시 실행되는 경우는 없음

        System.out.println("프로그램 종료");
    }
}
