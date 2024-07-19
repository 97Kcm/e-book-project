package com.ebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/cashcharge")
    public void get_cashcharge(){}

    @GetMapping("/detail")
    public void get_detail(){}

}
