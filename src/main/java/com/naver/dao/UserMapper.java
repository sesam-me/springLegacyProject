package com.naver.dao;

import com.naver.domain.entity.User;
import com.naver.domain.request.InsertRequest;
import com.naver.domain.request.UpdateRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    int delete(int user_seq);
    int update(UpdateRequest updateRepuest);
    User findByUserSeq(int user_seq);
    int insert(InsertRequest insertRequest);
}
