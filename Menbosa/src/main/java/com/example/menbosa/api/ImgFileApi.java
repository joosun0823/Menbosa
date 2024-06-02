package com.example.menbosa.api;

import com.example.menbosa.dto.protector.postscript.ImgFileDTO;
import com.example.menbosa.service.protector.postscript.ImgFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ImgFileApi {
    private final ImgFileService imgFileService;

    @Value("C:/upload/")
    private String fileDir;

    @GetMapping("/v1/posts/${boardRecomNum}/imgFiles")
    public List<ImgFileDTO> ImgFileList(@RequestParam("boardRecomNum") Long boardRecomNum) {
        return imgFileService.findList(boardRecomNum);
    }

    @GetMapping("/v1/files")
    public byte[] display(String fileName) throws IOException {
        File file = new File(fileDir, fileName);

        return FileCopyUtils.copyToByteArray(file);
    }
}
