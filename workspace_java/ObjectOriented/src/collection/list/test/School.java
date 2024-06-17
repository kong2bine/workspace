package collection.list.test;
//2024.6.17 5교시
//Sschool 강사님버전

import java.util.List;

public class School {
    private List<StudyClass1> classList;

    public School(List<StudyClass1> classList){
        this.classList = classList;
    }
    public List<StudyClass1> getClasslist(){
        return classList;
    }
}
