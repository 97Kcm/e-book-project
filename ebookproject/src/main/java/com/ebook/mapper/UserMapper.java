package com.ebook.mapper;

import com.ebook.dto.BookDTO;
import com.ebook.dto.user.CashChargeDTO;
import com.ebook.dto.user.CustomUserDTO;
import com.ebook.dto.user.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO selectUserById(String id);

    void insertUser(UserDTO userDTO);

    UserDTO selectUserByCi(String ci);

    CustomUserDTO selectCustomUserById(String id);

    void insertSocialUser(CustomUserDTO socialUser);

    /******************* 아이디 찾기 *********************/

    UserDTO selectUserByNameAndEmail(
            @Param("userName") String name,
            @Param("userName") String email
    );

    /******************* 비밀번호 재설정 *******************/

    UserDTO selectUserByIdAndNameAndEmail(
            @Param("userId") String id,
            @Param("userName") String name,
            @Param("userEmail") String email
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
    /******************** 좋아요 하기 *****************************/
    List<BookDTO> selectBookByUserLike(String userId);
    void insertBookLike(
            @Param("userId") String userId,
            @Param("bookNo") Integer bookNo
    );
    void deleteBookLike(
            @Param("userId") String userId,
            @Param("bookNo") Integer bookNo
    );
}
