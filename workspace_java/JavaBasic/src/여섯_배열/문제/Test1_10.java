package 여섯_배열.문제;

import java.util.Scanner;

public class Test1_10 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("입력하세요");
        //int num = sc.nextInt();
        for(int i = 0; i< arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        for(int a = 0; a< arr1.length; a++){
            System.out.println(arr1[a]);
        }

    }
}
