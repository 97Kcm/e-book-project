package com.ebook.controller;

<<<<<<< HEAD
import com.ebook.dto.UserDTO;
import com.ebook.service.user.UserService;
=======
import com.ebook.dto.user.UserDTO;
import com.ebook.service.user.UserService;
import jakarta.servlet.http.HttpSession;
>>>>>>> 4b32d3bf719638e375094087c5822a7d16ddd8eb
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

=======
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Objects;

>>>>>>> 4b32d3bf719638e375094087c5822a7d16ddd8eb
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
<<<<<<< HEAD
=======
            BindingResult bindingResult,
            HttpSession session,
>>>>>>> 4b32d3bf719638e375094087c5822a7d16ddd8eb
            RedirectAttributes redirectAttributes
    ){
        log.info("impUid : " + impUid);
        log.info("userDTO" + userDTO);
<<<<<<< HEAD

        userService.create_user(impUid, userDTO);

        redirectAttributes.addFlashAttribute("certErrorMsg", "본인인증이 완료되지 않았습니다");

        return "redirect:/user/login";
=======
        if(bindingResult.hasErrors()){
            return "redirect:/user/register";
        }
        Object idCheck = session.getAttribute("idCheck");
        if(Objects.nonNull(idCheck)) {
            if((Boolean) idCheck) {
                session.removeAttribute("idCheck");
                userService.create_user(impUid, userDTO);
                return "redirect:/user/login";
            }
        }
        redirectAttributes.addFlashAttribute("certErrorMsg", "본인인증이 완료되지 않았습니다");
        return "redirect:/user/register";
>>>>>>> 4b32d3bf719638e375094087c5822a7d16ddd8eb
    }
}
