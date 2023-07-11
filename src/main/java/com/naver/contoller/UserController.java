package com.naver.contoller;

import com.naver.domain.dto.LoginDto;
import com.naver.domain.entity.User;
import com.naver.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ModelAndView viewLogin(ModelAndView mav){
        mav.setViewName("/userView/login");
        return mav;
    }

    @PostMapping("/login")
    public ModelAndView login(ModelAndView mav, @ModelAttribute LoginDto loginDto, HttpSession session){
        User login =  userService.login(loginDto);

       if(login != null){
           session.setAttribute("id",login.getId());
           session.setAttribute("user_seq",login.getUser_seq());
           mav.setViewName("/main");
       } else {
           mav.setViewName("/userView/login");
       }

       return mav;
    }
}
