package class_basic.songAndMan;
//2024.6.10 6교시
public class ManTeacherVer {
    //이름, 나이, 주소
    private String name;
    private int age;
    private String addr;

    //모든 값을 변경할 수 있는 생성자
    public ManTeacherVer(String name, int age, String addr){
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    //setter : 멤버 변수 각각의 값을 변경하는 메서드
    //setter의 이름은 반드시 set변수명(변수명 첫글자 대문자)으로 지정해야함
    //이름을 변경하는 메서드
    public void setName(String name){
        this.name = name;
    }
    //나이를 변경하는 메서드
    public void setAge(int age){
        this.age = age;
    }
    //주소를 변경하는 메서드
    public void setAddr(String addr){
        this.addr = addr;
    }

    //getter : 멤버변수 각각의 값을 return 받는 메서드
    //getter의 이름은 반드시 get변수명 으로 지정
    //이름을 리턴하는 메서드
    public String getName(){
        return name;
    }
    //나이를 리턴하는 메서드
    public int getAge(){
        return age;
    }
    //주소를 리턴하는 메서드
    public String getAddr(){
        return addr;
    }

    public void printMan(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }
}
