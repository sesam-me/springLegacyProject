package com.naver.service;

import com.naver.dao.UserMapper;
import com.naver.domain.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }

}
