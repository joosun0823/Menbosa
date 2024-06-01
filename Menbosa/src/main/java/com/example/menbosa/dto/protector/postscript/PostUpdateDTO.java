package com.example.menbosa.dto.protector.postscript;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PostUpdateDTO {
    private Long boardRecomNum;
    private String boardRecomTitle;
    private String boardRecomContents;
}
