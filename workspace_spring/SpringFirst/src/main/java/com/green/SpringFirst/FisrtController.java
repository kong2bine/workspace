package com.green.SpringFirst;
//2024.6.17 7,8교시

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FisrtController {

    @GetMapping("/a")
    public String goFirst(){
        return "first";
    }

    @GetMapping("/b")
    public String goSecond(){
        System.out.println(111);
        return "second";
    }

    @GetMapping("/c")
    public String goThird(){
        System.out.println(222);
        return "third";
    }

    @GetMapping("/login")
    public String goLogin(){
        return "login";
    }

    @GetMapping("/loginResult")
    public String loginResult(){
        System.out.println("loginResult 메서드 실행~");
        return "";
    }
}
