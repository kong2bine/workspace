package com.green.DBTest.service;
/*2024.6.25 6교시*/

//인터페이스에는 멤버변수x, 생성자x ->인터페이스는 객체 생성 불가
//오직 추상메서드(메서드의 이름만 존재, 몸통x)만 존재
//인터페이스는 단독으로 사용 불가! -> 클래스의 정의부분에서 사용을 함
public interface MemberService {
    //TEST_MEMBER 테이블에 데이터 1개 삽입
    void insertMember();

    void insertMember2();
}

