package fc.franchise.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class SearchController {

    @PostMapping("search")
    public String receiveMessage(@RequestParam("search_brand") String message, Model model){
        log.info("receiveMessage] "+message);
        model.addAttribute("keyword",message);
        return "search/search";
    }
}
