package com.example.menbosa.service.protector.communicate;

import com.example.menbosa.dto.protector.communicate.FileDto;

public interface FileService {
    void registerFile(FileDto fileDto);

    void removeFile(Long boardCommuNum);
}
