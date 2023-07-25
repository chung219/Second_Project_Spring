package fc.franchise.web.controller;

import fc.franchise.domain.Brand;
import fc.franchise.domain.Food;
import fc.franchise.repository.brand.BrandInterface;
import fc.franchise.repository.food.FoodInterface;
import jakarta.servlet.http.HttpSession;
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
    private final FoodInterface foodInterface;
    private final BrandInterface brandInterface;

    @GetMapping("/")
    public String home () {
        return "redirect:/main";
    }

    @GetMapping("/main")
    public String main(Model model, HttpSession session){
        String category = "커피";
        String prevCategory = (String) session.getAttribute("category");
        // 새로운 카테고리 값이 전달되면 세션에 저장합니다.
        if (category != null && !category.equals(prevCategory)) {
            session.setAttribute("category", category);
        }

        // 카테고리 값이 없으면 세션에 저장된 이전 카테고리 값을 사용합니다.
        if (category == null && prevCategory != null) {
            category = prevCategory;
        }
        List<Food> foodFirst = foodInterface.findCategory("커피");
        List<Brand> brandFirst = brandInterface.findTop3("커피");
        List<Brand> rePie = brandInterface.getPieChart("커피");
        model.addAttribute("food", foodFirst);
        model.addAttribute("brands", brandFirst);
        model.addAttribute("category", "커피");
        model.addAttribute("pie", rePie);
        return "main/main_semi_final";
    }

    @PostMapping("/main")
    public String categorySend(@RequestParam(value = "category", required = false) String category,
                               @RequestParam(value = "brandName", required = false) String brandName, Model model, HttpSession session){
//        List<Food> listM = foodInterface.findCategory("커피");
        String prevCategory = (String) session.getAttribute("category");
        // 새로운 카테고리 값이 전달되면 세션에 저장합니다.
        if (category != null && !category.equals(prevCategory)) {
            session.setAttribute("category", category);
        }

        // 카테고리 값이 없으면 세션에 저장된 이전 카테고리 값을 사용합니다.
        if (category == null && prevCategory != null) {
            category = prevCategory;
        }
        if (category!=null) {
            log.info("categorySend] "+category);
            List<Food> listF = foodInterface.findCategory(category);
            List<Brand> listB = brandInterface.findTop3(category);
            List<Brand> readBrand = brandInterface.getPieChart(category);
            model.addAttribute("category", category);
            model.addAttribute("food", listF);
            model.addAttribute("brands", listB);
            model.addAttribute("pie", readBrand);
        }
//        model.addAttribute("first", listM);
        if (brandName!=null) {
            log.info("categorySend] "+category);
            log.info("brandNameSend] "+brandName);
            List<Food> listN = foodInterface.findBrandName(brandName);
            model.addAttribute("brandName", brandName);
            model.addAttribute("food", listN);
        }
        return "main/main_semi_final";
    }
//
//    @PostMapping("/main")
//    public String brandNameSend(@RequestParam("brandName") String brandName, Model model){
//        log.info("brandNameSend] "+brandName);
//        return "main/main_semi_final";
//    }



}