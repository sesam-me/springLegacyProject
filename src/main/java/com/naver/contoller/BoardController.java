package com.naver.contoller;

import com.naver.domain.dto.BoardDto;
import com.naver.domain.dto.MyBoardDto;
import com.naver.domain.entity.Board;
import com.naver.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    public ModelAndView boardWrite(ModelAndView mav, @ModelAttribute BoardDto boardDto, HttpSession session){
        int boardwrite = boardService.boardWrite(boardDto);

        if(boardwrite == 1){
            mav.setViewName("redirect:/boardlist");
        }

        return  mav;
    }

    @GetMapping("/boardlist")
    public ModelAndView boardList(ModelAndView mav, HttpSession session){
        List<MyBoardDto> myBoardList = boardService.boardList((Integer) session.getAttribute("user_seq"));
        mav.addObject("myBoardList", myBoardList);
        mav.setViewName("/boardView/boardList");
        return mav;
    }
}
