package com.example.menbosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/divisionNM")
public class divisionNMController {

    @GetMapping
    public String divisionNM() {
        return "/basic/division";
    }

    @GetMapping("/protector")
    public String protector() {
        return "/protector/protectorLogin";
    }

    @GetMapping("/senior")
    public String senior() {
        return "/senior/seniorLogin";
    }
}
