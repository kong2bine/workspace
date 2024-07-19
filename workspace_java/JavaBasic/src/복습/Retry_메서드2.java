package 복습;

public class Retry_메서드2 {
    public static void main(String[] args) {
        printNum(82);

        int c = getNum(99,47);
        System.out.println(c);
        //ㄴ 한 줄로 ㄱ
        System.out.println(getNum(77,825));

        if(isOdd(3)){
            System.out.println(1);

        }
    }

    public static boolean isOdd(int num){
        return num % 2 == 1;

    }

    //void : 리턴하는 데이터 없음
    //ㄴ메소드 실행 결과 우리에게 주는 데이터가 없음
    public static void printNum(int num){
        if(num<0){
            return;
            //true면 더 이상 실행하지 않고 끝내버림(출력문 실행x)
        }
        System.out.println(num);
    }
    public static int getNum(int a, int b){
        //ㄱ출력아님
        return a + b;
    }
}
