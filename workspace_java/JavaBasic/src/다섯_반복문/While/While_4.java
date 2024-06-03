package 다섯_반복문.While;

public class While_4 {
    public static void main(String[] args) {

        //아래는 1부터 5까지의 합을 구하는 코드
        int i = 1; //반복 시작점
        int sum = 0; //1~5까지의 합을 저장할 변수

        while(i<6){
            sum = sum +i;
            i++;
        }
    }
}
