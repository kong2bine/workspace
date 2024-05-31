package IF_문제_2;
//2024.5.31 16:43
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int max; //큰 수를 저장
        int min; //작은 수를 저장

        System.out.print("첫번째 수 :");
        int num1 = sc.nextInt();
        System.out.print("두번째 수 :");
        int num2 = sc.nextInt();

        if (num1>num2){
            max = num1;
            min = num2;
        }
        else{
            max = num2;
            min = num1;
        }
        System.out.println(max + ">" + min);

    }
}
