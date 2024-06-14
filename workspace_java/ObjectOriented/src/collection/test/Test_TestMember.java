package collection.test;
//2024.6.14 7교시 list 6번 문제

import class_basic.Mem.Member;

import java.util.ArrayList;
import java.util.List;

public class Test_TestMember {
    public static void main(String[] args) {

        List<Test_Member> test4 = new ArrayList<>();

        Test_Member m1 = new Test_Member();
        m1.setId("java");
        m1.setPassword("1111");
        m1.setName("김");
        m1.setAge(20);
        //ㄴ이렇게 할 수도 있지만 테스트멤클래스에 생성자 만들어서
        //ㄱ이렇게 하는게 훨씬 편함
        Test_Member m2 = new Test_Member("python","2222","이",30);
        Test_Member m3 = new Test_Member("c++","3333","박",40);

        test4.add(m1);
        test4.add(m2);
        test4.add(m3);

        for(Test_Member member : test4){
            System.out.println(member.toString());
        }

        System.out.println();

        int sum = 0;
        for(int i = 0; i <test4.size(); i++){
            sum = sum + test4.get(i).getAge();
        }
        System.out.println("나이의 합 :" + sum);

        System.out.println();

        test4.remove(1);

        int index = 0;
        for(int i = 0; i < test4.size(); i++){
            if(test4.get(i).getId().equals("java"));{
                index = i;
            }

        }
        test4.remove(index);

    }
}
