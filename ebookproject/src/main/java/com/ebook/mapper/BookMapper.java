package com.ebook.mapper;

<<<<<<< HEAD
import com.ebook.dto.BookChapterDTO;
import com.ebook.dto.BookDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
=======
import com.ebook.dto.BookDTO;
import org.apache.ibatis.annotations.Mapper;
>>>>>>> jh

import java.util.List;

@Mapper
public interface BookMapper {
<<<<<<< HEAD

    BookDTO select_book_by_no(Integer bookNo);
=======
    /* 책 정보 가져오기 */
    // 책의 모든 정보를 가져온다.
//    List<BookDTO> getAllBooksDetail();
>>>>>>> jh

    // 책의 카테고리를 가져온다.
//    List<BookDTO> findAllBooksByCategory();

<<<<<<< HEAD

    List<BookDTO> findAllBooks();

//    List<BookChapterDTO> select_book_chapters_by_book_no(@Param("bookNo") Integer no);
=======
    BookDTO select_book_by_no(Integer bookNo);
    List<BookDTO> findAllBooks();


>>>>>>> jh
}
