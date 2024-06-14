package collection.list;

import java.util.ArrayList;
import java.util.List;

//2024.6.14 5교시
public class List_2 {
    public static void main(String[] args) {
        //정수를 다수 저장할 수 있는 list 생성
        List<Integer>list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(20);

        int a = list.get(1);
        //ㄴInteger 그냥 int처럼 쓰면 돼

    }
}
