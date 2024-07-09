package Test_July;


public class Calculate {
    private int num1;
    private int num2;
    private double avg;

    public void setNumber(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum() {
        return num1 + num2;
    }

    public int getMax(){
        if(num1>num2){
            return num1;
        }
        else {
            return num2;
        }
    }
    public double getAvg(){
        int sum = 0;
        int cnt = 0;

        for(int i = num1+1; i<num2 ; i++){
            sum =sum +i;
            cnt++;
        }
        return (sum/ (double)cnt);
    }





}