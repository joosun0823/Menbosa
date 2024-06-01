package com.example.menbosa.service.protector.mypage;

import com.example.menbosa.dto.protector.mypage.*;
import com.example.menbosa.mapper.protector.mypage.MypageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MypageServiceimpl implements MypageService{

    private final MypageMapper mypageMapper;

    @Override
    public List<ProMypageResultDTO> selectMyResult(Long proMemNum) {
        return mypageMapper.selectMyResult(proMemNum);
    }

    @Override
    public List<ProMypageSenInfoDTO> selectMySenInfo(Long proMemNum) {
        return mypageMapper.selectMySenInfo(proMemNum);
    }

    @Override
    public List<ProMypageBoardDTO> selectMyBoard(Long proMemNum) {
        return mypageMapper.selectMyBoard(proMemNum);
    }

    @Override
    public ProMypageInfoDTO selectMyInfo(Long proMemNum) {
        return mypageMapper.selectMyInfo(proMemNum);
    }

    @Override
    public ProMypageSenDetailsDTO selectMySenDetails(Long senMemNum) {
        return mypageMapper.selectMySenDetails(senMemNum);
    }

    @Override
    public void updateMyModify(ProMypageModifyDTO proMypageModifyDTO) {
        mypageMapper.updateMyModify(proMypageModifyDTO);
    }

    @Override
    public void updateSenAddNew(ProMypageSenConnecDTO proMypageSenConnecDTO) {
        mypageMapper.updateSenAddNew(proMypageSenConnecDTO);
    }

    @Override
    public void updateSenAddClear(Long senMemNum) {
        mypageMapper.updateSenAddClear(senMemNum);
    }

    @Override
    public Long selectFindSenMem(ProMypageFindSenDTO proMypageFindSenDTO) {
        String senMemPhoneNum = "010"+proMypageFindSenDTO.getSenMemPhoneMid()+proMypageFindSenDTO.getSenMemPhoneBack();
        proMypageFindSenDTO.setSenMemPhoneNum(senMemPhoneNum);
        return mypageMapper.selectFindSenMem(proMypageFindSenDTO).orElseThrow(()->new IllegalStateException("없는 회원입니다"));
    }

    @Override
    public String selectCheckPassword(Long proMemNum) {
        return mypageMapper.selectCheckPassword(proMemNum).orElseThrow(()->new IllegalStateException("일치하지 않는 비밀번호"));
    }

    @Override
    public boolean selectFindEmail(String proMemEmail) {
        boolean checkEmail = false;
        try {
            mypageMapper.selectFindEmail(proMemEmail);
        }catch (NullPointerException e){
            checkEmail = true;
        }
        return checkEmail;
    }

    @Override
    public void updateOnlyEmail(String proMemEmail, Long proMemNum) {
       String proMemNumString = ""+ proMemNum;
       mypageMapper.updateOnlyEmail(proMemEmail, proMemNumString);
    }

    @Override
    public void deleteProMem(Long proMemNum) {
        mypageMapper.deleteProMem(proMemNum);
    }

}
