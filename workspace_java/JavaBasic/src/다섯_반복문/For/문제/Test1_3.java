package 다섯_반복문.For.문제;

//출력문을 한 번 만 사용하여 '2 4 6 8 10'을 출력
public class Test1_3 {
    public static void main(String[] args) {
        for(int i = 2; i<11; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        /*
            for(int i =2; i<11; i = i+2){
                System.out.print(i + " "}
                도 가능
        */
    }
}
