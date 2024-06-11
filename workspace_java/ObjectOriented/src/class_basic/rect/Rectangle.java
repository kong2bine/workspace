package class_basic.rect;
//2024.6.11 2교시 - 클래스 기초1-16번

public class Rectangle {
    //사각형을 구성하는 두 점의 좌표
    int x1;
    int y1;
    int x2;
    int y2;

    //생성자
    public Rectangle(){}
    public Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void set(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public int square(){
        return (x2-x1)*(y2-y1);
    }

    //좌표 정보, 넓이 출력
    //(1,2), (5,7)
    public void show(){
        System.out.println("(" + x1 + ", " + y1 + "),("+ x2 + ", " + y2 + ")");
        System.out.println("사각형의 넓이 : " + square());

    }
    //인자 : 매개변수에 실제로 들어오는 객체
    //인자로 전달된 객체 rr과 현 객체가 같으 넓이라면 리턴 true
    public boolean equals(Rectangle r){
        if(r.square() == square()){
            return true;
        }
        else{
            return false;

        }
    }


}
