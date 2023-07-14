package com.naver.service;

import com.naver.dao.BoardMapper;
import com.naver.domain.dto.*;
import com.naver.domain.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public int boardWrite(BoardWriteDto boardWriteDto){
        return boardMapper.boardWrite(boardWriteDto);
    }

    public List<MyBoardDto> boardList(){
        return boardMapper.boardList();
    }
    public BoardDto boardView(int board_seq){return boardMapper.boardView(board_seq);}
    public int boardUpdate(BoardDto boardDto){return boardMapper.boardUpdate(boardDto);}
    public int boardDelete(int board_seq){return boardMapper.boardDelete(board_seq);}
    public int insertComment(InsertCommentDto insertCommentDto){return boardMapper.insertComment(insertCommentDto);}
    public List<Comment> viewComment(MyCommentDto myCommentDto){return boardMapper.viewComment(myCommentDto);}
}
