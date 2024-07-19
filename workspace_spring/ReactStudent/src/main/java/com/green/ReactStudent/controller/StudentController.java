package com.green.ReactStudent.controller;

import com.green.ReactStudent.service.StudentService;
import com.green.ReactStudent.vo.StudentVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Resource(name = "studentService")
    private  StudentService studentService;

    //게시글 목록 조회
    @GetMapping("/getStuList")
    public List<StudentVO> getStuList(){
        return studentService.getStuList();
    }

    //학생등록
    @PostMapping("/regStu")
    public void regStu(@RequestBody StudentVO studentVO){
        System.out.println(studentVO);
        studentService.regStu(studentVO);
    }

    //학생 상세정보 조회
    @GetMapping("/stuInfo/{stuNum}")
    public StudentVO getStuDetail(@PathVariable ("stuNum") int stuNum){
        System.out.println(stuNum);
        return studentService.getStuDetail(stuNum);
    }

    //삭제
    @DeleteMapping("/deleteStudent/{stuNum}")
    public void delete(@PathVariable("stuNum")int stuNum){
        studentService.delete(stuNum);
    }

    //점수 등록
    @PutMapping("/updateScore")
    public void updateScore(@RequestBody StudentVO studentVO){
        studentService.updateScore(studentVO);
    }
}

