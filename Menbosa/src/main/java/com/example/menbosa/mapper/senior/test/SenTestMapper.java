package com.example.menbosa.mapper.senior.test;

import com.example.menbosa.dto.senior.test.SenTestItemsDTO;
import com.example.menbosa.dto.senior.test.SenTestListDTO;
import com.example.menbosa.dto.senior.test.SenTestQuestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SenTestMapper {
    List<SenTestListDTO> selectTestList();

    List<SenTestQuestDTO> selectTestQuest();

    List<SenTestItemsDTO> selectTestItems();
}
