package com.example.menbosa.controller.protector.survey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alheum/division")
public class SurveyController {
    @GetMapping("/survey")
    public String testSurvey() {
        return "/protector/protectorTest-survey";
    }
}
