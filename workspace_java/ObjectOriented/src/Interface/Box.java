package Interface;
//2024.6.14 3교시

//무엇이든 넣고 뺄 수 있는 만능 박스
//wrapper클래스 : 기본 자료형을 클래스화 시킨 것
public class Box {
   Object str;

    public void setBox(Object str){
        this.str = str;
    }
    public Object getBox(){
        return str ;

    }

}
