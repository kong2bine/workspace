package test;

public class MathUtilImpl implements MathUtil {
    @Override
    public boolean isEven(int a, int b, int c) {
        int sum = a+b+c;
        if (sum % 2 == 0 && sum % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getSumFromOne(int num) {
        for(int i =0; i < num; i++)
            num += i;
        return num;
    }

    @Override
    public int getArraySum(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        return sum / array.length;
    }
}
