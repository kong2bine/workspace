package collection.list.test;
//2024.6.17 5,6교시

import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {
        //자바반에 소속될 학생 3명 생성
        Student1 s1 = new Student1("김자바", 20, 80);
        Student1 s2 = new Student1("이자바", 30, 90);
        Student1 s3 = new Student1("박자바", 40, 100);

        //자바반에 저장할 학생 list
        List<Student1> stuList1 = new ArrayList<>();
        stuList1.add(s1);
        stuList1.add(s2);
        stuList1.add(s3);

        //자바반 (객체 생성 + 위에서 만든 자바반 학생 목록 자바반에 저장)
        StudyClass1 javaClass = new StudyClass1("자바반","강사_자바",stuList1);

        //캐드반에 저장될 학생 3명 생성
        Student1 s4 = new Student1("김캐드", 25, 85);
        Student1 s5 = new Student1("이캐드", 35, 95);
        Student1 s6 = new Student1("박캐드", 45, 100);

        //캐드반 학생들이 저장될 list 생성 및 해당 list에 캐드반 학생 저장
        List<Student1> stuList2 = new ArrayList<>();
        stuList2.add(s4);
        stuList2.add(s5);
        stuList2.add(s6);

        //캐드반 객체 생성 + 위에서 만든 캐드반 학생 목록 캐드반에 저장
        StudyClass1 cadClass = new StudyClass1("캐드반", "강사_캐드", stuList2);

        //영상반에 저장될 학생 3명 생성
        Student1 s7 = new Student1("김영상", 28, 99);
        Student1 s8 = new Student1("이영상", 38, 89);
        Student1 s9 = new Student1("박영상", 48, 79);

        //영상반 학생들이 저장될 list 생성 및 해당 list에 영상반 학생 저장
        List<Student1> stuList3 = new ArrayList<>();
        stuList3.add(s7);
        stuList3.add(s8);
        stuList3.add(s9);

        //영상반 객체 생성 + 위에서 만든 영상반 학생 목록 영상반에 저장
        StudyClass1 recordingClass = new StudyClass1("영상반","강사_영상",stuList3);

        //교실을 여러개 저장할 수 있는 list 생성
        List<StudyClass1> classList = new ArrayList<>();
        classList.add(javaClass);
        classList.add(cadClass);
        classList.add(recordingClass);

        School school = new School(classList);

        //학교 안의 모든 학생의 정보 출력
        //2024.6.17 6교시 강의 다시 보기
        for(int i = 0; i< school.getClasslist().size(); i++){
            for(int j = 0; j<school.getClasslist().get(i).getStuList().size(); j++){
            }
        }

    }
}
