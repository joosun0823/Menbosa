package com.example.menbosa.controller.protector.survey;

<<<<<<< HEAD
import com.example.menbosa.dto.protector.inquiry.ProInqDTO;
import com.example.menbosa.dto.protector.survey.ProSurveyQDTO;
import com.example.menbosa.service.protector.survey.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/alheum/division")
@RequiredArgsConstructor
public class SurveyController {

    private final SurveyService surveyService;

    @GetMapping("/survey")
    public String testSurvey(Model model) {
        List<ProSurveyQDTO> SurveyQList = surveyService.selectSurveyQ();
        model.addAttribute("SurveyQList", SurveyQList);
=======
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
>>>>>>> 2baf3be55adad163055d68aca5e341cb2f372b55
        return "/protector/protectorTest-survey";
    }
}
