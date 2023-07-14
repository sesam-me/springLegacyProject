package com.naver.contoller;

import com.naver.domain.dto.*;
import com.naver.domain.entity.Comment;
import com.naver.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BoardController {
    BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board")
    public ModelAndView board(ModelAndView mav){
        mav.setViewName("/boardView/boardMain");
        return mav;
    }


    @GetMapping("/boardwrite")
    public ModelAndView boardWrite(ModelAndView mav, HttpSession session){
        mav.addObject("user_seq", session.getAttribute("user_seq"));
        mav.setViewName("/boardView/boardWrite");
        return mav;
    }

    @PostMapping("/boardwrite")
    public ModelAndView boardWrite(ModelAndView mav, @ModelAttribute BoardWriteDto boardWriteDto){
        int boardwrite = boardService.boardWrite(boardWriteDto);

        if(boardwrite == 1){
            mav.setViewName("redirect:/boardlist");
        }

        return  mav;
    }

    @GetMapping("/boardlist")
    public ModelAndView boardList(ModelAndView mav, HttpSession session){
        List<MyBoardDto> myBoardList = boardService.boardList();

        mav.addObject("myBoardList", myBoardList);
        mav.setViewName("/boardView/boardList");
        return mav;
    }

    @GetMapping("/boardupdate/{board_seq}")
    public ModelAndView boardUpdate(ModelAndView mav, @PathVariable("board_seq") int board_seq){
        BoardDto board = boardService.boardView(board_seq);
        mav.addObject("board",board);
        mav.setViewName("/boardView/boardUpdate");
        return mav;
    }

    @PostMapping("/boardupdate")
    public ModelAndView boardUpdate(ModelAndView mav, @ModelAttribute BoardDto boardDto){
        int result = boardService.boardUpdate(boardDto);
        if(result == 1) {
            mav.setViewName("redirect:/boardlist");
        }
        return mav;
    }

    @GetMapping("/boarddelete/{board_seq}")
    public ModelAndView boardDelete(ModelAndView mav, @PathVariable("board_seq") int board_seq){
        int result = boardService.boardDelete(board_seq);
        if(result == 1) {
            mav.setViewName("redirect:/boardlist");
        }
        return mav;
    }

    @GetMapping("/boarddetail/{board_seq}")
    public ModelAndView boardDetail(ModelAndView mav, @PathVariable("board_seq") int board_seq, HttpSession session) {
        BoardDto board = boardService.boardView(board_seq);
        MyCommentDto myCommentDto = new MyCommentDto((Integer) session.getAttribute("user_seq"), board_seq);

        List<Comment> commentlist = boardService.viewComment(myCommentDto);

        mav.setViewName("/boardView/boardDetail");
        mav.addObject("commentlist", commentlist);
        mav.addObject("board", board);
        return mav;
    }


    @PostMapping("/insertcomment")
    public ModelAndView insertComment(ModelAndView mav, @ModelAttribute InsertCommentDto insertCommentDto){
        System.out.println(insertCommentDto);
//        int result,  = boardService.insertComment(commentDto);
//
//        System.out.println(result);
//        if(result == 1) {
//            mav.setViewName("redirect:/boarddetail/" + commentDto.getBoard_seq());
//        }
//        return mav;

        return null;
    }

//    @GetMapping("/boarddatail/{board_seq}")
//    public ModelAndView veiwComment
}
