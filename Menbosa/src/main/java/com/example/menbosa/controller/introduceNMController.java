package com.example.menbosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/introduceNM")
public class introduceNMController {

    @GetMapping
    public String introduce() {
        return "/protector/protectorIntroduce";
    }

    @GetMapping("/test")
    public String test() {
        return "/protector/protectorLogin";
    }

    @GetMapping("/join")
    public String join() {
        return "/protector/protectorJoin";
    }

}
