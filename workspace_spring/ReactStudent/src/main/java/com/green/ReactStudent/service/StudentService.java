package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;

import java.util.List;

public interface StudentService {

    //학생 목록 조회
    List<StudentVO> getStuList();

    //학생 등록
    void regStu(StudentVO studentVO);

    //학생 상세보기
    StudentVO getStuDetail(int stuNum);

    //삭제
    void delete(int stuNum);

    //점수 등록(변경)
    void updateScore(StudentVO studentVO);
}
