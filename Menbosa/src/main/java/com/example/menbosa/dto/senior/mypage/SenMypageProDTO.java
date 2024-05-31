package com.example.menbosa.dto.senior.mypage;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SenMypageProDTO {
//    P.PRO_MEM_NAME, P.PRO_MEM_PHONE_MID, P.PRO_MEM_PHONE_BACK
    private int senMemNum;
    private String proMemName;
    private String proMemPhoneMid;
    private String proMemPhoneBack;
}
