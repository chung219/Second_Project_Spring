package fc.franchise.web.controller.home;

import fc.franchise.domain.Brand;
import fc.franchise.domain.Food;
import fc.franchise.repository.AddressInterface;
import fc.franchise.repository.BrandInterface;
import fc.franchise.repository.FoodInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeController {
    private final AddressInterface addressInterface;
    private final FoodInterface foodInterface;
    private final BrandInterface brandInterface;

    @GetMapping("/")
    public String home () {
        return "redirect:/main";
    }

    @GetMapping("/main")
    public String main(Model model){
        List<Food> first = foodInterface.findCategory("일식");
        model.addAttribute("first", first);
        return "main/7_21_ck_test";
    }

    @PostMapping("/main")
    public String categorySend(@RequestParam("category") String category, Model model){
        log.info("categorySend] "+category);
        List<Food> list = foodInterface.findCategory(category);
        model.addAttribute("category", category);
        model.addAttribute("food", list);
        return "main/7_21_ck_test";

    }

    @GetMapping("/category")
    public String category (Model model) {
        List<Brand> brand = brandInterface.departure();
        model.addAttribute("brand", brand);
        return "category/list";
    }

}