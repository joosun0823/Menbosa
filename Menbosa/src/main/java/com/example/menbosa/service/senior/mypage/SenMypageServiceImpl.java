package com.example.menbosa.service.senior.mypage;

import com.example.menbosa.dto.senior.mypage.SenMypageDTO;
import com.example.menbosa.dto.senior.mypage.SenMypageProDTO;
import com.example.menbosa.dto.senior.mypage.SenMypageTestDTO;
import com.example.menbosa.mapper.senior.mypage.SenMypageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SenMypageServiceImpl implements SenMypageService{

    private final SenMypageMapper senMypageMapper;

    @Override
    public List<SenMypageDTO> selectSenInfo() {
        return senMypageMapper.selectSenInfo();
    }

    @Override
    public List<SenMypageProDTO> selectProInfo() {
        return senMypageMapper.selectProInfo();
    }

    @Override
    public List<SenMypageTestDTO> selectTestInfo() {
        return senMypageMapper.selectTestInfo();
    }
}
