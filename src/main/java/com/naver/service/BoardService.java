package com.naver.service;

import com.naver.dao.BoardMapper;
import com.naver.domain.dto.BoardDto;
import com.naver.domain.dto.MyBoardDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public int boardWrite(BoardDto boardDto){
        return boardMapper.boardWrite(boardDto);
    }

    public List<MyBoardDto> boardList(int user_seq){
        return boardMapper.boardList(user_seq);
    }
}
