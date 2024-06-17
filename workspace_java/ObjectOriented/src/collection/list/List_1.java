package collection.list;
//2024.6.14 4교시

import java.util.ArrayList;
import java.util.List;

public class List_1 {
    public static void main(String[] args) {
        //ArrayList 객체 생성 (다수의 데이터를 저장할 공간) - 순번 존재, 중복 가능
        //String 데이터를 다수 저장하기 위한 list 생성
        //기본자료형은 사용못함 -> wrapper 클래스 사용

        //정수 데이터를 다수 저장하기 위한 list(통) 생성
        // ArrayList<Integer> list2 = new ArrayList<>();
        //ㄴ기본자료형 저장 불가능 하기 때문에 int(기본자료형)말고 Integer(클래스)로 저장해야 함
        List<String> list1 = new ArrayList<>();

        //리스트에 데이터 저장하기
        //중복된 데이터가 들어가기 때문에 이름으로 불렀을 때 중복되는 것 중 특정해서 하나를 빼내지 못함
        //ㄴbut,순번이 있기 때문에 순서로 호출 가능
        list1.add("java");
        list1.add("c++");
        list1.add("python");
        list1.add("c++");

        //리스트에 저장된 데이터 읽기, 순번으로 접근
        String result = list1.get(1); // c++ 출력

        //리스트에 저장된 데이터 삭제
        String remove = list1.remove(0); // "java" 삭제

        //리스트에 저장된 데이터 수
        System.out.println(list1.size());

        //리스트에 저장된 모든 데이터 출력
        for(int i = 0; i< list1.size(); i++){
            System.out.println(list1.get(i));
        }

        //add, get, remove, size : 리스트라는 인터페이스에 저장된 추상메서드

    }
}
