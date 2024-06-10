package class_basic.carAndMember;
//2024.6.10 3교시
public class MemberInfo {
    String name;
    String id;
    String password;
    int age;


    public void setMemberInfo(String n1, String id1, String p1, int a1){
        name = n1;
        id = id1;
        password = p1;
        age = a1;
    }

    public void printMemberInfo1(){
        System.out.println("아룸 : "+ name);
        System.out.println("아이디 : "+ id);
        System.out.println("비밀번호 : "+ password);
        System.out.println("나이 : "+ age);
    }

    //회원의 이름을 변경(12번)
    public void setName(String name1){
        name = name1;
    }

}