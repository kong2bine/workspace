package com.green.Board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController {

    //게시글 목록
    @GetMapping("/list")
    public String getBoardList(){
        return "게시글 목록";
    }
    //게시글 상세 조회
    @GetMapping("/detail")
    public String getDetail(){
        return "게시글 상세";
    }

}
