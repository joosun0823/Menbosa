package com.example.menbosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recommend")
public class recommendController {

    @GetMapping
    public String recommend() {
        return "/protector/protectorRecommend-hospital";
    }

    @GetMapping("/sanatorium")
    public String sanatorium() {
        return "/protector/protectorRecommend-sanatorium";
    }

    @GetMapping("/welfare")
    public String welfare() {
        return "/protector/protectorRecommend-welfare";
    }

}
