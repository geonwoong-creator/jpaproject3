package JPA.TEST.Project2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board/save")
    public String save() {
        return "layout/board/board-save";
    }
}
