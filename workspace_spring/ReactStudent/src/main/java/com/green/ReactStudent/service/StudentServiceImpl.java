package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //학생 등록
    @Override
    public void regStu(StudentVO studentVO) {
        sqlSession.insert("studentMapper.regStu",studentVO);
    }

    @Override
    public StudentVO getStuDetail(int stuNum) {
        return sqlSession.selectOne("studentMapper.getStuDetail",stuNum);
    }

    //삭제
    @Override
    public void delete(int stuNum) {
        sqlSession.delete("studentMapper.delete", stuNum);
    }

    @Override
    public void updateScore(StudentVO studentVO) {
        sqlSession.update("studentMapper.updateScore", studentVO);
    }


    //학생목록
    @Override
    public List<StudentVO> getStuList() {
        return sqlSession.selectList("studentMapper.getStuList");
    }
}
