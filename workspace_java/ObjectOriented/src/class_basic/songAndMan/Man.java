package class_basic.songAndMan;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Man {
    String name;
    String age;
    String address;

    public void setMan(String name, String age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*
    getter and setter
    오른쪽 마우스 -> generate에서 원하는 키 누르고 원하는 영역 설정 후 생성
    */
}
