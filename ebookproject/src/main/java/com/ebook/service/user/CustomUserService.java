package com.ebook.service.user;

<<<<<<< HEAD
import com.ebook.dto.UserDTO;
=======
import com.ebook.dto.user.UserDTO;
>>>>>>> 4b32d3bf719638e375094087c5822a7d16ddd8eb
import com.ebook.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CustomUserService implements UserDetailsService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("로그인 시도하는 유저명 : " + username);
        UserDTO findUser = userMapper.selectUserById(username);// 해당 id를 가진 유저를 db에서 조회

        // 유저를 못찾았다면 로그인을 시키면 안된다
        if(Objects.isNull(findUser)){
            throw new UsernameNotFoundException("Error : User Not Found");
        }
        return findUser;
    }
}
