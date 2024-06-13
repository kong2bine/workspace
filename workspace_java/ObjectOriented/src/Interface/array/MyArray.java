package Interface.array;

public class MyArray implements MyArrayUtil {
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        
        for(int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        for(int x = 0; x<arr2.length; x++){
            System.out.println(arr2[x]);
        }


        return 0;
    }

    @Override
    public boolean isEvenArray(int[] array) {
        return false;
    }
}
