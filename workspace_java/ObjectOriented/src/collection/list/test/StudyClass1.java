package collection.list.test;
//2024.6.17 5교시
//Studyclass 강사님버전

import java.util.List;

public class StudyClass1 {
    private String className;
    private String teacher;
    private List<Student1> stuList;

    public List<Student1> getStuList(){
        return stuList;
    }

    public StudyClass1(String className, String teacher, List<Student1> stuList){
        this.className = className;
        this.teacher = teacher;
        this.stuList = stuList;
    }

    // 1) 해당 반의 모든 학생의 모든 정보를 출력하는 기능
    public void printStuAll(){
        for(Student1 stu : stuList){
            System.out.println(stu);
        }
    }

    // 2) 해당 반의 평균 성적을 리턴하는 기능
    // 3) 해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능
}
