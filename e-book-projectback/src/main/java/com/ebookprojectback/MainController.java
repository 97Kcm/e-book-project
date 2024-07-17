package com.ebookprojectback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/mainPage")
    public String get_main() {
        return "mainPage";
    }

    @GetMapping("/mypage")
    public String get_mypage() {
        return "mypage";
    }

    @GetMapping("/header")
    public String get_header() {
        return "pub/header";
    }

}
