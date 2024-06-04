package 여섯_배열.문제;
//2024.6.4 7교시
public class Test1_7 {
    public static void main(String[] args) {

        //정수를 10개 저장할 수 있는 배열을 생성하고 모든 요소에 3을 넣고
        //3이 잘 들어갔는지 출력하여 확인
        int[] arr1 = new int[10];

       //모든 요소를 3에 저장
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 3;
            //System.out.println(arr1[i]);
            //ㄴ모든 요소를 따로 출력하지 않고 이렇게 넣어 즉시 출력해도 됨
        }

       //모든 요소를 출력
        for(int i = 0 ; i<10; i++){
            System.out.println(arr1[i]);
        }
    }
}
