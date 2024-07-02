//2024.7.1 & 7.2
package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardService;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {
    @Resource(name = "boardService")
    private BoardService boardService;

    //게시판 목록 페이지
    @RequestMapping("/")
    public String list(Model model, SearchVO searchVO) {
    //searchVO 데이터 검사
        System.out.println(searchVO);

     //목록조회
     List<BoardVO> boardList = boardService.getBoardList(searchVO);
     model.addAttribute("boardList", boardList);

     //ㄴ 위 두 줄 이렇게 한 줄로 만들 수 있음
       // model.addAttribute("boardList", boardService.getBoardList());

    return "board_list";
    }

    //글쓰기 페이지로 이동
    @GetMapping("/writeForm")
    public String writeForm(){
        return "write_form";
    }

    @PostMapping("/insertBoard")
    public String insertBoard(BoardVO boardVO){
        boardService.insertBoard(boardVO);
        return "redirect:/";
    }

    // 게시글 상세조회
    @GetMapping("/boardDetail")
    public String boardDetail(@RequestParam(name = "boardNum")int boardNum, Model model){
        //조회수 증가
        boardService.updateReadCnt(boardNum);

        model.addAttribute("board", boardService.getBoardDetail(boardNum));
        /*ㄱ이거 한줄로 ㄴ이렇게 요약 가능
        BoardVO board = boardService.getBoardDetail(boardNum);
        model.addAttribute("board",board);*/

        return "board_detail";
    }

    //게시글 삭제
    @GetMapping("/deleteBoard")
    public String deleteBoard(@RequestParam(name = "boardNum")int boardNum){
        boardService.deleteBoard(boardNum);

        return "redirect:/";
    }
}