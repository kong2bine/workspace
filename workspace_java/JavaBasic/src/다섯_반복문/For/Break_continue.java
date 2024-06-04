package 다섯_반복문.For;
//2024.6.4 3교시

public class Break_continue {
    public static void main(String[] args) {
        //반복문에서(while,for) break의 역할
        //break문을 만나면 가장 가까이에 있는 반복문을 벗어남
        for (int i = 1; i < 11; i++) {
            System.out.println(i);

            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println();

        //반복문에서(while,for) continue의 역할
        //continue를 만나는 순간 반복문의 끝으로 이동한다(본인 회차 건너고)

        for (int i = 1; i < 11; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}