package com.example.menbosa.dto.senior.mypage;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SenMypageDTO {

//    SEN_MEM_NAME, SEN_MEM_BIRTH, SEN_MEM_PHONE_MID, SEN_MEM_PHONE_BACK, SEN_MEM_PASSWORD

    private int senMemNum;
    private String senMemName;
    private LocalDate senMemBirth;
    private Long senMemPhoneMid;
    private Long senMemPhoneBack;
    private String senMemPassword;

}

