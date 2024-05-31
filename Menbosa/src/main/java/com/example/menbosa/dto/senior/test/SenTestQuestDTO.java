package com.example.menbosa.dto.senior.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SenTestQuestDTO {
//    TEST_QUEST_ORDER
//             , TEST_QUEST_CONTENTS
//             , TEST_QUEST_IMG
//             , TEST_QUEST_ANSWER
//             , TEST_LIST_NUM

    private int testQuestOrder;
    private String testQuestContent;
    private String testQuestImg;
    private String testQuestAnswer;
    private String testListNum;
}
