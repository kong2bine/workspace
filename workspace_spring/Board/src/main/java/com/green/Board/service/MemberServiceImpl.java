package com.green.Board.service;

import com.green.Board.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //아이디 중복 확인
    @Override
    public boolean isDuplicateId(String memId) {
        //id가 null이면 회원가입가능
        //id가 조회(null이 아니면)되면 회원가입 불가능
        String id = sqlSession.selectOne("memberMapper.isDuplicate", memId);
        return id != null;
    }

    //회원가입
    @Override
    public void join(MemberVO memberVO) {
        sqlSession.insert("memberMapper.join", memberVO);
    }

    //로그인
    @Override
    public MemberVO loginForm(MemberVO memberVO) {
        return sqlSession.selectOne("memberMapper.loginForm", memberVO);
    }


}
