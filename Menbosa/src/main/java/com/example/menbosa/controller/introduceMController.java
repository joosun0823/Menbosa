package com.example.menbosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/introduceM")
public class introduceMController {

    @GetMapping
    public String introduce() {
        return "/protector/protectorIntroduce-member";
    }

    @GetMapping("/test")
    public String test() {
        return "/protector/protectorTest-survey";
    }

    @GetMapping("/join")
    public String join() {
        return "/protector/protectorJoin";
    }

}
