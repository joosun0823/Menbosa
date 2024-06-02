package com.example.menbosa.controller.protector.postscript;

import com.example.menbosa.dto.protector.page.Criteria;
import com.example.menbosa.dto.protector.page.Page;
import com.example.menbosa.dto.protector.postscript.PostListDTO;
import com.example.menbosa.service.protector.postscript.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/alheum/postScript")
@RequiredArgsConstructor
public class PostscriptController {
    private final PostService postService;

    @GetMapping("/postMain")
    public String PostList(Criteria criteria, Model model) {
        List<PostListDTO> postList = postService.findPostAll(criteria);
        int total = postService.findTotal();
        Page page = new Page(criteria, total);

        model.addAttribute("postList", postList);
        model.addAttribute("page", page);
        return "/alheum/postScript/postMain";
    }


//
//    @GetMapping("postMain")
//    @GetMapping("postWrite")
//    @GetMapping("postDetails")
//    @GetMapping("postModify")
//    안녕하세요
//    하하하
    
    


}
