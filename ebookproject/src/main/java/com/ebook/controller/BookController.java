package com.ebook.controller;

import com.ebook.dto.BookChapterDTO;
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
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@Controller
public class BookController {
    @Autowired private BookMapper bookMapper;
    @Autowired private BookService bookService;
    @Autowired private MyPageService myPageService;

    @GetMapping("/header")
    public String get_header() {
        return "pub/header";
    }

    @GetMapping("/viewerpage")
    public String get_viewrpage() {
        return "viewerpage";
    }

//    @GetMapping("/main")
//    public String mainPageImage(
//            @RequestParam(required = false) UserDTO userDTO,
//            @RequestParam(value = "genre",required = false) String bookGenre,
//            Model model
//    ) {
//        // 책 목록을 전체 가져오기
//        List<BookDTO> allBooks = bookService.findingAllBooks();
//        // 장르별로 필터링
//        allBooks = allBooks.parallelStream().filter(book  -> bookGenre == null || book.getBookGenre().equals(bookGenre)).toList();
//        // 카테고리 별 그룹화 진행
//        Map<String, List<BookDTO>> booksByCategory = allBooks.stream()
//                .collect(Collectors.groupingBy(BookDTO::getBookCategory));
//        // 그 중에서 5개 랜덤 선택
//        List<BookDTO> randomBookByGenre = getRandomBooks(allBooks, 5);
//        model.addAttribute("booksByCategory", booksByCategory);
//        model.addAttribute("randomBookByGenre", randomBookByGenre);
//        return "main";
//    }

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




    // 책을 랜덤으로 뽑아오기 위한 함수 생성
    private List<BookDTO> getRandomBooks(List<BookDTO> books, int i) {
        Random random = new Random();
        return random.ints(0, books.size())
                .distinct() // 중복 제거
                .limit(i)
                .mapToObj(books::get)
                .collect(Collectors.toList());
    }
}