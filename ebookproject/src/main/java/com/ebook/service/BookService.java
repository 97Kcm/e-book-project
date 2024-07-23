package com.ebook.service;

import com.ebook.dto.BookChapterDTO;
import com.ebook.dto.BookDTO;
import com.ebook.dto.user.UserDTO;
import com.ebook.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookService {
    @Autowired private BookMapper bookMapper;

    // 책의 모든 정보를 가져옵니다.
    public List<BookDTO> findingAllBooks(){
        return bookMapper.findAllBooks();
    }

    public BookDTO get_book(Integer bookNo, UserDTO user){
        if(Objects.isNull(user)){
            return bookMapper.select_book_by_no(bookNo, null);
        }else {
            return bookMapper.select_book_by_no(bookNo, user.getUserId());
        }
    }


//    public List<BookChapterDTO> get_books_chapters(Integer bookNo){
//
//        return bookMapper.select_book_chapters_by_book_no(bookNo);
//    }

    public List<BookDTO> searchBooksByTitle(String search){
        return bookMapper.findAllBooksByTitle(search);
    }


}
