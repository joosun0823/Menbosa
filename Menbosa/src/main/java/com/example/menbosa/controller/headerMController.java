package com.example.menbosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/headerM")
public class headerMController {

    @GetMapping
    public String headerM() {
        return "/protector/protectorMain-mainMember";
    }

    @GetMapping("/home")
    public String home() {
        return "/protector/protectorMain-mainMember";
    }

    @GetMapping("/introduce")
    public String introduce() {
        return "/protector/protectorIntroduce-member";
    }

    @GetMapping("/recommend")
    public String recommend() {
        return "/protector/protectorRecommend-hospital";
    }

    @GetMapping("/surveys")
    public String division() {
        return "/basic/division-member";
    }

    @GetMapping("/community")
    public String community() {
        return "/protector/protectorCommunity-communicateMain";
    }

    @GetMapping("/profile")
    public String profile() {
        return "/protector/protectorMypage-main";
    }

}
