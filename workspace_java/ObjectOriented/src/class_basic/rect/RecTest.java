package class_basic.rect;
//2024.6.11 2교시 끝자락
public class RecTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle(1,1,2,3);

        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2,2,-1,4);
        r.show();
        System.out.println(r.square());

        if(r.equals(s)) {
            //if문 안에 출력문이 한 개면 {중괄호}생략 가능
            System.out.println("두 사각형의 넓이는 같습니다.");
        }

    }
}
