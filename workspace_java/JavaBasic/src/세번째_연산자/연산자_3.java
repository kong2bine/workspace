package 세번째_연산자;

public class 연산자_3 {
    public static void main(String[] args) {
        //증감연산자
        int a = 5;
        ++a; //a의 값을 1증가
        System.out.println(a); //6
        a++; //a의 값을 1증가
        System.out.println(a); //7
        --a; //a의 값을 1감소
        System.out.println(a); //6
        a--;
        System.out.println(a); //5

        System.out.println();

        //증감연산자를 단독으로 사용하는지
        //다른 코드와 함께 사용하는지에 따라서 결과 달라짐
        int b = 5;
        System.out.println(++b); //6
        int c = 5;
        System.out.println(c++); //5
        //ㄴc가 출력되고 그 후에 1이 증가된 상태 그래서 5로 보여짐
        //그 다음에 다시 출력시키면 6이 나옴
        //한 줄에 증감 연산자 외에 다른 코드가 있으면 앞에 붙어야 먼저 실행됨
        // ++a : 먼저 1 증가 후 다른 코드를 실행
        // a++ : 다른 코드 전부 실행 후 마지막에 1증가
        //헷갈릴 것 같으면 그냥 단독으로 쓰기. 다른 코드랑 사용x
        System.out.println(c); //6

        int num1 = 10;
        int result = 10+ num1++;
        System.out.println(result);
        System.out.println(num1);
    }
}
