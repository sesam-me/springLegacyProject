package com.naver.dao;

import com.naver.domain.dto.LoginDto;
import com.naver.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User login(LoginDto loginDto);

}
