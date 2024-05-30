package com.example.menbosa.mapper.protector.communicate;

import com.example.menbosa.dto.protector.communicate.FileDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileMapper {
    void insertFile(FileDto fileDto);

    void deleteFile(Long boardCommuNum);
}
