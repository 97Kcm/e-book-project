package com.ebook.controller;

import com.ebook.dto.user.UserDTO;
import com.ebook.service.user.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Objects;

@Log4j2
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public void login() {}

    @GetMapping("/register")
    public void get_register(){}

    @PostMapping("/register")
    public String post_register(
            @RequestParam String impUid,
            @Validated UserDTO userDTO,
            BindingResult bindingResult,
            HttpSession session,
            RedirectAttributes redirectAttributes
    ){
        log.info("impUid : " + impUid);
        log.info("userDTO : " + userDTO);
        if(bindingResult.hasErrors()){
            log.info("바인딩 에러");
            return "redirect:/user/register";
        }
        Object idCheck = session.getAttribute("idCheck");
        if(Objects.nonNull(idCheck)) {
            System.out.println("id 체크를 하고 옴");
            System.out.println(idCheck);
            System.out.println(idCheck.equals(true));
            if(idCheck.equals(true)) {
                System.out.println("id 체크 했는데 중복이 아니였음");
                session.removeAttribute("idCheck");
                userService.create_user(impUid, userDTO);
                return "redirect:/user/login";
            }
            System.out.println("id 체크 했는데 중복이였음");
        }
        redirectAttributes.addFlashAttribute("certErrorMsg", "본인인증이 완료되지 않았습니다");
        return "redirect:/user/register";

    }
}
