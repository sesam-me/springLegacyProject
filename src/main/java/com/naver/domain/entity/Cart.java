package com.naver.domain.entity;

public class Cart {
    private int cart_seq;
    private int user_seq;
    private int product_seq;

    public Cart(int cart_seq, int user_seq, int product_seq) {
        this.cart_seq = cart_seq;
        this.user_seq = user_seq;
        this.product_seq = product_seq;
    }

    public int getCart_seq() {
        return cart_seq;
    }

    public void setCart_seq(int cart_seq) {
        this.cart_seq = cart_seq;
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
