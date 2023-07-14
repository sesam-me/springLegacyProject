package com.naver.domain.dto;

public class LikeUpdateDto {
    private int user_seq;
    private int product_seq;
    private int result;

    public LikeUpdateDto(int user_seq, int product_seq, int result) {
        this.user_seq = user_seq;
        this.product_seq = product_seq;
        this.result = result;
    }

    @Override
    public String toString() {
        return "LikeUpdateDto{" +
                "user_seq=" + user_seq +
                ", product_seq=" + product_seq +
                ", result=" + result +
                '}';
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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
