package com.ebook.service;

<<<<<<< HEAD
import com.ebook.dto.BookChapterDTO;
=======
>>>>>>> jh
import com.ebook.dto.BookDTO;
import com.ebook.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> jh
@Service
public class BookService {
    @Autowired private BookMapper bookMapper;

<<<<<<< HEAD
    // 책의 모든 정보를 가져옵니다.
    public List<BookDTO> findingAllBooks(){
        return bookMapper.findAllBooks();
    }

=======
>>>>>>> jh
    public BookDTO get_book(Integer bookNo){
        return bookMapper.select_book_by_no(bookNo);
    }

<<<<<<< HEAD
=======
    


>>>>>>> jh
//    public List<BookChapterDTO> get_books_chapters(Integer bookNo){
//
//        return bookMapper.select_book_chapters_by_book_no(bookNo);
//    }


}
