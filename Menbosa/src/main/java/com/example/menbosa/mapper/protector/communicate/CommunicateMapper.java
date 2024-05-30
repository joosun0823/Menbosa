package com.example.menbosa.mapper.protector.communicate;

import com.example.menbosa.dto.protector.communicate.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CommunicateMapper {
//    소통 게시글 목록
    List<CommuListDto> selectCommuList();

//    소통 글쓰기
    void insertCommu(CommuWriteDto commuWriteDto);

//    소통 상세글 조회하기
    Optional<CommuDetailDto> selectCommuDetail(Long boardCommuNum);
    
//    소통 글수정하기
    void updateCommu(CommuUpdateDto commuUpdateDto);

//    소통 글 삭제하기
    void deleteCommu(Long boardCommuNum);



    List<MainListDto> selectMain();

    MainViewDto selectByNum(Long announceNum);

}
