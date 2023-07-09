package com.naver.contoller;

import com.naver.domain.entity.User;
import com.naver.domain.request.InsertRequest;
import com.naver.domain.request.UpdateRequest;
import com.naver.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/delete")
    public ModelAndView delete(@RequestParam int user_seq, ModelAndView mav){
        int result = userService.delete(user_seq);
        if (result == 1){
            mav.setViewName("redirect:/user");
        }
        return mav;
    }

    @GetMapping("/update")
    public ModelAndView viewUpdate(@RequestParam int user_seq, ModelAndView mav){
        User user = userService.findByUserSeq(user_seq);
        mav.addObject("user",user);
        mav.setViewName("/update");
        return mav;
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute UpdateRequest updateRepuest, ModelAndView mav){
        int result = userService.update(updateRepuest);
        if(result == 1 ){
            mav.setViewName("redirect:/user");
        } else {
            mav.setViewName("redirect:/user");
        }
        return mav;
    }

    @GetMapping("/insert")
    public ModelAndView viewInsert(ModelAndView mav){
        mav.setViewName("/insert");
        return mav;
    }

    @PostMapping("/insert")
    public ModelAndView Insert(ModelAndView mav, @ModelAttribute InsertRequest insertRequest){
        int result = userService.insert(insertRequest);
        if(result == 1){
//          mav.setViewName("/user");는 user.jsp로 감.
//          mav.setViewName("redirect:/user");는 GETMAPPING("/user")로 감.
            mav.setViewName("redirect:/user");
        } else {
            mav.setViewName("redirect:/insert");
        }
        return mav;
    }

}
