package kr.hs.study.springPrj.controller;

import kr.hs.study.springPrj.dto.scoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
    @GetMapping("/table")
    public String table_input(){
        return "table_input";
    }
    @PostMapping("/table_done")
    public String table_result(@RequestParam("num") int num, Model model) {
        String result="";
        for(int i=1;i<=9;i++) {
            result+=num+"x"+i+"="+num*i+"\r\n";
        }
        model.addAttribute("result",result);
        return "table_result";

    }
    @GetMapping("/score")
    public String score_input(){
        return "score_input";
    }
    @PostMapping("/score_done")
    public String score_done(scoreDTO dto, Model model) {
        //사용자가 입력한 값을 자동으로 set메서드를 이용해서 dto의 멤버변수에 넣는다. (DI)
        //이름: dto.getName() ㅜㄱ겅
        //총점구하고
        dto.setTotal(dto.getKor()+dto.getEng()+dto.getMath());
        //평균구하고
        dto.setAvg(((dto.getKor()+dto.getEng()+dto.getMath())/3));
        //구한 총점과 평균을 dto의 멤버변수에 넣고
        //model에 dto을 담아서 view로 보낸다.
        model.addAttribute("result",dto);

        return "score_result";
    }

}
