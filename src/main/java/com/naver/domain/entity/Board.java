package com.naver.domain.entity;

public class Board {
    private int board_seq;
    private int user_seq;
    private String title;
    private String content;

    public Board(int board_seq, int user_seq, String title, String content) {
        this.board_seq = board_seq;
        this.user_seq = user_seq;
        this.title = title;
        this.content = content;
    }

    public int getBoard_seq() {
        return board_seq;
    }

    public void setBoard_seq(int board_seq) {
        this.board_seq = board_seq;
    }

    public int getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(int user_seq) {
        this.user_seq = user_seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
