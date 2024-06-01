package com.example.menbosa.mapper.protector.inquiry;

import com.example.menbosa.dto.protector.inquiry.ProInqDTO;
import com.example.menbosa.dto.protector.inquiry.ProInqDetailsDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InquiryMapper {
    List<ProInqDTO> selectProInq(Long proMemNum);

    ProInqDetailsDTO selectProInqDetails(Long proMemNum, Long boardInquNum);

    void insertInqu(ProInqDetailsDTO proInqDetailsDTO);
}
