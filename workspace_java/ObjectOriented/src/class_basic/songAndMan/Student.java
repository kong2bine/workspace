package class_basic.songAndMan;
//2024.6.10 7교시 ManTeacherVer 참고
public class Student {
    private String name;
    private String age;
    private String addr;
    private int colnum;
    private String phone;

    public Student (String name, String age, String addr, int colnum, String phone){
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.colnum = colnum;
        this.phone = phone;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public void setAddr(String addr){
        this.addr = addr;
    }
    public void setColnum(int colnum){
        this.colnum = colnum;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getAddr(){
        return addr;
    }
    public int getColnum(){
        return colnum;
    }
    public String getPhone(){
        return phone;
    }
    public void printStudent(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
        System.out.println("학번 : " + colnum);
        System.out.println("연락처 : " + phone);
    }


}

