package com.ebook.controller;

import com.ebook.service.user.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/find")
    public ResponseEntity<Boolean> get_findId(
            @RequestParam("id") String id,
            HttpSession session
    ){
        boolean result = userService.findUser(id);
        if(result){
            session.setAttribute("idCheck", true);
        }else {
            session.setAttribute("idCheck", false);
        }
        return ResponseEntity.ok(result);
    }
















}
