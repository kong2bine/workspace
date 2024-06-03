package 다섯_반복문.While;
//2024.6.3 7교시

/*
    while(반복 조건){
        반복적으로 실행되는 내용
        반복문에 필요한 세가지
        1. 반복 시작점
        2. 반복 조건
        3. 반복 파기 조건
    }
*/
public class While_1 {
    public static void main(String[] args) {
        //반복 시작점
        int i = 1;
        //반복 조건
        while(i <=3){
            System.out.println(1);
            i++;//반복을 파기 할 조건
        }
    }
}
