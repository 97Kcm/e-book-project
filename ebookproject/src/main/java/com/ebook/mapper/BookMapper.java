package com.ebook.mapper;

import com.ebook.dto.BookChapterDTO;
import com.ebook.dto.BookDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {
    // 책의 카테고리를 가져온다.
    List<BookDTO> findAllBooksByCategory();
    BookDTO select_book_by_no(
            @Param("bookNo") Integer bookNo,
            @Param("userId") String userId
    );
    List<BookDTO> findAllBooks();

    List<BookDTO> findAllBooksByTitle(
            @Param("search") String search);
}
