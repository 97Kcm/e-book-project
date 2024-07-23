package com.ebook.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;

@Getter
@Setter
@ToString(exclude = {"data","fileUrl"})
public class FileDTO {
    private MultipartFile file;
    private byte[] data;
    private String fileName;
    private String fileUrl;

    public void setData(byte[] data) {
        this.data = data;
        if (this.data != null) {
            String base64 = Base64.getEncoder().encodeToString(this.data);
            fileUrl = "data:image/jpeg;base64," + base64;
        }
    }
}
