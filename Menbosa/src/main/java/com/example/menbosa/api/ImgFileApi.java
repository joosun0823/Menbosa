package com.example.menbosa.api;

import com.example.menbosa.service.protector.postscript.ImgFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ImgFileApi {
    private final ImgFileService imgFileService;

    @Value("C:/upload/")
    private String fileDir;

}
