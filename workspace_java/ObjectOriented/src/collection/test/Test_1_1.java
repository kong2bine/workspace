package collection.test;
//2024.6.14 6교시

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_1_1 {
    public static void main(String[] args) {

        List<String> test1 = new ArrayList<>();

        test1.add("first");
        test1.add("second");
        test1.add("third");

        for(int i = 0; i< test1.size(); i++){
            System.out.println(test1.get(i));
        }

    }
}
