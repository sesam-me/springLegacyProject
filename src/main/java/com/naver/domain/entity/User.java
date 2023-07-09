package com.naver.domain.entity;

public class User {
    private int user_seq;
    private String id;
    private String password;
    private String name;
    private String address;
    private String phone;

    public User(int user_seq, String id, String password, String name, String address, String phone) {
        this.user_seq = user_seq;
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(int user_seq) {
        this.user_seq = user_seq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
