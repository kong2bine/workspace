package 다섯_반복문.For.문제;

public class Test1_6 {
    public static void main(String[] args) {
        int cnt = 0;
        for(int i=1; i<101; i++){
            if(i % 3 == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
