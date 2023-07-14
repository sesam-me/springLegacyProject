package com.naver.dao;

import com.naver.domain.dto.*;
import com.naver.domain.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int boardWrite(BoardWriteDto boardWriteDto);
    List<MyBoardDto> boardList();
    BoardDto boardView(int board_seq);
    int boardUpdate(BoardDto boardDto);
    int boardDelete(int board_seq);
    int insertComment(InsertCommentDto insertCommentDto);
    List<Comment> viewComment(MyCommentDto myCommentDto);
}
