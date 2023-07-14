package com.naver.domain.dto;

public class MyCommentDto {
    private int user_seq;
    private int board_seq;

    public MyCommentDto(int user_seq, int board_seq) {
        this.user_seq = user_seq;
        this.board_seq = board_seq;
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

    @Override
    public String toString() {
        return "MyCommentDto{" +
                "user_seq=" + user_seq +
                ", board_seq=" + board_seq +
                '}';
    }
}
