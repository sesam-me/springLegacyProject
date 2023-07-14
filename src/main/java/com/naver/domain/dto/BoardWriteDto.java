package com.naver.domain.dto;

public class BoardWriteDto {
    private int user_seq;
    private String title;
    private String content;

    public BoardWriteDto(int user_seq, String title, String content) {
        this.user_seq = user_seq;
        this.title = title;
        this.content = content;
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
