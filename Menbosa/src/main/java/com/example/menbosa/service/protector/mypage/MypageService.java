package com.example.menbosa.service.protector.mypage;

import com.example.menbosa.dto.protector.mypage.*;

import java.util.List;

public interface MypageService {
    List<ProMypageResultDTO> selectMyResult(Long proMemNum);

    List<ProMypageSenInfoDTO> selectMySenInfo(Long proMemNum);

    List<ProMypageBoardDTO> selectMyBoard(Long proMemNum);

    ProMypageInfoDTO selectMyInfo(Long proMemNum);

    ProMypageSenDetailsDTO selectMySenDetails(Long senMemNum);

    void updateMyModify(ProMypageModifyDTO proMypageModifyDTO);

    void updateSenAddNew(ProMypageSenConnecDTO proMypageSenConnecDTO);

    void updateSenAddClear(Long senMemNum);

    Long selectFindSenMem(ProMypageFindSenDTO proMypageFindSenDTO);

    String selectCheckPassword(Long proMemNum);

    boolean selectFindEmail(String proMemEmail);

    void updateOnlyEmail(String proMemEmail, Long proMemNum);

    void deleteProMem(Long proMemNum);
}
