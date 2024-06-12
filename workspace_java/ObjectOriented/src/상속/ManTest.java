package 상속;

public class ManTest {
    public static void main(String[] args) {
        BusinessMan bm = new BusinessMan();
        System.out.println(bm.company);
        bm.tellCompany();

        System.out.println(bm.name);
        bm.tellName();
        //상속받은 클래스의 변수와 메소드를 본인 것 마냥 사용할 수 있음
    }
}
