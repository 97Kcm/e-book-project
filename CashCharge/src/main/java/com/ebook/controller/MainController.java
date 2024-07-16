package com.ebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/mypage")
    public void get_myPage(){

    }
}


// 0716 기준으로 캐시충전 (카카오페이 결제 연동) 페이지 컨트롤러입니다. 메인은 임시 네이밍이라서 바뀔수도 있음
