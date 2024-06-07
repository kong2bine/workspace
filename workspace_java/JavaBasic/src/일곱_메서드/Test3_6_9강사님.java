package 일곱_메서드;

import java.util.Arrays;

public class Test3_6_9강사님 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] result = test9(a);

        System.out.println(Arrays.toString(result));
    }
    public static String test7(String[] arr){
        String result = "";
        for(int i = 0; i <arr.length; i ++){
            result = result + arr[i];
        }
        return result;
    }
    public static int[] test9(int[] array) {
        // 매개변수로 넘어온 배열 요소 중 짝수의 개수
        int cnt = 0;
        for (int e : array) {
            if (e % 2 == 0) {
                cnt++;
            }
        }
            //짝수만 저장될 배열 생성
            int[] resultArr = new int[cnt];

            int index = 0;
            for(int i = 0; i <array.length; i++){
                if(array[i] % 2 ==0){
                    resultArr[index] = array[i];
                    index++;
                }
            }
            return resultArr;
        }
    }

