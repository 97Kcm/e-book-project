package com.ebook.mapper;

import com.ebook.dto.BookDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {

    BookDTO select_book_by_no(Integer bookNo);

//    List<BookChapterDTO> select_book_chapters_by_book_no(@Param("bookNo") Integer no);
}
