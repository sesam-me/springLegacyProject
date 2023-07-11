package com.naver.service;

import com.naver.dao.UserMapper;
import com.naver.domain.dto.LoginDto;
import com.naver.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User login(LoginDto loginDto){
        return userMapper.login(loginDto);
    }
}
