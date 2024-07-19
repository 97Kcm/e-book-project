package com.ebook.controller;

import com.ebook.dto.BookDTO;
import com.ebook.dto.user.UserDTO;
import com.ebook.mapper.BookMapper;
import com.ebook.service.BookService;
import com.ebook.service.user.MyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class BookController {
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookService bookService;
    @Autowired
    private MyPageService myPageService;

    @GetMapping("/main")
    public String mainPageImage(
            @RequestParam(required = false) UserDTO userDTO,
            @RequestParam(value = "genre",required = false) String bookGenre,
            Model model
    ) {
        List<BookDTO> allBooks = bookMapper.findAllBooks();
        Map<String, List<BookDTO>> booksByCategory = allBooks.stream()
                .filter(book  -> bookGenre == null || book.getBookGenre().equals(bookGenre))
                .collect(Collectors.groupingBy(BookDTO::getBookCategory));
        UserDTO user = myPageService.getHeaderUser();
        model.addAttribute("user", user);
        model.addAttribute("booksByCategory", booksByCategory);
        return "main";
    }

    @GetMapping("/detail/{bookNo}")
    public String get_book(
            @PathVariable("bookNo") Integer bookNo,
            Model model
    ) {
        System.out.println(bookNo);
        BookDTO book = bookService.get_book(bookNo);
        System.out.println(book);
        model.addAttribute("book", book);
        return "detail";
    }





}
