package fc.franchise.web.controller.home;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/")
    public String home () {
        return "redirect:/main";
    }

    @GetMapping("/main")
    public String main (){
        return "main/main_backup";
    }

}