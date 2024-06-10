package 일곱_메서드;
//2024.6.7 2교시

public class Test_2_1_5 {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();*/

        System.out.println(test2(2,4));
        System.out.println(test4("나","는"));

        System.out.println(test5(88));

    }
    public static void test1(){

    }
    public static int test2(int a, int b){
        return a*b;
    }

    public static int test3(int a, int b){
        return a>b ? a:b;
/*      ㄱif,else 안쓰고 ㄴ 이렇게 한 줄로 가능
        if(a>b){
            return a;
        }
        else{
            return b;
        }*/
    }
    public static String test4(String a,String b) {
        return a+b;
    }

    public static String test5(int score){
        if(score>89){
            return "A";
        }
        else if (90>score && score> 69) {
            return "B";
        }
        else {
            return "C";
        }
    }
}
