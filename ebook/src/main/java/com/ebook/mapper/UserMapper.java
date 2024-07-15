package com.ebook.mapper;

import com.ebook.dto.user.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insertUser(UserDTO userDTO);




}
