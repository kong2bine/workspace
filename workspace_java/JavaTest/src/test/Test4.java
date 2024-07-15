package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~999 사이의 정수를 입력하시오>>");
        int num = sc.nextInt();

        //백의 자리
        int huns = num / 100;

        //십의 자리
        int tens = (num%100) / 10;

        //일의 자리
        int ones = num % 10;

        int clapCnt = 0;


        if(huns == 3 || huns==6 || huns == 9){
            clapCnt++;
        }

        if(tens == 3 || tens ==6 || tens==9){
            clapCnt++;
        }

        if(ones == 3 || ones ==6 || ones==9){
            clapCnt++;
        }

        switch (clapCnt){
            case 1:
                System.out.println("박수 1번");
                break;
            case 2:
                System.out.println("박수 2번");
        }

    }

}


