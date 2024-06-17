package collection.list.test;
//2024.6.14 6교시

import java.util.ArrayList;
import java.util.List;

public class Test_1_4 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();

       //1~100 사이의 랜덤 정수 10개를 리스트에 저장
        for(int i =0; i<10; i++){
            int rand = (int)(Math.random() * 100 +1);
            list.add(rand);
        }

        //리스트에 저장된 짝수의 개수 및 모든 짝수 출력
        int cnt = 0;
        for(int e : list){
            if(e % 2 ==0){
                cnt++;
                System.out.println(e);
            }

        }
        System.out.println("cnt : " + cnt);

    }
}
