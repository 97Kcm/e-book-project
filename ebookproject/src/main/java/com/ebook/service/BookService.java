package com.ebook.service;

import com.ebook.dto.BookChapterDTO;
import com.ebook.dto.BookDTO;
import com.ebook.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired private BookMapper bookMapper;

    // 책의 모든 정보를 가져옵니다.
    public List<BookDTO> findingAllBooks(){
        return bookMapper.findAllBooks();
    }

    public BookDTO get_book(Integer bookNo){
        return bookMapper.select_book_by_no(bookNo);
    }

//    public List<BookChapterDTO> get_books_chapters(Integer bookNo){
//
//        return bookMapper.select_book_chapters_by_book_no(bookNo);
//    }


}
