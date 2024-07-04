//2024.7.1 & 7.2
package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardService;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class reactController {
    @Resource(name = "boardService")
    private BoardService boardService;

    //게시판 목록 페이지
    @RequestMapping("/list")
    public List<BoardVO> list(Model model, SearchVO searchVO) {

     //목록조회
     List<BoardVO> boardList = boardService.getBoardList(searchVO);
     return boardList;
    }


}