package com.example.menbosa.controller.protector.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alheum/user")
public class UserController {
    @GetMapping("/login")
    public String login() {
        return "/protector/protectorLogin";
    }

    @GetMapping("/findPassword")
    public String findPassword() {
        return "/protector/protectorPassword-find";
    }

    @GetMapping("/join")
    public String join() {
        return "/protector/protectorJoin";
    }

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
        return "/protector/protectorRecommend-welfare";
    }

    @GetMapping("/intro")
    public String intro() {
        return "/protector/protectorIntroduce";
    }
}
