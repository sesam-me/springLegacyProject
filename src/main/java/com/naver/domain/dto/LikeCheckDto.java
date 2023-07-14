package com.naver.domain.dto;

public class LikeCheckDto {
    private int user_seq;
    private int product_seq;

    public LikeCheckDto(int user_seq, int product_seq) {
        this.user_seq = user_seq;
        this.product_seq = product_seq;
    }

    public int getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(int user_seq) {
        this.user_seq = user_seq;
    }

    public int getProduct_seq() {
        return product_seq;
    }

    public void setProduct_seq(int product_seq) {
        this.product_seq = product_seq;
    }
}
