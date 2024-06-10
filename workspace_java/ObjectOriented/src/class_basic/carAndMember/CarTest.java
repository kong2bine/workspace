package class_basic.carAndMember;
//2024.6.10 2교시
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();

        //c1의 변수를 출력
        System.out.println(c1.brand);
        System.out.println(c1.price);

        //c1 변수의 값 변경
        c1.brand = "현대";
        //ㄴc1이라는 객체 안에 있는 brand라는 변수에 "현대"를 입력
        c1.price = 100;

        //c1의 변수 출력
        System.out.println(c1.brand);
        System.out.println(c1.price);

        System.out.println();

        Car c2 = new Car();
        c2.printCarInfo();
        System.out.println();
        c2.setBrand("기아");
        c2.setModelName("k5");
        c2.setCarNumber("9982");
        c2.setPrice(1000);
        c2.printCarInfo();
    }
}
