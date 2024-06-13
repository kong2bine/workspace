package Interface.math;

public class MyMath implements MathUtil {
    @Override
    public int getMin(int a, int b) {
        return a< b ? a : b;
    }

    @Override
    public double getCircleArea(int radius) {
        return radius < 0 ? 0 :2 * Math.PI * radius;
        /*
            위처럼 삼항연산자 쓸 수 있으면 깔끔하게 한 줄 적고 끝내...
            but 기억 안나면 if문이라도 써서 일단 해보기

            if(radius<0){
            return 0;
        }
        else{
            return 2 * Math.PI * radius;
        }
        */
    }

    @Override
    public int getMultiple(int num1, int n) {
        int result = 0;
        for (int i = 0; i< n; i++){
            result = result * num1;
        }

        return 0;
    }

}
