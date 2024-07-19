package com.ebook.mapper;

import com.ebook.dto.BookDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    /* 책 정보 가져오기 */
    // 책의 모든 정보를 가져온다.
//    List<BookDTO> getAllBooksDetail();

    List<BookDTO> findAllBooks();
}
