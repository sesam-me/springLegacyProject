package com.naver.contoller;

import com.naver.domain.entity.User;
import com.naver.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ModelAndView showMain(ModelAndView mav){
        List<User> userList = userService.findAll();
        mav.addObject("userlist", userList);
        mav.setViewName("/user");

        return mav;
    }

}
