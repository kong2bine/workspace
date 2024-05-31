package 네번째_조건문;

import java.util.Scanner;

public class If_3 {
    public static void main(String[] args) {
        //키보드로 정수 하나를 입력 받아,
        //입력받은 수가 양수면 '1'
        //음수면 '2'
        //0이면 '0'출력

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 :");
        int num = sc.nextInt();

        if(num>0){
            System.out.println(1);
        }
        //그렇지 않고 만약에
        //if와 else 사이에만 쓸 수 있음
        else if (num<0) {
            System.out.println(2);
        }
        else{
            System.out.println(0);
        }
    }
}
