package fc.franchise.web.controller;

import fc.franchise.domain.Brand;
import fc.franchise.domain.Food;
import fc.franchise.repository.address.AddressInterface;
import fc.franchise.repository.brand.BrandInterface;
import fc.franchise.repository.food.FoodInterface;
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
        List<Food> foodFirst = foodInterface.findCategory("일식");
        List<Brand> brandFirst = brandInterface.findTop3("일식");
        model.addAttribute("first", foodFirst);
        model.addAttribute("Brand", brandFirst);
        model.addAttribute("category", "일식");
        return "main/7_21_ck_test";
    }

    @PostMapping("/main")
    public String categorySend(@RequestParam("category") String category, Model model){
        log.info("categorySend] "+category);
        List<Food> listF = foodInterface.findCategory(category);
        List<Food> listM = foodInterface.findCategory("일식");
        model.addAttribute("category", category);
        List<Brand> listB = brandInterface.findTop3(category);
        model.addAttribute("first", listM);
        model.addAttribute("food", listF);
        model.addAttribute("brand3", listB);
        return "main/7_21_ck_test";
    }



}