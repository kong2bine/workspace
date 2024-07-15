public class Array_2 {
    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5};

        //배열의 값을 읽고 쓰기
        //1.배열의 값 읽기
        System.out.println(arr[0]);

        //2.배열의 값 쓰기
        arr[1] = 5;

        //배열의 길이
        System.out.println(arr.length);

        //1. int i = 0 ->최초 1번만 해석
        //2. i< arr.length
        //3. System.out.println(arr[i]);
        //4. i++
        //5. 2~4 반복
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
