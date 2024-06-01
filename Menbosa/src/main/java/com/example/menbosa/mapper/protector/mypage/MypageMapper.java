package com.example.menbosa.mapper.protector.mypage;

import com.example.menbosa.dto.protector.mypage.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MypageMapper {
    List<ProMypageResultDTO> selectMyResult(Long proMemNum);

    List<ProMypageSenInfoDTO> selectMySenInfo(Long proMemNum);

    List<ProMypageBoardDTO> selectMyBoard(Long proMemNum);

    ProMypageInfoDTO selectMyInfo(Long proMemNum);

    ProMypageSenDetailsDTO selectMySenDetails(Long senMemNum);

    void updateMyModify(ProMypageModifyDTO proMypageModifyDTO);

    void updateSenAddNew(ProMypageSenConnecDTO proMypageSenConnecDTO);

    void updateSenAddClear(Long senMemNum);

    Optional<Long> selectFindSenMem(ProMypageFindSenDTO proMypageFindSenDTO);

    Optional<String> selectCheckPassword(Long proMemNum);

    String selectFindEmail(String proMemEmail);

    void updateOnlyEmail(String proMemEmail, String proMemNumString);

    void deleteProMem(Long proMemNum);
}
