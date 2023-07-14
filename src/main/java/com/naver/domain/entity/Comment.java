package com.naver.domain.entity;

public class Comment {
    private int comment_seq;
    private int user_seq;
    private int board_seq;
    private String content;

    @Override
    public String toString() {
        return "Comment{" +
                "comment_seq=" + comment_seq +
                ", user_seq=" + user_seq +
                ", board_seq=" + board_seq +
                ", content='" + content + '\'' +
                '}';
    }

    public Comment(int comment_seq, int user_seq, int board_seq, String content) {
        this.comment_seq = comment_seq;
        this.user_seq = user_seq;
        this.board_seq = board_seq;
        this.content = content;
    }

    public int getComment_seq() {
        return comment_seq;
    }

    public void setComment_seq(int comment_seq) {
        this.comment_seq = comment_seq;
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
