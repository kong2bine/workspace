package 다섯_반복문.While.문제;

//1~100까지의 숫자 중 5의 배수인 수를 모두 출력하고,
//5의 배수인 수의 개수도 출력하되, while문을 사용하라

public class Test7 {
    public static void main(String[] args) {
        int i = 1;
        int cnt = 0;

        while(i<101){
            if(i % 5 ==0){
                cnt++;
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("5의 배수의 개수는 : " + cnt);

    }
}