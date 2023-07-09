package com.naver.service;

import com.naver.dao.UserMapper;
import com.naver.domain.entity.User;
import com.naver.domain.request.InsertRequest;
import com.naver.domain.request.UpdateRequest;
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

    public int delete(int user_seq){
        return userMapper.delete(user_seq);
    }
    public int update(UpdateRequest updateRepuest){
        return userMapper.update(updateRepuest);
    }

    public User findByUserSeq(int user_seq){
        return userMapper.findByUserSeq(user_seq);
    }

    public int insert(InsertRequest insertRequest){
        return userMapper.insert(insertRequest);
    }

}
