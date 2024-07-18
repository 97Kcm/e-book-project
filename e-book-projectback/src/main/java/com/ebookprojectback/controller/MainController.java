package com.ebookprojectback.controller;

import com.ebookprojectback.dto.BookDTO;
import com.ebookprojectback.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @Autowired BookService bookService;

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

    @GetMapping("/cashcharge")
    public String get_cashcharge() {
        return "cashcharge";
    }

    @GetMapping("/viewerpage")
    public String get_viewrpage() {
        return "viewerpage";
    }

    @GetMapping("/detail/{bookNo}")
    public String get_book(
            @PathVariable("bookNo") Integer bookNo,
            Model model
    ) {
        BookDTO book = bookService.get_book(bookNo);
        model.addAttribute("detail", book);
        return "detail";
    }

}
