package exception;
//2024.6.18 2교시

//예외전가
public class Exception_3 {
    public static void main(String[] args) {
        //bbb();
    }

    public static void aaa() throws Exception {
        //throws Exception : 나 이거 예외처리 안하고 그냥 던져버릴래
        //예외전가 : 원래 예외처리를 해야하는 곳에서 다른 곳에서 예외처리를 하겠다는 것
        //ㄴ 이 경우 throws Exception 처리를 한 메서드(위 경우 aaa)에게 책임이 전가됨
        //ㄴㄴ메서드를 실제로 사용하는 메서드에게 그 책임이 전가됨
        System.out.println(5/0);
    }

    public static void bbb() throws Exception{
        aaa();
    }
}
