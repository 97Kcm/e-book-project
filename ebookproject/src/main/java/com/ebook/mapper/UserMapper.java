package com.ebook.mapper;

<<<<<<< HEAD
import com.ebook.dto.UserDTO;
=======
import com.ebook.dto.user.CustomUserDTO;
import com.ebook.dto.user.UserDTO;
>>>>>>> 4b32d3bf719638e375094087c5822a7d16ddd8eb
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    UserDTO selectUserById(String id);

    void insertUser(UserDTO userDTO);

<<<<<<< HEAD
=======
    UserDTO selectUserByCi(String ci);

    CustomUserDTO selectCustomUserById(String id);

    void insertSocialUser(CustomUserDTO socialUser);

>>>>>>> 4b32d3bf719638e375094087c5822a7d16ddd8eb
}
