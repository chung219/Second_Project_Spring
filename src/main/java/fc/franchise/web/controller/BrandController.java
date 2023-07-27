package fc.franchise.web.controller;

import fc.franchise.domain.Brand;
import fc.franchise.domain.Cost;
import fc.franchise.domain.FranchiseBrandInfo;
import fc.franchise.repository.brand.BrandInterface;
import fc.franchise.repository.cost.CostInterface;
import fc.franchise.repository.food.FoodInterface;
import fc.franchise.repository.franchiseBrandInfo.FranchiseBrandInfoInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class BrandController {
    private final FoodInterface foodInterface;
    private final BrandInterface brandInterface;
    private final CostInterface costInterface;
    private final FranchiseBrandInfoInterface franchiseBrandInfoInterface;

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
    public String massed (Model model) {
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
        List<Brand> figure = brandInterface.figure();
        model.addAttribute("figure",figure);
        model.addAttribute("bounceRate", bounceRate);
        return "brand/closing";
    }

    @GetMapping("region")
    public String region (Model model) {
        List<Brand> top10List = brandInterface.top10List();
        List<Brand> top10List2 = brandInterface.top10List2();
        model.addAttribute("top10List", top10List);
        model.addAttribute("top10List2", top10List2);
        return "region/list";
    }
}
