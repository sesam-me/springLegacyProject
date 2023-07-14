package com.naver.domain.dto;

public class InsertCommentDto {
    private int user_seq;
    private int board_seq;
    private String content;

    public InsertCommentDto(int user_seq, int board_seq, String content) {
        this.user_seq = user_seq;
        this.board_seq = board_seq;
        this.content = content;
    }

    public int getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(int user_seq) {
        this.user_seq = user_seq;
    }

    public int getBoard_seq() {
        return board_seq;
    }

    public void setBoard_seq(int board_seq) {
        this.board_seq = board_seq;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
