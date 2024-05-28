package com.example.menbosa.controller.protector.postscript;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alheum/postScript")
public class PostscriptController {

    @GetMapping("postMain")
    @GetMapping("postWrite")
    @GetMapping("postDetails")
    @GetMapping("postModify")


}
