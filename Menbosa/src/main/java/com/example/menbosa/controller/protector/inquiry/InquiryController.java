package com.example.menbosa.controller.protector.inquiry;

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
    public String mypageInquiry(Model model, @SessionAttribute("proMemNum")Long proMemNum) {
        List<ProInqDTO> proInqList = inquiryService.selectProInq(proMemNum);
        model.addAttribute("proInqList", proInqList);
        return "/protector/protectorMypage-inquiryList";
    }
    //    1:1문의 상세
    // TODO 600
    @GetMapping("/details")
    public String mypageInquiryDetails(Model model,
<<<<<<< HEAD
                                       @RequestParam("boardInquNum")Long boardInquNum,
                                       @SessionAttribute("proMemNum")Long proMemNum) {
=======
                                       @RequestParam("boardInquNum")long boardInquNum, @SessionAttribute("proMemNum")Long proMemNum) {
>>>>>>> hjy
        ProInqDetailsDTO proInqDetails = inquiryService.selectProInqDetails(proMemNum,boardInquNum);
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
<<<<<<< HEAD
            @SessionAttribute("proMemNum") long senMemNum,
            ProInqDetailsDTO proInqDetailsDTO, RedirectAttributes redirectAttributes
    ){
        proInqDetailsDTO.setProMemNum(senMemNum);
=======
            @SessionAttribute("proMemNum") Long proMemNum,
            ProInqDetailsDTO proInqDetailsDTO){
        proInqDetailsDTO.setProMemNum(proMemNum);
>>>>>>> hjy
        inquiryService.insertInqu(proInqDetailsDTO);
        return "redirect:/alheum/inquiry";
    }
}
