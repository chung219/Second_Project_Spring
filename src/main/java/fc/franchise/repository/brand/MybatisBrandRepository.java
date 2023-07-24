package fc.franchise.repository.brand;


import fc.franchise.domain.Brand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MybatisBrandRepository implements BrandInterface{


    private final BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }

    @Override
    public List<Brand> departure() {
        return brandMapper.departure();
    }

    @Override
    public List<Brand> getPieChart(String category) {
        return brandMapper.getPieChart(category);
    }

    @Override
    public List<Brand> findTop3(String category) {
        return brandMapper.findTop3(category);
    }

    @Override
    public List<Brand> findSalesTop5(String category) {
        return brandMapper.findSalesTop5(category);
    }

    @Override
    public List<Brand> top10List() {
        return brandMapper.top10List();
    }

    @Override
    public List<Brand> loadTable1(String category) {
        return brandMapper.loadTable1(category);
    }
}
