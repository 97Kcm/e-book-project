package com.ebook.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

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
}
