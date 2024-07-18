package com.ebookprojectback.mapper;

import com.ebookprojectback.dto.BookChapterDTO;
import com.ebookprojectback.dto.BookDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {

    BookDTO select_book_by_no(Integer bookNo);

//    List<BookChapterDTO> select_book_chapters_by_book_no(@Param("bookNo") Integer no);
}
