package class_basic.member;
//2024.6.11 5교시
public class StudentTeachTest {
    public static void main(String[] args) {
        //학생(StudentTeach class)을 5명 저장할 수 있는 배열 생성
        //ㄱ학생 5명을 저장할 수 있는 통을 만든 것
        StudentTeach[] students = new StudentTeach[5];

        //배열에 저장할 학생 객체 생성
        StudentTeach s1 = new StudentTeach("김", 20, 88);
        StudentTeach s2 = new StudentTeach("이", 30, 82);
        StudentTeach s3 = new StudentTeach("최", 40, 94);
        StudentTeach s4 = new StudentTeach("박", 35, 75);
        StudentTeach s5 = new StudentTeach("홍", 25, 83);

        //배열 0번째 요소에 학생 s1 저장
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

       /*
        1. 배열에 저장된 모든 학생의 이름,나이,점수를 출력
        for(int i = 0; i<students.length; i++){
            students[i].print();
            System.out.println();
        }
        */

        /*
        1번 문제를 for-each문으로 해결
        for( StudentTeach s : students){
            s.print();
            System.out.println();
        }
        */

        /*
        2. 배열에 저장된 학생 중 점수가 80점 이상인 학생의 이름,나이, 점수 출력
        int score = 0;
        for(int s = 0; s<students.length; s++){
            if (students[s].getScore() >=80){
                students[s].print();
                System.out.println();
            }
        }
        */

        //3. 이름이 '박'인 학생을 찾아 해당 학생의 나이를 10으로 변경
        //for, for-each 둘 다 풀어보기
        for(int i = 0; i< students.length; i++){
            if(students[i].getName().equals("박")){
                students[i].setAge(10);
                students[i].print();
                System.out.println();
            }
        }
        for(StudentTeach e : students){
            if(e.getName().equals("박")){
                e.setAge(10);
                e.print();
            }

        }

    }
}
