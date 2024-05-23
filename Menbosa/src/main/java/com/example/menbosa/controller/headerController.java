package com.example.menbosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/header")
public class headerController {

    @GetMapping("/main")
    public String main() {
        return "protector/protectorMain-MainNonMember";
    }
}
