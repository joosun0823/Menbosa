package com.example.menbosa.controller.senior.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alheum/senUser")
public class SenUserController {
    @GetMapping("/login")
    public String login(){

        return "senior/login";
    }

    @GetMapping("/join")
    public String join(){
        return "senior/join";
    }

    @GetMapping("/findPassword")
    public String findPassword(){
        return "senior/findPassword";
    }

    @GetMapping("/main")
    public String main(){

        return "senior/main";
    }

    @GetMapping("/mypage")
    public String mypage(){
        return "senior/mypage";
    }

}
