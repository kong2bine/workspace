package com.green.DB_Score.service;

import com.green.DB_Score.vo.StudentVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<StudentVO> getStuList() {
        List<StudentVO> list = sqlSession.selectList("scoreMapper.getStuList");
        return list;
    }

    @Override
    public void insertStudent(StudentVO studentVO) {
        sqlSession.insert("scoreMapper.insertStudent",studentVO);
    }

    @Override
    public StudentVO getStuDetail(int stuNum) {
        StudentVO student = sqlSession.selectOne("scoreMapper.getStuDetail",stuNum);
        return student;
    }

    @Override
    public void deleteStudent(int stuNum) {
        sqlSession.delete("scoreMapper.deleteStudent", stuNum);
    }

    @Override
    public void updateStudent(StudentVO studentVO) {
        sqlSession.update("scoreMapper.updateStudent", studentVO);
    }


}