package 여섯_배열;
//2024.6.4 6교시
public class 배열_3 {
    public static void main(String[] args) {
        int[] arr1 = new int[5]; //<-0이 5개 들어가 있는 상태
        System.out.println(arr1); //<-이상한 값 나옴

        //배열에 저장된 값을 출력할 때는 배열의 요소로 접근한다
        System.out.println(arr1[0]);
        //System.out.println(arr1[5]); //주의!

        //arr1 0~4번 째 요소까지의 모든 값을 출력
        for(int i = 0; i<5; i++){
            System.out.println(arr1[i]);
        }

        System.out.println();

        //배열의 크기
        int[] arr2 = new int[2];
        int[] arr3 = new int[5];
        int[] arr4 = new int[10];

        for(int i = 0 ; i < arr4.length ; i++){
            System.out.println(arr4[i]);
        }

        System.out.println(arr4.length);
        //ㄴ length : 배열의 크기를 출력해주는 식

    }
}
