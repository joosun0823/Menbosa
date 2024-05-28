package com.example.menbosa.controller.protector.communicate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alheum/community")
public class CommunicateController {

        // 공지 목록 페이지
        @GetMapping("/main")
        public String commuAnnounce(){
            return "protector/protectorCommunity-announce";
        }

        //  공지 상세 페이지
        @GetMapping("/commuAnnounceDetails")
        public String commuAnnounceDetails(){
            return "protector/protectorCommunity-announceDetails";
        }

        // 소통 목록 페이지
        @GetMapping("/commuMain")
        public String commuMain() {
            return "protector/protectorCommunity-communicateMain";
        }

        // 소통 글쓰기 페이지
        @GetMapping("/commuWrite")
        public String commuWriteForm(){
            return "protector/protectorCommunity-communicateWrite";
        }

        @PostMapping("/commuWrite")
        public String commuWrite(){
            return "redirect:/community/commuDetails";
        }

        // 소통 상세 페이지
        @GetMapping("/commuDetails")
        public String commuDetails(){
            return "protector/protectorCommunity-communicateDetails";
        }

        @GetMapping("/commuModify")
        public String commuModify(){
            return "protector/protectorCommunity-retouch";
        }

}
