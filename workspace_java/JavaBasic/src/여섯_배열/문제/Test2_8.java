package 여섯_배열.문제;
//2024.6.5 3교시?아니면 4교시ㅜㅜ
import java.util.Arrays;

//시험 출제 문제

public class Test2_8 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45 + 1);
        }

        System.out.println(Arrays.toString(lotto));

    }
}
