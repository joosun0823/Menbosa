package com.example.menbosa.mapper;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TimeMapperTest {
    @Autowired
    TimeMapper timeMapper;

    @Test
    void selectTime(){
        timeMapper.selectTime();
    }
}