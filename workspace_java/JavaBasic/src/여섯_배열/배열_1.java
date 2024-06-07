package 여섯_배열;
//2024.6.4 5교시
public class 배열_1 {
    public static void main(String[] args) {
        //정수를 저장할 수 있는 배열 선언
        //같은 자료형을 여러개 저장할 수 있음
        //배열도 자료형임!

        //배열 선언 (만들거니까 준비시켜
        int[] arr1;
        String[] arr2;
        double[] arr3;

        //배열 생성 (진짜 만드는 거
        arr1 = new int[3]; //정수를 저장할 공간 3개를 생성
        arr2 = new String[5]; //문자열을 저장할 공간 5개 생성
        arr3 = new double[10]; //실수를 저장할 공간 10개 생성

        //arr1 배열을 출력
        //배열명을 출력하면 이상한 값이 출력됨
        System.out.println(arr1);

        //배열을 선언과 생성을 동시에...
        //5개의 정수를 저장할 수 있는 배열 arr4를 생성
        int[] arr4 = new int[5];
        //실수를 2개 저장할 수 있는 배열 arr5를 생성
        double[] arr5 = new double[2];
    }
}