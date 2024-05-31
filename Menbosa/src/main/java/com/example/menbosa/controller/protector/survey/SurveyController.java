package com.example.menbosa.controller.protector.survey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/alheum/survey")
public class SurveyController {

    @GetMapping
    public String survey(@SessionAttribute(value="proMemNum", required = false) Long proMemNum) {
        return proMemNum == null ? "/basic/division" : "/basic/division-member";
    }

    @GetMapping("/test")
    public String testSurvey() {
        return "/protector/protectorTest-survey";
    }
}
