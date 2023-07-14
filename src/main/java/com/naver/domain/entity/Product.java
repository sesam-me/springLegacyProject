package com.naver.domain.entity;


public class Product {
    private int product_seq;
    private String name;
    private int price;
    private int count;

    private int like_count;

    public Product(int product_seq, String name, int price, int count, int like_count) {
        this.product_seq = product_seq;
        this.name = name;
        this.price = price;
        this.count = count;
        this.like_count = like_count;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
