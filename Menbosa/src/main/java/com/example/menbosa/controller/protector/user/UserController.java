package com.example.menbosa.controller.protector.user;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alheum/user")
public class UserController {
    @GetMapping()
=======
import com.example.menbosa.dto.protector.user.UserDTO;
import com.example.menbosa.dto.protector.user.UserSessionDTO;
import com.example.menbosa.service.protector.user.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/alheum/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/login")
>>>>>>> 2baf3be55adad163055d68aca5e341cb2f372b55
    public String login() {
        return "/protector/protectorLogin";
    }

<<<<<<< HEAD
    @GetMapping("/findPassword")
    public String findPassword() {
        return "/protector/protectorPassword-find";
=======
    @PostMapping("/login")
    public String login(String proMemPhone, String proMemPassword, HttpSession session) {
        try {
            UserSessionDTO sessionDTO = userService.loginUser(proMemPhone, proMemPassword);
            session.setAttribute("proMemNum", sessionDTO.getProMemNum());
            session.setAttribute("proMemPhone", sessionDTO.getProMemPhone());
        } catch (IllegalStateException e) {
            return "redirect:/alheum/user/login";
        }
        return "redirect:/alheum";
>>>>>>> 2baf3be55adad163055d68aca5e341cb2f372b55
    }

    @GetMapping("/join")
    public String join() {
        return "/protector/protectorJoin";
    }

<<<<<<< HEAD
    @GetMapping("/map/hospital")
    public String mapHospital() {
        return "/protector/protectorRecommend-hospital";
    }

    @GetMapping("/map/sanatorium")
    public String mapSanatorium() {
        return "/protector/protectorRecommend-sanatorium";
    }

    @GetMapping("/map/welfare")
    public String mapWelfare(){
        return "/protector/protectorRecomment-welfare";
    }

    @GetMapping("/intro")
    public String intro() {
        return "/protector/protectorIntroduce";
=======
    @PostMapping("/join")
    public String join(UserDTO userDTO) {
        userService.registerUser(userDTO);
        return "redirect:/alheum/user/login";
    }

    @GetMapping("/findPassword")
    public String findPassword() {
        return "/protector/protectorPassword-find";
    }

    @GetMapping("/mypage")
    public String mypage() {
        return "/protector/protectorMypage-main";
>>>>>>> 2baf3be55adad163055d68aca5e341cb2f372b55
    }
}
