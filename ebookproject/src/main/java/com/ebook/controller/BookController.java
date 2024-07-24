package com.ebook.controller;

import com.ebook.dto.BookChapterDTO;
import com.ebook.dto.BookDTO;
import com.ebook.dto.user.UserDTO;
import com.ebook.mapper.BookMapper;
import com.ebook.service.BookService;
import com.ebook.service.user.MyPageService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;
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

    @GetMapping("/viewerpage/{bookNo}/{chapterNo}")
    public String get_viewerpage(
            @PathVariable("bookNo") Integer bookNo,
            @PathVariable("chapterNo") Integer chapterNo,
            Model model
    ) {
        BookDTO books = bookService.getBookChapters(bookNo, chapterNo);
        List<BookChapterDTO> chapters = bookService.getBookAllChapters(bookNo);
        Integer chapterCount = 0;
        for (BookChapterDTO chapter : chapters) {
            if(Objects.equals(chapter.getNo(), chapterNo)){
                chapterCount = chapter.getNo();
            }
//            System.out.println(chapter.getNo());
        }
        model.addAttribute("chapterCount", chapterCount);
        model.addAttribute("chapters", chapters);
        model.addAttribute("books", books);
        for(BookChapterDTO chapter : chapters){
            if(Objects.equals(chapter.getNo(), chapterNo)){
                return "viewerpage";
            }
        }
        return null;
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

    @GetMapping("/detail/{bookNo}/{sort}")
    public String get_book(
            @AuthenticationPrincipal UserDTO user,
            @PathVariable("bookNo") Integer bookNo,
            @PathVariable("sort") String sort,
            Model model
    ) {
        BookDTO book = bookService.get_book(bookNo, user, sort);
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
