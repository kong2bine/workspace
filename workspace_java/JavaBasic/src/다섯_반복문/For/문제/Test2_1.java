package 다섯_반복문.For.문제;
//2024.6.4 3교시
/*
1. 1이상 100 미만의 정수 중에서 7의 배수와 9의 배수를 출력하는 프로그램을 작성하여라.
단, 7의 배수이면서 동시에 9의 배수인 수는 한 번만 출력하여야 한다.
*/

public class Test2_1 {
    public static void main(String[] args) {
        for(int i = 1; i<100; i++){
            if(i%7==0 || i % 9 ==0){
                System.out.println(i);

            }
        }
    }
}
