import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 2024.7.31
public class Map_1 {
    public static void main(String[] args) {

        //데이터에 순번이 존재, 데이터 중복 가능
        List<String> list = new ArrayList<>();

        //데이터가 key와 value 한 쌍으로 저장됨
        //Integer : key의 자료형, String : value 자료형
        //기본 자료형 불가능
        Map<Integer, String> map = new HashMap<>();

        //map에 데이터 저장
        map.put(1, "java");
        map.put(2, "python");
        map.put(3, "c++");

        //map에 저장된 데이터 읽기(key값으로 읽음)
        System.out.println(map.get(1));

    }
}
