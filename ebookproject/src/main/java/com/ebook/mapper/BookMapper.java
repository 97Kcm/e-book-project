package com.ebook.mapper;

import com.ebook.dto.BookDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    /* 책 정보 가져오기 */
    // 책의 모든 정보를 가져온다.
//    List<BookDTO> getAllBooksDetail();

    // 책의 카테고리를 가져온다.
    List<BookDTO> findAllBooksByCategory();


    List<BookDTO> findAllBooks();
}
