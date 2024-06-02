package com.example.menbosa.dto.protector.communicate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CommentListDto {
    private Long commentCommuNum;
    private LocalDateTime commentCommuDate;
    private String commentCommuContents;
    private Long boardCommuNum;
    private Long proMemName;
}
