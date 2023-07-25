package fc.franchise.web.controller;

import fc.franchise.domain.*;
import fc.franchise.repository.brand.BrandInterface;
import fc.franchise.repository.cost.CostInterface;
import fc.franchise.repository.food.FoodInterface;

import fc.franchise.repository.franchiseBrandInfo.FranchiseBrandInfoInterface;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RestController
@RequiredArgsConstructor
@Slf4j
public class CategoryController {
    private final FoodInterface foodInterface;
    private final BrandInterface brandInterface;
    private final CostInterface costInterface;
    private final FranchiseBrandInfoInterface franchiseBrandInfoInterface;


    @GetMapping("/category")
    public String category (Page page, @RequestParam(name = "category", required = false) String category, Model model, HttpSession session) {
        String prevCategory = (String) session.getAttribute("category");
        // 새로운 카테고리 값이 전달되면 세션에 저장합니다.
        if (category != null && !category.equals(prevCategory)) {
            session.setAttribute("category", category);
        }

        // 카테고리 값이 없으면 세션에 저장된 이전 카테고리 값을 사용합니다.
        if (category == null && prevCategory != null) {
            category = prevCategory;
        }
        log.info("겟 매핑의 category] "+category);

        List<Food> food = foodInterface.getList(page);
        List<Brand> brand3 = brandInterface.loadTable1(category);
        int total = brand3.size();
        log.info("total] "+total);
        List<Brand> paging = brandInterface.paging(page, category);
        List<Brand> brand = brandInterface.getPieChart(category);
        List<Brand> brand2 = brandInterface.findSalesTop5(category);
        model.addAttribute("total", total);
        model.addAttribute("category",category);
        model.addAttribute("food",food);
        model.addAttribute("pageMaker", new PageDto(page,total));
        model.addAttribute("brand", brand);
        model.addAttribute("brand2", brand2);
        model.addAttribute("brand3", paging);
        return "category/list_semi_final";
    }

//    @CrossOrigin(origins = "http://localhost:8080")
//    @PostMapping("/category")
//    public ResponseEntity<?> handleCategory(@RequestBody String category){
//        return ResponseEntity.ok("Request handled ok");
//    }


    @PostMapping("/category")
    public String categorySend(@RequestParam("category") String category, Page page, Model model, HttpSession session){
        String prevCategory = (String) session.getAttribute("category");
        // 새로운 카테고리 값이 전달되면 세션에 저장합니다.
        if (category != null && !category.equals(prevCategory)) {
            session.setAttribute("category", category);
        }

        // 카테고리 값이 없으면 세션에 저장된 이전 카테고리 값을 사용합니다.
        if (category == null && prevCategory != null) {
            category = prevCategory;
        }
        log.info("포스트매핑의 카테고리"+category);
        List<Brand> receive_brand = brandInterface.getPieChart(category);
        List<Food> receive_table = foodInterface.loadTable(category);
        List<Brand> receiveTable2 = brandInterface.loadTable1(category);
        int total = receiveTable2.size();
        log.info("포스트매핑 토탈"+total);
        List<Brand> pagingTable = brandInterface.paging(page, category);
        List<Brand> brand2 = brandInterface.findSalesTop5(category);
        model.addAttribute("total", total);
        model.addAttribute("category", category);
        model.addAttribute("food",receive_table);
        model.addAttribute("brand3", pagingTable);
        model.addAttribute("pageMaker", new PageDto(page,total));
        model.addAttribute("brand", receive_brand);
        model.addAttribute("brand2",brand2);
        return "category/list_semi_final";
    }



    @GetMapping("brand")
    public String brand (Model model) {
        List<Brand> top10List = brandInterface.top10List();
        List<Brand> top10List2 = brandInterface.top10List2();
        model.addAttribute("top10List", top10List);
        model.addAttribute("top10List2", top10List2);
        return "brand/list";
    }

    @GetMapping("cost")
    public String cost (Model model) {
        List<Cost> findAll = costInterface.findAll();
        model.addAttribute("findAll", findAll);
        return "brand/cost";
    }

    @GetMapping("massed")
    public String region (Model model) {
        List<FranchiseBrandInfo> findFranchise = franchiseBrandInfoInterface.findFranchise();
        List<FranchiseBrandInfo> findFranchise_inc = franchiseBrandInfoInterface.findFranchise_inc();
        List<FranchiseBrandInfo> findFranchise_bu = franchiseBrandInfoInterface.findFranchise_bu();
        model.addAttribute("findFranchise_bu",findFranchise_bu);
        model.addAttribute("findFranchise",findFranchise);
        model.addAttribute("findFranchise_inc",findFranchise_inc);
        return "brand/massed";
    }

    @GetMapping("store")
    public String store (Model model) {
        List<Brand> storeNumbers = brandInterface.storeNumbers();
        model.addAttribute("storeNumbers", storeNumbers);
        return "brand/store";
    }

    @GetMapping("closing")
    public String closing (Model model) {
        List<Brand> bounceRate = brandInterface.bounceRate();
        model.addAttribute("bounceRate", bounceRate);
        return "brand/closing";
    }

}