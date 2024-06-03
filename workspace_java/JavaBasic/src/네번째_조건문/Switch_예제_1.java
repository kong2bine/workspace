package 네번째_조건문;

//2024.06.03 4교시

import java.util.Scanner;

public class Switch_예제_1 {
    public static void main(String[] args) {
        //키보드로 정수 하나를 입력받아,
        //입력받은 값이 짝수이면 '1' 출력
        //혹수면 '2'출력
        //switch case break로 해결

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int mod = num % 2;
        //ㄴ이거 안만들고
        //ㄱ switch(num % 2)라고 바로 해도 됨
        switch(mod){
            case 0:
                System.out.println(1);
                break;
            case 1:
                System.out.println(2);
                break;
            default:
                System.out.println(0);
            }

        }



    }
