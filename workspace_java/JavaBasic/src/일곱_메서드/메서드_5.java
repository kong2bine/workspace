package 일곱_메서드;
//2024.6.7 1교시
public class 메서드_5 {
    public static void main(String[] args) {
       int result = getSum(10, 20);
        System.out.println(result);
        //ㄱㄴ같은 말임. 위 두 줄을 한 줄로 나타낸게 아래의 식
        System.out.println(getSum(20,40));

        System.out.println(getSum2(6,1));

        double result2 = getSum2(8,6);

    }

    //매개변수로 전달된 두 정수의 합을 리턴하는 메서드
    public static int getSum(int a, int b){
        return a+b;
    }

    //매개변수로 전달된 두 정수의 합을 실수형태로 리턴하는 메서드
    public static double getSum2(int a, int b){
        return a+(double)b;
    }
}
