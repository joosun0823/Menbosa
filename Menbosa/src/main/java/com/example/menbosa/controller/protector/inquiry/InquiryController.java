package com.example.menbosa.controller.protector.inquiry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alheum/inquiry")
public class InquiryController {
    //    1:1문의
    @GetMapping("/inqList")
    public String mypageInquiry() {
        return "/protector/protectorMypage-inquiryList";
    }
    //    1:1문의 상세
    @GetMapping("/inqDetails")
    public String mypageInquiryDetails() {
        return "/protector/protectorMypage-inquiryDetails";
    }
    //    1:1문의 글쓰기
    @GetMapping("/inqWrite")
    public String mypageInquiryWrite() {
        return "/protector/protectorMypage-inquiryWrite";
    }
}
