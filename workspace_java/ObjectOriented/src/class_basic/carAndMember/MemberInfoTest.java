package class_basic.carAndMember;

public class MemberInfoTest {
    //클래스명 객체명(변수명) = new 클래스명();
    public static void main(String[] args) {
        MemberInfo m1 = new MemberInfo();

        m1.setMemberInfo("김자바","java","1111",20);
        m1.printMemberInfo1();
        System.out.println();
        m1.setName("홍길동");
        m1.printMemberInfo1();
    }

}
