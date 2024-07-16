package com.ebook.mapper;

import com.ebook.dto.user.CustomUserDTO;
import com.ebook.dto.user.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    UserDTO selectUserById(String id);

    void insertUser(UserDTO userDTO);

    UserDTO selectUserByCi(String ci);

    CustomUserDTO selectCustomUserById(String id);

    void insertSocialUser(CustomUserDTO socialUser);

}
