package com.ebookprojectback.dto;


import lombok.*;

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
    private Integer bookLikeCount;

}
