package com.example.menbosa.service.protector.inquiry;

import com.example.menbosa.dto.protector.inquiry.ProInqDTO;
import com.example.menbosa.dto.protector.inquiry.ProInqDetailsDTO;

import java.util.List;

public interface InquiryService {
    List<ProInqDTO> selectProInq(long proMemNum);

    ProInqDetailsDTO selectProInqDetails(long proMemNum, long boardInquNum);

    void insertInqu(ProInqDetailsDTO proInqDetailsDTO);
}
