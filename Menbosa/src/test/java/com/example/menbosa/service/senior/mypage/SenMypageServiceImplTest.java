package com.example.menbosa.service.senior.mypage;

import com.example.menbosa.mapper.senior.mypage.SenMypageMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SenMypageServiceImplTest {

    @Autowired
    private SenMypageMapper senMypageMapper;


    @Test
    public void selectSenInfo() {
        senMypageMapper.selectSenInfo();
    }

}