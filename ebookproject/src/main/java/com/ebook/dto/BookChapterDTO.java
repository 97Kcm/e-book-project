package com.ebook.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookChapterDTO {
    private Integer no;
    private Integer bookNo;
    private String chapterName;
    private String chapterUploadDate;
    private Integer chapterPrice;
    private Boolean isBought; // 유저의 구매 여부
}
