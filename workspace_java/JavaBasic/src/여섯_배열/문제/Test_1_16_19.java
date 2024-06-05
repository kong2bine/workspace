package 여섯_배열.문제;

//2024.6.5 8교시

public class Test_1_16_19 {
    public static void main(String[] args) {
        test16(5);
        test17(5,1);
        test18(1,10);
        test19("집에가자",3);

    }

    //메서드 16번
    public static void test16(int num){
        for(int i = 0; i<num+1; i++){
            System.out.println(i);
        }
    }

    //메서드 17번
    public static void test17(int a, int b){
        //1 5 -> 2 3 4
        int max = a>b ? a:b;
        int min = a<b ? a:b;

        for(int i = min+1; i< max; i++){
            System.out.println(i);
        }
    }

    //메서드 18번
    public static void test18(int a, int b){
        int max = a>b ? a:b;
        int min = a<b ? a:b;

        int cnt = 0;
        for(int i = min+1; i <max; i++){
            if(i % 5==0){
                cnt++;
            }
        }
    }
    public static void test19(String s, int num){
        String result = "";
        for(int i =0; i<num; i++){
            result = result + s;
        }
        System.out.println(result);
    }

}
