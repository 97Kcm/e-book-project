package com.ebookprojectback.mapper;

import com.ebookprojectback.dto.BookDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookMapper {

    BookDTO select_book_by_no(
            @Param("bookNo") Integer no);
}
