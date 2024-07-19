package com.ebook.controller;

import com.ebook.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchRestController {
    @Autowired
    UserService userService;

    @GetMapping("/serach")
    public String post_search(){
        return "search";
    }
}
