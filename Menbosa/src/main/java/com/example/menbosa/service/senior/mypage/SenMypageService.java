package com.example.menbosa.service.senior.mypage;

import com.example.menbosa.dto.senior.mypage.SenMypageDTO;
import com.example.menbosa.dto.senior.mypage.SenMypageProDTO;
import com.example.menbosa.dto.senior.mypage.SenMypageTestDTO;

import java.util.List;

public interface SenMypageService {
    List<SenMypageDTO> selectSenInfo();
    List<SenMypageProDTO> selectProInfo();
    List<SenMypageTestDTO> selectTestInfo();
}
