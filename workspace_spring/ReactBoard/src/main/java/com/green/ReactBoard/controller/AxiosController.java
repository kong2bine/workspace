package com.green.ReactBoard.controller;
//2024.7.16

import com.green.ReactBoard.service.AxiosService;
import com.green.ReactBoard.vo.BoardVO;
import com.green.ReactBoard.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AxiosController {

    @Resource(name = "axiosService")
    private AxiosService axiosService;

    //1번 버튼 클릭시 호출되는 메서드
    @GetMapping("/getList")
    public List<BoardVO> getList(){
        return axiosService.getList();

    }
    @PostMapping("/insertBoard")
    public void insertBoard(@RequestBody MemberVO memberVO){
        //post,put 데이터 받기 : @RequestBody 붙여야함
        System.out.println(1);
        System.out.println(memberVO);
    }
    @PutMapping("/updateBoard")
    public int updateBoard(@RequestBody BoardVO boardVO){
        System.out.println(boardVO);
        //데이터베이스 update 쿼리 실행

        return 10;
    }

    @GetMapping("/detail/{boardNum}")
    public void detail(@PathVariable("boardNum")int boardNum){
        //@PathVariable : url로 넘어오는 데이터 받기
        System.out.println(boardNum);

    }


}
