package com.ebook.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class BookDTO {
    private int no; // 책의 번호
    private String bookTitle; // 책의 제목
    private String bookGenre; // 책의 장르
    private String bookAuthor; // 책의 작가
    private String bookPublisher; // 출판사
    private String bookDescription; // 설정  // text
    private String bookCategory; // 카테고리
    private FileDTO bookImage; // 책 이미지 // longblob
    private int bookLikeCount; // 책 좋아요 수 // like_count
}
