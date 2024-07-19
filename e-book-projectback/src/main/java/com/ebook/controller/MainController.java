package com.ebook.controller;

import com.ebook.dto.user.UserDTO;
import com.ebook.service.user.MyPageService;
import com.ebook.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    UserService userService;
    MyPageService myPageService;

    @GetMapping("/main")
    public void get_main(){}

    @GetMapping("/main")
    public void get_header_user(
            @RequestParam(required = false) UserDTO user,
            Model model
    ) {
        model.addAttribute("user", user);
        List<UserDTO> userinfo = myPageService.getHeaderUser(user);
    }

}
