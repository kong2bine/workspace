package 상속;
//2024.6.12 2교시
public class SuperCls {
    //public SuperCls(){}
    public SuperCls(int a){
    }
    public SuperCls(String a, int b){

    }
}

class SubCls extends SuperCls{
    public SubCls(){
        super("aa",10);
        //ㄴ부모클래스에서 매개변수를 문자,정수로 받는 생성자 호출
    }

}
