package IF_문제_2;
//2024.5.31 8교시
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int max, mid, min;

        System.out.println("첫번째 수");
        a = sc.nextInt();
        System.out.println("두번째 수");
        b = sc.nextInt();
        System.out.println("새번째 수");
        c = sc.nextInt();

        //a가 가장 큰 수라면
        if(a>b && a>c){
            max = a;
            if(b>c){
                mid = b;
                min = c;
            }
            else{ //c>b
                min = c;
                mid = b;
            }
        }
        //b가 가장 큰 수라면
        else if(b>a && b>c){
            max = b;
            if(a>c){
                mid = a;
                min = c;
            }
            else{
                mid = c;
                min = b;
            }
        }
        //c가 가장 큰 수라면
        else{
            max = c;
            if(a>b){
                mid = a;
                min = b;
            }
            else{
                mid = b;
                min = a;
            }
        }

        System.out.println(max + ">" + mid + ">" +min);
    }
}
