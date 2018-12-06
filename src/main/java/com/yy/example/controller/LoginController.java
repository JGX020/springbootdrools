package com.yy.example.controller;


import com.yy.example.bean.User;
import com.yy.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public Object login(String name ) {
        System.out.println("111");
        return null;
    }
}
