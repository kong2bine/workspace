package 일곱_메서드;

//2024.6.7 3교시
public class Test_2_1_9강사님 {
    public static void main(String[] args) {
        String r1 = test4("a","b");
        System.out.println(r1);
        System.out.println(test5(89));
        System.out.println(test7(10.5));
        System.out.println(test9(5));

    }
    public static int test3(int a, int b) {
        return a > b ? a : b;
    }

    public static String test4(String a, String b){
        return a+b;
    }

    public static String test5(int num){
        if(num >= 90){
            return "A";
        }
        else if (num>=70) {
            return "B";
        }
        else {
            return "C";
        }
    }

    public static String test6(int num){
        //정수->문자열
        String.valueOf(10); //"10"

        //문자열->정수
        int aa = Integer.parseInt("10"); //10


        return num + "";
    }
    public static double test7(double num){
        return num * num;
    }
    public static double test8(int a, int b, int c){
        return (a+b+c) / 3.0;
    }

    //num = 10
    public static int test9(int num){
        int sum = 0;

        for(int i = 1; i<num+1; i ++){
            if(i % 2 ==1){
                sum = sum+i;
            }

        }
        return sum;
    }
}
