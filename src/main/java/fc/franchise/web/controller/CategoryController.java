package fc.franchise.web.controller;

import fc.franchise.domain.Brand;
import fc.franchise.domain.Food;
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
public class CategoryController {
    private final FoodInterface foodInterface;
    private final BrandInterface brandInterface;


    @GetMapping("/category")
    public String category (Model model) {
        List<Food> food = foodInterface.loadTable("한식");
        List<Brand> brand = brandInterface.getPieChart("한식");
        List<Brand> brand2 = brandInterface.findSalesTop5("한식");
        model.addAttribute("category","한식");
        model.addAttribute("food",food);
        model.addAttribute("brand", brand);
        model.addAttribute("brand2", brand2);
        return "category/list_semi_final";
    }


    @PostMapping("/category")
    public String categorySend(@RequestParam("category") String category, Model model){
        log.info(category);
        List<Brand> receive_brand = brandInterface.getPieChart(category);
        List<Food> receive_table = foodInterface.loadTable(category);
        List<Brand> brand2 = brandInterface.findSalesTop5(category);
        model.addAttribute("category", category);
        model.addAttribute("food",receive_table);
        model.addAttribute("brand", receive_brand);
        model.addAttribute("brand2",brand2);
        return "category/list_semi_final";
    }



    @GetMapping("/brand")
    public String brand () {
        return "brand/list";
    }
    @GetMapping("/region")
    public String region () {
        return "region/list";
    }

}