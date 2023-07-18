package fc.franchise.web.controller.home;

import fc.franchise.domain.Address;
import fc.franchise.repository.AddressInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeController {
    private final AddressInterface addressInterface;

    @GetMapping("/")
    public String home () {
        return "redirect:/main";
    }

    @GetMapping("/main")
    public String main (Model model){
        List<Address>addressList = addressInterface.findAll();
        model.addAttribute("address", addressList);
        return "main/main_test";
    }

}