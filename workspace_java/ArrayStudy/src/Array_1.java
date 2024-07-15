import java.util.Scanner;

//2024.7.11 배열의 기초
public class Array_1 {
    public static void main(String[] args) {
        /*
        배열 = 자료형
        모든 자료형은 배열로 표현 가능
        ex) int[], double[], String[]
        int 자료형 != int[]자료형
        int[]자료형 != String[]자료형
        */

        //배열은 같은 자료형의 데이터를 여러개 저장할 수 있는 공간

        //배열을 선언
        int[] arr1;

        //System.out.println(arr1[0]);
        //ㄴ선언만 했기 때문에 이렇게 써도 출력안됨
        System.out.println();
        //배열을 생성
        arr1 = new int[3];

        //동시에 배열 선언 및 생성
        //new : 새로운 객체를 생성하겠습니다
        //실체는 항상 우측에 있음!!
        //배열 생성에는 반드시 공간의 개수를 지정해야함
        //자료형은 돈터치
        //배열 공간은 한 번 생성되면 공간의 크기는 변경 불가능
        //배열은 생성되면 기본값을 가진다
        //int[]->0, double[]->0.0
        //참조자료형 배열 -> null
        int[] arr2 = new int[3];

        //배열을 생성하는 또 다른 방법
        int[] arr3 = {1,2,3};
        //초기화된 배열 생성시 선언과 생성을 동시에 진행해야함
        /* r이거 안됨
        int[] arr4;
        arr4 = {1,2,3};

        */




    }
}
