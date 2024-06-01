package com.example.menbosa.mapper.protector.inquiry;

import com.example.menbosa.dto.protector.inquiry.ProInqDTO;
import com.example.menbosa.dto.protector.inquiry.ProInqDetailsDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InquiryMapper {
    List<ProInqDTO> selectProInq(long proMemNum);

    ProInqDetailsDTO selectProInqDetails(long proMemNum, long boardInquNum);

    void insertInqu(ProInqDetailsDTO proInqDetailsDTO);
}
