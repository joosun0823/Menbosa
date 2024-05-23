package com.example.menbosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/divisionM")
public class divisionMController {

    @GetMapping
    public String divisionM() {
        return "/basic/division-member";
    }

    @GetMapping("/protector")
    public String protector() {
        return "/protector/protectorTest-survey";
    }

    @GetMapping("/senior")
    public String senior() {
        return "/senior/seniorLogin";
    }
}
