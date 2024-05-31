package IF_문제_1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int score = 92;
        String grade;
        if(score > 90 && score <=100){
            grade = "A";
        }
        else if(score > 80){
            grade = "B";
        }
        else{
            grade = "C";
        }
        System.out.println("학점은 "+ grade);
    }
}
