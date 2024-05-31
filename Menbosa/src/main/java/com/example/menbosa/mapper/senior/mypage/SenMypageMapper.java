package com.example.menbosa.mapper.senior.mypage;

import com.example.menbosa.dto.senior.mypage.SenMypageDTO;
import com.example.menbosa.dto.senior.mypage.SenMypageProDTO;
import com.example.menbosa.dto.senior.mypage.SenMypageTestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SenMypageMapper {
    List<SenMypageDTO> selectSenInfo();
    List<SenMypageProDTO> selectProInfo();
    List<SenMypageTestDTO> selectTestInfo();
}
