package com.example.menbosa.controller.protector.survey;

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
        return "/protector/protectorTest-survey";
    }
}
