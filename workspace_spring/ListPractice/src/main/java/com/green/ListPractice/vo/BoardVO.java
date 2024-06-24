package com.green.ListPractice.vo;
//2024.6.21 2교시


import lombok.Data;

//VO: Value Object
//DTO : (BoardDTO) : Data Transfer Object
@Data
public class BoardVO {
    private int boardNum;
    private String stuName;
    private String writer;
    private String createDate;
    private String content;
}
