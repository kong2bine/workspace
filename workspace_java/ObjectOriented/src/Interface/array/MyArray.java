package Interface.array;
//2024.6.14 1교시
public class MyArray implements MyArrayUtil {

    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int sum1 = 0; //arr1 배열의 합 저장할 공간 생성
        int sum2 = 0; //arr2 배열의 합

        //arr1 배열의 합
        for(int i = 0; i < arr1.length; i++){
            sum1 = sum1 + arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            sum2 = sum2 + arr1[i];
        }

        return (sum1 + sum2) / (double)(arr1.length + arr2.length);
    }

    @Override
    //is붙어 있으면 리턴타입이 boolean 가능성 98%
    //array = {2, 1, 4}
    public boolean isEvenArray(int[] array) {
        for(int e : array){
            if(e % 2 ==1 ){
                return false;
            }
        }

        return true;
    }
}
