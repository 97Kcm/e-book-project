package com.ebook.controller;

<<<<<<< HEAD
import com.ebook.dto.user.CashChargeDTO;
import com.ebook.dto.user.UserDTO;
import com.ebook.service.user.UserMailService;
=======
import com.ebook.dto.user.UserDTO;
>>>>>>> jh
import com.ebook.service.user.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
<<<<<<< HEAD
import org.springframework.security.crypto.password.PasswordEncoder;
=======
>>>>>>> jh
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

<<<<<<< HEAD
import java.util.Objects;
import java.util.Random;
=======
import java.util.Map;
import java.util.Objects;
>>>>>>> jh

@Log4j2
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

<<<<<<< HEAD
    @Autowired
    private UserMailService userMailService;

    @Autowired
    private PasswordEncoder passwordEncoder;

=======
>>>>>>> jh
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

    @GetMapping("/findId")
    public void get_findId(){}

    @PostMapping("/findId")
    public String post_findId(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email,
            RedirectAttributes redirectAttributes
    ){
        String id = userService.findUserId(name, email);
        redirectAttributes.addFlashAttribute("id", id);
        return "redirect:/user/findId";
    }

    @GetMapping("/resetPassword")
    public void get_resetPassword(){}


    @PostMapping("/resetPassword")
<<<<<<< HEAD
    public String post_resetPassword(
            @RequestParam(required = false) String userId,
            @RequestParam(required = false) String userName,
            @RequestParam(required = false) String userEmail
    ){
        Random rand = new Random();
        String temporaryPassword = "" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
        System.out.println(userId);
        System.out.println(userName);
        System.out.println(userEmail);
        System.out.println(temporaryPassword);
        String EncodingPassword = passwordEncoder.encode(temporaryPassword);
        System.out.println(EncodingPassword);
        userService.resetPassword(userId, userName, userEmail, EncodingPassword);
        userMailService.sendTemporaryPassword(temporaryPassword, userEmail);

        return "redirect:/user/login";

    }





    @GetMapping("/chargeCash")
    public String get_cashcharge() {
        return "cashcharge";
    }

    @ResponseBody
    @PostMapping("/chargeCash")
    public ResponseEntity<Void> get_cashcharge(
            @AuthenticationPrincipal UserDTO user,
            @RequestBody CashChargeDTO cashCharge
    ) {
        userService.charge_cash(user, cashCharge);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }

=======
    public void post_resetPassword(){}

    // 사용자가 캐시를 구매하면 구매한 캐시를 반영
    @PostMapping("/updateCash")
    public ResponseEntity<?> updateCash(
            @RequestBody Map<String, Object> payload,
            @AuthenticationPrincipal UserDTO userDTO
    ) {
        String userId = userDTO.getUserId();
        Integer amount = Integer.parseInt(payload.get("amount").toString());
        System.out.println(userId);
        System.out.println(amount);
//        if (Objects.isNull(userDTO)) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인이 필요합니다.");
//        }
        // 사용자 캐시 업데이트
        userService.updateUserCash(userDTO, amount);
        System.out.println("update:" + userDTO);
        return ResponseEntity.ok(Map.of("success", true, "newCash", amount));
    }

    // 사용자가 구매 버튼 클릭시 UserDTO의 userCash를 가져옴.
    // 단, 사용자가 로그인 해야 /detail 페이지에 접근 가능.
    @GetMapping("/getUserCash")
    public ResponseEntity<Map<String, Object>> getUserCash(@AuthenticationPrincipal UserDTO userDTO){
        if(Objects.isNull(userDTO)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", "로그인이 필요한 서비스입니다."));
        }

        Integer userCash = userDTO.getUserCash();
        return ResponseEntity.ok(Map.of("userCash", userCash));
    }
>>>>>>> jh

}
