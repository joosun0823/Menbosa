package com.example.menbosa.api;

import com.example.menbosa.dto.protector.communicate.CommentListDto;
import com.example.menbosa.dto.protector.communicate.CommentWriteDto;
<<<<<<< HEAD
import com.example.menbosa.dto.protector.communicate.CommuListDto;
=======
>>>>>>> kmj
import com.example.menbosa.dto.protector.page.Criteria;
import com.example.menbosa.dto.protector.page.Slice;
import com.example.menbosa.service.protector.communicate.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentApi {
    private final CommentService commentService;

    // 댓글작성
    @PostMapping("/protector/communicate/{boardCommuNum}/comment")
    public void commentWrite(@RequestBody CommentWriteDto commentWriteDto,
                             @PathVariable("boardCommuNum") Long boardCommuNum,
                             @SessionAttribute("proMemNum") Long proMemNum) {
        commentWriteDto.setBoardCommuNum(boardCommuNum);
        commentWriteDto.setProMemNum(proMemNum);
        commentService.registerComment(commentWriteDto);

        System.out.println(boardCommuNum);
        System.out.println(proMemNum);
        System.out.println(commentWriteDto);
    }

    //댓글목록
    @GetMapping("/protector/communicate/{boardCommuNum}/comments")
    public List<CommentListDto> commentList(@PathVariable("boardCommuNum") Long boardCommuNum){
        return commentService.findCommentList(boardCommuNum);
    }

    //페이지네이션
    @GetMapping("/protector/communicate/{boardCommuNum}/commentsPage")
    public Slice<CommentListDto> commentSlice(@PathVariable("boardCommuNum") long boardCommuNum, int page){
        Slice<CommentListDto> slice = commentService.findSlice(new Criteria(page, 1), boardCommuNum);
        return slice;
    }

    //댓글삭제
    @DeleteMapping("/protector/communicate/comments/{commentCommuNum}")
    public void deleteComment(@PathVariable("commentCommuNum") long commentCommuNum){
        commentService.removeComment(commentCommuNum);
    }
<<<<<<< HEAD
 }
=======
}
>>>>>>> kmj
