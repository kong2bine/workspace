package com.green.DataPractice.controller;
//2024.6.21 1교시

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ATagController {

    @GetMapping("/a1")
    public String a1(Model model){
        model.addAttribute("stuName", "kim");
        model.addAttribute("score", "92");

        return "a1";
    }

    @GetMapping("/a2")
    public String a2(@RequestParam(name = "address") String name){
        System.out.println("name =" + name);
        return "a2";
    }
    @GetMapping("/a3")
    public String a3(){
        return "a3";
    }

}
