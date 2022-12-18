package com.entertainment.travelbuddy.controllers;

import com.entertainment.travelbuddy.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

//    Create User Account
    @GetMapping("/sign-up")
    public String signUp(Model model){
//        model.addAllAttributes("user", new User());
        return "user/register";
    }
}
