package com.ebook.service;

import com.ebook.dto.BookDTO;
import com.ebook.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
