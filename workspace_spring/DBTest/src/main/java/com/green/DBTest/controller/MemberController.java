package com.green.DBTest.controller;
/*2024.6.25 6교시*/

import com.green.DBTest.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//MemberController memberController m = new MemberController();
@Controller
public class MemberController {
    @Resource(name = "memberService")
    private MemberService memberService;


    //이 메서드가 실행되면 TEST_MEMBER 테이블에 1개의 데이터가 INSERT 됨.
    @GetMapping("/insert1")
    public String insert1(){
        memberService.insertMember();
        //memberService.insertMember2();

        return "insert_1";
    }
}
