package 다섯_반복문.While.문제;

public class Test3 {
    public static void main(String[] args) {
        int i = 2;
        while (i<=10){
            if(i % 2 ==0){
                System.out.print(i + " ");
            }
            i++;
        }

        /*
            int j = 2;
            while(j<11){
                System.out.print(i + " ");
                j = i+2;
            }
            이렇게도 가능
        */
    }
}
