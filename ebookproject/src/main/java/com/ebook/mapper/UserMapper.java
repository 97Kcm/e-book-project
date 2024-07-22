package com.ebook.mapper;

import com.ebook.dto.user.CashChargeDTO;
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

    UserDTO selectUserByIdAndNameAndEmail(
            @Param("id") String id,
            @Param("name") String name,
            @Param("email") String email
    );

    void resetUserPassword(
            @Param("id") String id,
            @Param("name") String name,
            @Param("email") String email,
            @Param("password") String EncodingPassword
    );

    /******************* 마이 페이지 정보 조회 ********************/
    UserDTO SelectUserInfo(UserDTO userDTO);


    /******************** 캐시 충전 ******************************/
    void insertCashCharge(
            @Param("userId") String userId,
            @Param("cashCharge") CashChargeDTO cashCharge
    );
    void updateUserCash(
            @Param("userId") String userId,
            @Param("cashAmount") Integer cashAmount
    );
}
