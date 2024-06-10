package class_basic.cal;

//2024.6.10 7교시
public class Calculator {
    private int num1;
    private int num2;

    //num1, num2 값을 변경하는 메서드
    public void setNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //더한 결과 리턴
    public int getSum(){
        return num1 + num2;
    }
    //빼기 결과 리턴
    public int getSub(){
        return num1 - num2;
    }
    //곱한 결과 리턴
    public int getMulti(){
        return num1 * num2;
    }
    //나눗셈 결과 리턴
    public double getDiv(){
        return num1/(double)num2;
    }
}
