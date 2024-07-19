package com.ebook.mapper;

import com.ebook.dto.user.CustomUserDTO;
import com.ebook.dto.user.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.userdetails.User;

@Mapper
public interface UserMapper {

    UserDTO selectUserById(String id);

    void insertUser(UserDTO userDTO);

    UserDTO selectUserByCi(String ci);

    CustomUserDTO selectCustomUserById(String id);

    void insertSocialUser(CustomUserDTO socialUser);

    /******************* 아이디 찾기 *********************/

    UserDTO selectUserByNameAndEmail(
            @Param("name") String name,
            @Param("email") String email
    );

    /******************* 비밀번호 재설정 *******************/

    UserDTO selectUserByIdAndEmail(
            @Param("id") String id,
            @Param("name") String name,
            @Param("email") String email
    );

    void updateCashByUser(
            @Param("user") UserDTO user,
            @Param("amount") int amount);

    /******************* 마이 페이지 정보 조회 ********************/
    UserDTO SelectUserInfo();


}
