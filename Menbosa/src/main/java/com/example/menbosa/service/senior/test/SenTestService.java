package com.example.menbosa.service.senior.test;

import com.example.menbosa.dto.senior.test.SenTestItemsDTO;
import com.example.menbosa.dto.senior.test.SenTestListDTO;
import com.example.menbosa.dto.senior.test.SenTestQuestDTO;

import java.util.List;

public interface SenTestService {
    List<SenTestListDTO> selectTestList();

    List<SenTestQuestDTO> selectTestQuest();

    List<SenTestItemsDTO> selectTestItems();
}
