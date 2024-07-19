package com.ebook.controller;

import com.ebook.dto.BookChapterDTO;
import com.ebook.dto.BookDTO;
import com.ebook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BookController {
    @Autowired BookService bookService;

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
        System.out.println(bookNo);
        BookDTO book = bookService.get_book(bookNo);
        System.out.println(book);
//        List<BookChapterDTO> bookChapters = bookService.get_books_chapters(bookNo);
        model.addAttribute("book", book);
//        model.addAttribute("chapter", bookChapters);
        return "detail";
    }



}
