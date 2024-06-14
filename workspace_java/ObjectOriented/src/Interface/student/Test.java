package Interface.student;

import java.util.Arrays;

//2024.6.14 2교시
public class Test {
    public static void main(String[] args) {
        MyStudent s = new MyStudent();

        Student[] students = new Student[5];
        Student s1 = new Student("kim", 88, 95, 90);
        Student s2 = new Student("lee", 100, 88, 90);
        Student s3 = new Student("jeong", 90, 85, 88);
        Student s4 = new Student("moon", 30, 70, 90);
        Student s5 = new Student("suh", 78, 75, 81);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        String result1 = s.getGradeByStudentName(students,"moon");
        System.out.println(result1);

        System.out.println();

        int[] result2 = s.getTotalScoresToArray(students);
        System.out.println(Arrays.toString(result2));

        System.out.println();

        Student stu = s.getHighScoreStudent(s1,s2);
        System.out.println(stu.getName());



    }
}
