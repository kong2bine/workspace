package 일곱_메서드;

//2024.6.5. 7교시
public class Test_1_1_8 {
    public static void main(String[] args) {
        test1();
        test2_1();
        test2_2();
        test3(5);
        test4("holiday!");
        test5(3,5);
        test6(2,5,9);
        test7(15,2);
        test8("배열","어려워");


    }
    //1번 메서드
    public static void test1(){
        System.out.println("안녕하세요~");

    }

    //2번 메서드
    public static void test2_1(){
        System.out.print("반갑습니다.");
    }    public static void test2_2(){
        System.out.println("어서오세요.");
    }

    //3번 메서드
    public static void test3(int num){
        System.out.println(num);

    }

    //4번 메서드
    public static void test4(String holiday){
        System.out.println(holiday);
    }

    //5번 메서드
    public static void test5(int first, int second){
        System.out.println(first+second);
    }

    //6번 메서드
    public static void test6(int num1, int num2, int num3){
        System.out.println(num1 * num2 * num3);
    }

    //7번 메서드
    public static void test7(int num1, int num2){
        System.out.println("몫 : " + num1 / num2);
        System.out.println("나머지 :" + num1 % num2);
    }

    //8번 메서드
    public static void test8(String content1, String content2){
        System.out.println(content1 + content2);
    }

}