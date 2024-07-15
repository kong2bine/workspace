package test;

import java.util.ArrayList;
import java.util.Scanner;
//2024.7.12

public class Test5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //문제 1~9까지 랜덤 정수 중복 없이 저장
        int[] baseaball = new int[3];

        for (int i = 0; i<baseaball.length; i++){
            int rand = (int)(Math.random() * 9 + 1);
            baseaball[i] = rand;

            //중복 검사
            for (int j = 0; j<i; j++){
                if(baseaball[j] == baseaball[i]){
                    i--;
                    break;
                }
            }

        }

        //대답
        int[] answer = new int[3];

        System.out.println();
        System.out.println("게임을 시작합니다");



        int tryCnt = 0;
        while(true){
            tryCnt++;
            System.out.print(tryCnt + " >> ");

            answer[0] = sc.nextInt();
            answer[1] = sc.nextInt();
            answer[2] = sc.nextInt();

            // 정답 대조
            //baseball = [5,1,2]
            //answer = [1,2,3]
            int strike = 0;
            int ball = 0;
            for (int i =0; i<baseaball.length; i++){
                for(int j =0; i<answer.length; j++){
                    if(baseaball[i] == answer[j] && i==j){
                        strike++;
                    }
                    else if(baseaball[i] == answer[j] && i==j){
                        ball++;
                    }
                }
            }
            System.out.println(strike + "S" + ball + "B");
            if(strike == 3){
                break;

            }

        }
        System.out.println(tryCnt + "횟수만에 맞췄습니다.");

    }
}
