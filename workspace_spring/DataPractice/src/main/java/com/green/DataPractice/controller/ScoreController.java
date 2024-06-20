package com.green.DataPractice.controller;
//2024.6.19 6교시, 6.20 1교시

import com.green.DataPractice.vo.ScoreVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    //시작 페이지로 이동
    @GetMapping("/stName")
    public String studentName() {
        return "student_program_1";
        //return "실행하고자하는 html 파일명과 동일한 이름 입력"
    }

    //첫번째 페이지에 넘어온 데이터를 받아, 두번째 페이지로 이동
    @PostMapping("/stInfo")
    public String studentInfo(ScoreVO scoreVO) {
        System.out.println(scoreVO);
        return "student_program_2";
    }

    //세번째 페이지로 이동
    @PostMapping("/stScore")
    public String studentScore(ScoreVO scoreVO) {
        System.out.println(scoreVO);
        return "student_program_3";
    }

    @PostMapping("/stTotal")
    public String studentTotal(ScoreVO scoreVO, Model model){
        System.out.println(scoreVO);

        //평균
        double avg = (scoreVO.getKorScore() + scoreVO.getEngScore() + scoreVO.getMathScore()) /3.0;
        model.addAttribute("avg", avg);
        return "student_program_4";
    }

}
