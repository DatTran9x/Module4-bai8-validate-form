package com.codegym.validateform.controll;

import com.codegym.validateform.model.User;
import com.codegym.validateform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/home")
    public ModelAndView show(){
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("user",new User());
        return mav;
    }

    @PostMapping("/home")
    public ModelAndView add(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            ModelAndView mav = new ModelAndView("home");
            mav.addObject("user",user);
            mav.addObject("message","Make sure you write it right!");
            return mav;
        } else {
            ModelAndView mav = new ModelAndView("home");
            mav.addObject("user",user);
            mav.addObject("message","Congratulation!");
            return mav;
        }
    }
}
