package com.example.menbosa.controller.protector.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/alheum/mypage")
public class MypageController {


        //   TODO 임의의 값 600설정
//   메인 마이페이지 화면
        @GetMapping
        public String mypage() {
            return "/protector/protectorMypage-main";
        }

        //  마이페이지 시니어 상세보기
//     TODO 임의의값 600
        @GetMapping("/seninfo")
        public String mypageSenInfo() {
            return "/protector/protectorMypage-seniorDetails";
        }

        //  검증페이지
        @PostMapping("/check")
        public String mypageCheck() {
            return "redirect:modify";
        }

        @GetMapping("/check")
        public String getMypageCheck() {
            return "/basic/passwordVerify-mypage";
        }

        //    개인정보 수정 페이지
//    TODO 임의의 값 600
        @GetMapping("/modify")
        public String mypageModify() {
            return "/protector/protectorMypage-modify";
        }

        @PostMapping("/modify")
        public String mypagemodify(){
            return "redirect:modify";
        }


        //    어르신 등록페이지
        @GetMapping("/senioradd")
        public String mypageSeniorAdd() {
            return "/protector/protectorMypage-seniorAdd";
        }

}
