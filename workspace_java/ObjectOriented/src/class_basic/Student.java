package class_basic;
//2024.6.7 7교시
public class Student {
    String name;
    int age;
    int score;

    //매개변수로 전달된 문자열로 name 값을 변경하는 메서드
    public void setName(String name1){
        name = name1;
    }

    //나이를 변경하는 메서드
    public void setAge(int a){

        if(a<0){
            age = 0;
        }
        else{
            age = a;
        }
    }

    public void introduce(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("점수 : " + score);
    }

}
