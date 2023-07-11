package com.naver.domain.dto;

public class CartDto {
    private int cart_seq;
    private int user_seq;
    private int product_seq;
    private String name;
    private int price;

    public CartDto(int cart_seq, int user_seq, int product_seq, String name, int price) {
        this.cart_seq = cart_seq;
        this.user_seq = user_seq;
        this.product_seq = product_seq;
        this.name = name;
        this.price = price;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
