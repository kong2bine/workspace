package com.green.DataPractice.controller;
//2024.6.19 6교시

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScoreController {

    @GetMapping("/stName")
        public String studentName(){
            return "student_program_1";
            //return "실행하고자하는 html 파일명과 동일한 이름 입력"
        }
    @GetMapping("/stInfo")
        public String studentInfo(){
            return "student_program_2";
    }


}
