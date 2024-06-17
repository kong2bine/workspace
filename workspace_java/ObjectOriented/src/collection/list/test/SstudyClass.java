package collection.list.test;
//2024.6.17 4교시

import java.util.ArrayList;
import java.util.List;

public class SstudyClass {
        private List<Sstudent> studyclass;

        public void Class1(){
            studyclass = new ArrayList<>();

            Sstudent className1 = new Sstudent("헨델", "55세", 88);
            Sstudent className2 = new Sstudent("바흐", "48세", 88);
            Sstudent className3 = new Sstudent("라흐마니노프", "33세", 79);

            studyclass.add(className1);
            studyclass.add(className2);
            studyclass.add(className3);
        }

        public void Class2() {
            studyclass = new ArrayList<>();

            Sstudent className4 = new Sstudent("순자", "61세", 74);
            Sstudent className5 = new Sstudent("쇼펜하우어", "38세", 92);
            Sstudent className6 = new Sstudent("아리스토텔레스", "22세", 65);
        }



    }

