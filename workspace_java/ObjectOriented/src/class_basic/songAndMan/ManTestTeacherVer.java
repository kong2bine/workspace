package class_basic.songAndMan;

public class ManTestTeacherVer {
    public static void main(String[] args) {
        ManTeacherVer man = new ManTeacherVer("홍", 20, "울산");

        //이름 변경
        man.setName("kim");

        System.out.println(man.getName());
        man.printMan();
    }
}
