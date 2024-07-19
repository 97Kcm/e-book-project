package com.ebook.controller;

import com.ebook.dto.BookDTO;
import com.ebook.mapper.BookMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class MainController {
    private final BookMapper bookMapper;

    public MainController(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @GetMapping("/main")
    public String mainPageImage(
            @RequestParam(value = "genre",required = false) String bookGenre,
            Model model
    ) {
        List<BookDTO> allBooks = bookMapper.findAllBooks();

        Map<String, List<BookDTO>> booksByCategory = allBooks.stream()
                .filter(book  -> bookGenre == null || book.getBookGenre().equals(bookGenre))
                .collect(Collectors.groupingBy(BookDTO::getBookCategory));

        model.addAttribute("booksByCategory", booksByCategory);
        return "main";
    }
}
