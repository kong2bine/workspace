package collection.test;

import java.util.ArrayList;
import java.util.List;

//2024.6.14 6교시
public class Test_1_3 {
    public static void main(String[] args) {
        List<String>nameList = new ArrayList<>();
        nameList.add("김자바");
        nameList.add("이자바");
        nameList.add("홍길동");

        for(int i = 0; i<nameList.size(); i++){
            if(nameList.get(i).equals("홍길동")){
                System.out.println("존재");
            }
        }
    }
}
