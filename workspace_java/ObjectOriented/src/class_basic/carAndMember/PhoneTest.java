package class_basic.carAndMember;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.price);

        p.price = 1000; //<-별로 안좋은 방법
        p.setPrice(1000);

        p.modelName = "aa";

    }
}
