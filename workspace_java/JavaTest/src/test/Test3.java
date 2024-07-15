package test;

public class Test3 {
    public static void main(String[] args) {

        int[] array = {5,11,20,40,30};
        int max = array[0];
        int min = array[0];

        for (int i =0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
            if(min> array[i]){
                min=array[i];
            }
        }
        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);

    }
}
