package com.example.menbosa.controller.protector.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alheum/user")
public class UserController {
<<<<<<< HEAD
    @GetMapping()
=======



    @GetMapping("/login")
>>>>>>> 838c13a326a9c437c4c72186bb0747f38060422d
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
    @GetMapping("/mypage")
    public String mypage() {
        return "/protector/protectorMypage-main";
>>>>>>> 838c13a326a9c437c4c72186bb0747f38060422d
    }
}
