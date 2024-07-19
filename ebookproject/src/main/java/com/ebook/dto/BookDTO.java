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
    private String bookTitle;
    private String bookGenre;
    private String bookAuthor;
    private String bookPublisher;
    private String bookCategory;
    private String bookDescription;
    private FileDTO bookImage;
    private Integer bookLikeCount;
    private List<BookChapterDTO> bookChapters;

}
