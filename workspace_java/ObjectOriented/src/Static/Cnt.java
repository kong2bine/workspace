package Static;
//2024.6.13 3교시

//static : 멤버변수, 메서드에서 사용 가능
//공용변수, 공용메서드를 의미함
public class Cnt {
    static int num = 0;

    public Cnt(){
        num++;
        System.out.println(num);
    }
}
