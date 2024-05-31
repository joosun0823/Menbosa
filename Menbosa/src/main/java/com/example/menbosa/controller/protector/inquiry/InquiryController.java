package com.example.menbosa.controller.protector.inquiry;

<<<<<<< HEAD
import com.example.menbosa.dto.protector.inquiry.ProInqDTO;
import com.example.menbosa.dto.protector.inquiry.ProInqDetailsDTO;
import com.example.menbosa.service.protector.inquiry.InquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/alheum/inquiry")
@RequiredArgsConstructor
public class InquiryController {

    private final InquiryService inquiryService;

    //    1:1문의
    // TODO 600
    @GetMapping
    public String mypageInquiry(Model model) {
        List<ProInqDTO> proInqList = inquiryService.selectProInq(600);
        model.addAttribute("proInqList", proInqList);
        return "/protector/protectorMypage-inquiryList";
    }
    //    1:1문의 상세
    // TODO 600
    @GetMapping("/details")
    public String mypageInquiryDetails(Model model,
                                       @RequestParam("boardInquNum")long boardInquNum) {
        ProInqDetailsDTO proInqDetails = inquiryService.selectProInqDetails(600,boardInquNum);
        model.addAttribute("proInqDetails", proInqDetails);
        return "/protector/protectorMypage-inquiryDetails";
    }
    //    1:1문의 글쓰기
    @GetMapping("/write")
    public String mypageInquiryWrite() {
        return "/protector/protectorMypage-inquiryWrite";
    }

    @PostMapping("/write")
    public String mypageInquiryWrite(
//            @SessionAttribute("proMemNum") long senMemNum,
            ProInqDetailsDTO proInqDetailsDTO, RedirectAttributes redirectAttributes
    ){
        proInqDetailsDTO.setProMemNum(600);
        inquiryService.insertInqu(proInqDetailsDTO);
        return "redirect:/alheum/inquiry";
    }
=======
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
>>>>>>> 2baf3be55adad163055d68aca5e341cb2f372b55
}
