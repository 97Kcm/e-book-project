package com.ebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyPageController {
    @GetMapping("/mypage")
    public void mypage() {}

    @PostMapping("/mypage")
    public void mypagePost() {}




}
