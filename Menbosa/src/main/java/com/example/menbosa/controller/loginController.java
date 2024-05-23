package com.example.menbosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class loginController {

    @GetMapping
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
}
