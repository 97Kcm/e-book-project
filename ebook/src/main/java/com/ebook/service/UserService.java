package com.ebook.service;

import com.ebook.dto.user.UserDTO;
import com.ebook.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    void createUser(UserDTO user) {
        userMapper.insertUser(user);
    }

}
