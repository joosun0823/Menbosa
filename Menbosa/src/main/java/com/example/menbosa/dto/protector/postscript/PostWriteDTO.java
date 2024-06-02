package com.example.menbosa.dto.protector.postscript;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PostWriteDTO {
    private Long boardRecomNum;
    private String boardRecomTitle;
    private String boardRecomContents;
    private LocalDate boardRecomDate;
    private Long proMemNum;
}
