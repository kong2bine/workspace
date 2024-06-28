package com.green.DB_Score.service;

import com.green.DB_Score.vo.StudentVO;

import java.util.List;

public interface ScoreService {

    //학생 목록 조회
    List<StudentVO> getStuList();

    //학생 등록
    void insertStudent(StudentVO studentVO);

    //학생 상세 조회
    StudentVO getStuDetail(int stuNum);

    //학생 정보 삭제
    void deleteStudent(int stuNum);

    //학생 수정
    void updateStudent(StudentVO studentVO);

}
