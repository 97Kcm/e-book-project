package com.ebook.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;

@Getter
@Setter
@ToString
public class FileDTO {
    private MultipartFile file;
    private byte[] data;

    public void setFile(MultipartFile file) {
        this.file = file;
        try {
            data = file.getBytes();
        }catch (Exception e){}
    }

//    public String getBookImageUrl() {
//        try {
//            return Base64.getEncoder().encodeToString(this.bookImage);
//        }catch (Exception e){
//            return null;
//        }
//    }



}
