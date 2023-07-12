package com.naver.dao;

import com.naver.contoller.BoardController;
import com.naver.domain.dto.BoardDto;
import com.naver.domain.dto.MyBoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int boardWrite(BoardDto boardDto);
    List<MyBoardDto> boardList(int user_seq);
}
