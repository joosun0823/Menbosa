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
public class SenMypageTestDTO {
//    R.TEST_RESULT_DATE
//             , R.TEST_RESULT_SCORE
//             , L.TEST_LIST_NAME
    private int senMemNum;
    private LocalDate testResultDate;
    private Long testResultScore;
    private String testListName;
}
