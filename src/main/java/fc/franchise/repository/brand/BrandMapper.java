package fc.franchise.repository.brand;

import fc.franchise.domain.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {

    List<Brand> findAll();

    List<Brand> departure();

    List<Brand> getPieChart(String category);

    List<Brand> findTop3(String category);

    List<Brand> findSalesTop5(String category);
}
