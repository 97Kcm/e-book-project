package com.ebook.mapper;

import com.ebook.dto.BookChapterDTO;
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

    //    챕터당 가격 조회
    Integer selectChapterPrice(@Param("chapterNo") Integer chapterNo);

    // 유저 캐시 차감
    void updateBuyResult(@Param("userId") String userId, @Param("chaptersPrice") Integer chaptersPrice);

    /******************** 유저가 구매한 책 정보 저장 *******************/
    void insertUserByBook(@Param("no") Integer bookNo,
                          @Param("user") UserDTO user,
                          @Param("chaptersPrice") Integer chapterPrice);

}
