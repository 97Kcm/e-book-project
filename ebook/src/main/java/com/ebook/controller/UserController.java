package com.ebook.controller;

import com.ebook.dto.user.UserDTO;
import com.ebook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public void get_login(){}

    @GetMapping("/register")
    public void get_register(){}

    @PostMapping("/register")
    public void post_register(
        UserDTO userDTO
    ){
        System.out.println(userDTO);
    }
}
