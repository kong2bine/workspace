package 다섯_반복문.For.문제;

public class Test1_7 {
    public static void main(String[] args) {
        int cnt=0;
        for(int i=1; i<101; i++){
            if(i%5==0){
                cnt++;
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println(cnt);
    }
}
