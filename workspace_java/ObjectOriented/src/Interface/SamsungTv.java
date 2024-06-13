package Interface;
//2024.6.13 6교시

public class SamsungTv implements Tv{

    @Override
    public void turnOn() {
        System.out.println("삼성티비 - 전원 켬");

    }

    @Override
    public void turnOff() {
        System.out.println("삼성티비 - 전원 끔");

    }

    @Override
    public void volumeUp() {
        System.out.println("삼성티비 - 소리 올림");

    }

    @Override
    public void volumeDown() {
        System.out.println("삼성티비 - 소리 내림");

    }
}


