package com.example.menbosa.controller.senior.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alheum/senTest")
public class TestController {
    @GetMapping("/testList")
    public String testList(){
        return "senior/testList";
    }

    @GetMapping("/testStart")
    public String testStart(){
        return "senior/testStart";
    }

    @GetMapping("/test")
    public String test(){
        return "senior/test";
    }
}
