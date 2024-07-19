package com.ebook.service;

import com.ebook.dto.BookDTO;
import com.ebook.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    // 책의 모든 정보를 가져옵니다.
    public List<BookDTO> findingAllBooks(){
        return bookMapper.findAllBooks();
    }
}
