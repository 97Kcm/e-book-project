package com.ebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CashController {
    // mypage 에서 충전 버튼을 누르면 cashcharge 화면으로 넘어가진다.
    @GetMapping("/cashcharge")
    public void get_cashcharge(){

    }
}
