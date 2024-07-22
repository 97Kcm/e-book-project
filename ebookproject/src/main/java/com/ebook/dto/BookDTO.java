package com.ebook.dto;


import lombok.*;

import java.util.Base64;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private Integer bookNo;
<<<<<<< HEAD
    private Integer no;
    private String bookTitle; // 책의 제목
    private String bookGenre; // 책의 장르
    private String bookAuthor; // 책의 작가
    private String bookPublisher; // 출판사
    private String bookCategory; // 카테고리
    private String bookDescription; // 설정  // text
    private FileDTO bookImage; // 책 이미지 // longblob
    private int bookLikeCount; // 책 좋아요 수 // like_count
    private List<BookChapterDTO> bookChapters;
=======
    private String bookTitle;
    private String bookGenre;
    private String bookAuthor;
    private String bookPublisher;
    private String bookCategory;
    private String bookDescription;
    private FileDTO bookImage;
    private Integer bookLikeCount;
    private List<BookChapterDTO> bookChapters;

>>>>>>> jh
}
