package com.green.ReactBoard.vo;
//2024.7.15

import lombok.Data;

@Data
public class BoardVO {
    private int boardNum;
    private String boardTitle;
    private String boardContent;
    private String boardWriter;
    private String createDate;
}
