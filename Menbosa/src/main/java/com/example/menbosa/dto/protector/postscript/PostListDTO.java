package com.example.menbosa.dto.protector.postscript;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PostListDTO {
    private Long boardRecomNum;
    private String boardRecomTitle;
    private String proMemPhone;
    private Long IMG_FILE_NUM;
    private String IMG_FILE_USER;
    private String IMG_FILE_SERVER;
    private String IMG_FILE_EXT;
}
