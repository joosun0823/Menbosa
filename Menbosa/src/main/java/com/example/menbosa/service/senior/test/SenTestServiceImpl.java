package com.example.menbosa.service.senior.test;

import com.example.menbosa.dto.senior.test.SenTestItemsDTO;
import com.example.menbosa.dto.senior.test.SenTestListDTO;
import com.example.menbosa.dto.senior.test.SenTestQuestDTO;
import com.example.menbosa.mapper.senior.test.SenTestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SenTestServiceImpl implements SenTestService{

    private final SenTestMapper senTestMapper;

    @Override
    public List<SenTestListDTO> selectTestList() {
        return senTestMapper.selectTestList();
    }

    @Override
    public List<SenTestQuestDTO> selectTestQuest() {
        return senTestMapper.selectTestQuest();
    }

    @Override
    public List<SenTestItemsDTO> selectTestItems() {
        return senTestMapper.selectTestItems();
    }
}
