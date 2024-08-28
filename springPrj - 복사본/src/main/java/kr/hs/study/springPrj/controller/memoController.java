package kr.hs.study.springPrj.controller;

import kr.hs.study.springPrj.dto.memoDTO;
import kr.hs.study.springPrj.service.memoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class memoController {
    @Autowired
    private memoService service;

    @GetMapping("/memo")
    public String input(){
        return "memo/memo_input";
    }

    @PostMapping("memo_done")
    public String memo_done(memoDTO dto){
        System.out.println("writer:"+dto.getWriter());
        System.out.println("contents:"+dto.getContents());
        service.insert(dto);
        return "result";
    }
    @GetMapping("/list")
    public String memo_list(Model model){
        List<memoDTO> list=service.selectAll();
        System.out.println("list개수:"+list.size());
        model.addAttribute("list",list);
        return "memo_result";
    }
}

