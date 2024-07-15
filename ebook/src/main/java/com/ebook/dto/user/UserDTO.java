package com.ebook.dto.user;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String ci;
    private String password;
    private String email;
    private String name;
    private String nickname;
    private byte[] profileImage;
}
