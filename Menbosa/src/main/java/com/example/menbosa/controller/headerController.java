package com.example.menbosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/header")
public class headerController {

    @GetMapping("/home")
    public String home() {
        return "/protector/protectorMain-mainNonMember";
    }

    @GetMapping("/introduce")
    public String introduce() {
        return "/protector/protectorIntroduce";
    }

    @GetMapping("/recommend")
    public String recommend() {
        return "/protector/protectorRecommend-hospital";
    }

    @GetMapping("/division")
    public String division() {
        return "/basic/division";
    }

    @GetMapping("/community")
    public String community() {
        return "/protector/protectorCommunity-communicateMain";
    }

    @GetMapping("/join")
    public String join() {
        return "/protector/protectorJoin";
    }

    @GetMapping("/login")
    public String login() {
        return "/protector/protectorLogin";
    }

}
