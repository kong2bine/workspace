package IF_문제_1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 8;
        int b = 3;

        if(a>b){
            System.out.println("a가 큽니다.");
        } else if (b>a) {
            System.out.println("b가 큽니다.");
        }
        else{
            System.out.println("같습니다.");
        }
    }
}
