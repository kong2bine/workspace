package 변수와자료형;

public class 변수_4 {
    public static void main(String[] args) {
        //1. 변수는 선언 후 반드시 최초 값을 한 번은 할당해야 함
        int num;
        num = 5; //이 코드가 없어지면 오류 발생함
        System.out.println(num);

        //변수의 선언 및 값 할당은 동시에 가능
        int a;
        a = 7;
        //ㄱ동시에 적용하면 이렇게
        int b = 10;

        //자료형이 같은 변수는 한 번에 여러개 선언 가능(잘안씀)
        int a1, b1, c1;
        a1 = 10;
        b1 = 20;
        c1 = 30;
    }
}


