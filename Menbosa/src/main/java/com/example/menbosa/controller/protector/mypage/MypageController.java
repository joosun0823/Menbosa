package com.example.menbosa.controller.protector.mypage;

import com.example.menbosa.dto.protector.mypage.*;
import com.example.menbosa.service.protector.mypage.MypageService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
@RequestMapping("/alheum/mypage")
@RequiredArgsConstructor
public class MypageController {

    private final MypageService mypageService;
    private final ProMypageSenConnecDTO proMypageSenConnecDTO;

    @GetMapping("/logout")
    public RedirectView logout(HttpSession session){
        session.invalidate();
        return new RedirectView("/alheum/user");
    }

    //   메인 마이페이지 화면
    //   TODO 임의의 값 600설정
    @GetMapping
    public String mypage(Model model) {
        List<ProMypageResultDTO> MyResultList = mypageService.selectMyResult(600);
        List<ProMypageSenInfoDTO> MySenInfoList = mypageService.selectMySenInfo(600);
        List<ProMypageBoardDTO> MyBoardList = mypageService.selectMyBoard(600);

        model.addAttribute("MyResultList", MyResultList);
        model.addAttribute("MySenInfoList", MySenInfoList);
        model.addAttribute("MyBoardList", MyBoardList);
        return "/protector/protectorMypage-main";
    }

    //  마이페이지 시니어 상세보기
    //     TODO 임의의값 600
    @GetMapping("/seninfo")
    public String mypageSenInfo(Model model
//                                ,@RequestParam("senMemNum")long boardInquNum
    ) {
        ProMypageSenDetailsDTO MySenDetails = mypageService.selectMySenDetails(600);
        model.addAttribute("MySenDetails", MySenDetails);
        return "/protector/protectorMypage-seniorDetails";
    }

    //  검증페이지
    @PostMapping("/check")
    public String mypageCheck(Model model, String password
                            //세션
                            ) {
        String passwordDb = mypageService.selectCheckPassword(600);
        return passwordDb.equals(password)? "redirect:modify" : "redirect:check";
    }

    @GetMapping("/check")
    public String getMypageCheck(Model model) {
        return "/basic/passwordVerify-mypage";
    }

    //    개인정보 수정 페이지
    //    TODO 임의의 값 600
    @GetMapping("/modify")
    public String mypageModify(Model model) {
        ProMypageInfoDTO MyInfo = mypageService.selectMyInfo(600);
        model.addAttribute("MyInfo", MyInfo);
        return "/protector/protectorMypage-modify";
    }

    @PostMapping("/modify")
    public String mypageModify(
//            @SessionAttribute("proMemNum") long proMemNum,
            ProMypageModifyDTO proMypageModifyDTO
    ) {
        proMypageModifyDTO.setProMemNum(600);

        try {
            if (!proMypageModifyDTO.getProMemEmail().equals(mypageService.selectMyInfo(600).getProMemEmail())) {
                //이메일이 수정되었으니 검증 진행
                if (mypageService.selectFindEmail(proMypageModifyDTO.getProMemEmail())) {
                    //이미 db에 있는 이메일이다
                    throw new Exception("변경할 수 없는 이메일입니다");
                }
            }

            if (proMypageModifyDTO.getProMemPassword().isEmpty()) {
                // 비밀번호가 비어있다면 이메일만 저장
                mypageService.updateOnlyEmail(proMypageModifyDTO.getProMemEmail(), 600);
            } else {
                //이메일이 수정되지 않음 또는 수정 가능한 이메일
                mypageService.updateMyModify(proMypageModifyDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/alheum/mypage/modify";
    }

    //    어르신 등록페이지
    @GetMapping("/seniorAdd")
    public String mypageSeniorAdd(Model model){
        return "/protector/protectorMypage-seniorAdd";
    }

    @PostMapping("/seniorAdd")
    public String mypageSeniorAdd(
//            @SessionAttribute("proMemNum") long proMemNum
            ProMypageFindSenDTO proMypageFindSenDTO
    ){
        try {
            proMypageSenConnecDTO.setSenMemNum(mypageService.selectFindSenMem(proMypageFindSenDTO));
            proMypageSenConnecDTO.setProMemNum(600);

            mypageService.updateSenAddNew(proMypageSenConnecDTO);
            System.out.println("연결완료");
        }catch (IllegalStateException e){
            return "redirect:/alheum/mypage/seniorAdd";
        }
        return "redirect:/alheum/mypage";
    }

}
