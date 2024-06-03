package 네번째_조건문;

//2024.06.03 4교시
/*
    switch case break
    switch(변수){
        case 값1 :
        case 값2 :
        case 값3 :
    }
*/

public class Case_1 {
    public static void main(String[] args) {
        System.out.println("시작~");

        int num = 10;
        //시작 지점을 알려주는 것

        switch(num){
            case 1 : //num 값이 1일 때 실행 내용
                System.out.println(1);
                break;
                //break가 없으면 조건이 맞는 순간 모든 내용이 다 출력됨
                //break문을 만나면 switch문 종료
                //마지막에는 break 사용 x 의미 없음
            case 3 :
                System.out.println(3);
                break;
            case 5 :
                System.out.println(5);
                System.out.println(5);
                break;
            case 7 :
                System.out.println(7);
                break;
            default: //그 밖에는
                System.out.println("해당 없음");

        }

        System.out.println("종료~");
    }
}