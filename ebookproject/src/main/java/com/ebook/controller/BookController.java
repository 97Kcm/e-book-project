package com.ebook.controller;

<<<<<<< HEAD
import com.ebook.dto.BookChapterDTO;
import com.ebook.dto.BookDTO;
import com.ebook.service.BookService;
=======
import com.ebook.dto.BookDTO;
import com.ebook.dto.user.UserDTO;
import com.ebook.mapper.BookMapper;
import com.ebook.service.BookService;
import com.ebook.service.user.MyPageService;
>>>>>>> jh
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired BookService bookService;

    @GetMapping("/header")
    public String get_header() {
        return "pub/header";
    }

    @GetMapping("/viewerpage")
    public String get_viewrpage() {
        return "viewerpage";
=======
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
        UserDTO user = myPageService.getHeaderUser(userDTO);
        model.addAttribute("user", user);
        model.addAttribute("booksByCategory", booksByCategory);
        return "main";
>>>>>>> jh
    }

    @GetMapping("/detail/{bookNo}")
    public String get_book(
            @PathVariable("bookNo") Integer bookNo,
            Model model
    ) {
<<<<<<< HEAD
        BookDTO book = bookService.get_book(bookNo);
//        List<BookChapterDTO> bookChapters = bookService.get_books_chapters(bookNo);
        model.addAttribute("book", book);
//        model.addAttribute("chapter", bookChapters);
=======
        System.out.println(bookNo);
        BookDTO book = bookService.get_book(bookNo);
        System.out.println(book);
        model.addAttribute("book", book);
>>>>>>> jh
        return "detail";
    }



<<<<<<< HEAD
=======


>>>>>>> jh
}
