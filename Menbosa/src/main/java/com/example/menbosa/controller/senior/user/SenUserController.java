package com.example.menbosa.controller.senior.user;

import com.example.menbosa.dto.senior.mypage.SenMyInfoDTO;
import com.example.menbosa.dto.senior.mypage.SenMyProInfoDTO;
import com.example.menbosa.dto.senior.mypage.SenMyTestInfoDTO;
import com.example.menbosa.service.senior.mypage.SenMypageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/alheum/senUser")
@RequiredArgsConstructor
public class SenUserController {

    private final SenMypageService senMypageService;

    @GetMapping("/login")
    public String login(){

        return "senior/seniorLogin";
    }

    @GetMapping("/join")
    public String join(){

        return "senior/seniorJoin";
    }

//    @PostMapping("/join")
//    public String join(){
//
//        return "senior/seniorJoin";
//    }

    @GetMapping("/findPassword")
    public String findPassword(){
        return "senior/findPassword";
    }

    @GetMapping("/main")
    public String main(){

        return "senior/main";
    }

    @GetMapping("/mypage")
    public String mypage(Model model){
        List<SenMyInfoDTO> senMyInfo = senMypageService.selectSenMyInfo(600);
        List<SenMyProInfoDTO> senMyProInfo = senMypageService.selectSenMyProInfo(600);
        List<SenMyTestInfoDTO> senMyTestInfo = senMypageService.selectSenMyTestInfo(600);

        model.addAttribute("senMyInfo", senMyInfo);
        model.addAttribute("senMyProInfo", senMyProInfo);
        model.addAttribute("senMyTestInfo", senMyTestInfo);

        System.out.println(senMyProInfo);
        System.out.println(model);
        return "senior/seniorMypage";
    }

}
