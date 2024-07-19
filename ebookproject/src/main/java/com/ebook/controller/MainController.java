package com.ebook.controller;

import com.ebook.dto.user.UserDTO;
import com.ebook.service.user.MyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    MyPageService myPageService;

    @GetMapping("/cashcharge")
    public void get_cashcharge(){}

    @GetMapping("/detail")
    public void get_detail(){}

//    @GetMapping("/main")
//    public void get_header_user(
//            @RequestParam(required = false) UserDTO userDTO,
//            Model model
//    ) {
//        UserDTO user = myPageService.getHeaderUser(userDTO);
//        model.addAttribute("user", user);
//    }

}
