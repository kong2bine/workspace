package Static;
//2024.6.13 4교시

//static 키워드가 붙은 멤버변수의 초기화 방법
//static 키워드가 붙은 멤버변수는 생성자에서 초기화하면 안됑
//초기화 구문이 따로 존재함
public class StaticInit {
    int a;
    static int num;

    //static 변수 초기화
    static{
        num = 5;
    }

    public StaticInit(){
        a = 10;
        //num = 5; 생성자에서 static 초기화 하지 마세요!
        num++;
        System.out.println("a : " + a);
        System.out.println("num : " + num);
    }
}
