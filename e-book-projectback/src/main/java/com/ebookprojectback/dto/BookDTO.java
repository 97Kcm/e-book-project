package com.ebookprojectback.dto;


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
    private byte[] bookImage;
    private String bookImageUrl;
    private Integer bookLikeCount;
    private List<BookChapterDTO> bookChapters;

    public String getBookImageUrl() {
        try {
            return Base64.getEncoder().encodeToString(this.bookImage);
        }catch (Exception e){
            return null;
        }
    }
}
