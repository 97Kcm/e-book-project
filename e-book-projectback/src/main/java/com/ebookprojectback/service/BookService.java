package com.ebookprojectback.service;

import com.ebookprojectback.dto.BookChapterDTO;
import com.ebookprojectback.dto.BookDTO;
import com.ebookprojectback.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired private BookMapper bookMapper;

    public BookDTO get_book(Integer bookNo){
        return bookMapper.select_book_by_no(bookNo);
    }

//    public List<BookChapterDTO> get_books_chapters(Integer bookNo){
//
//        return bookMapper.select_book_chapters_by_book_no(bookNo);
//    }


}
