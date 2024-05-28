package com.example.menbosa.controller.protector.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alheum")
public class mainController {
    @GetMapping
    public String main() {
        return "/protector/protectorMain-mainNonMember";
    }
}
