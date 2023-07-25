package fc.franchise.repository.brand;

import fc.franchise.domain.Brand;
import fc.franchise.domain.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BrandMapper {

    List<Brand> findAll();

    List<Brand> departure();

    List<Brand> getPieChart(String category);

    List<Brand> findTop3(String category);

    List<Brand> findSalesTop5(String category);

    List<Brand> top10List();

    List<Brand> top10List2();

    List<Brand> storeNumbers();

    List<Brand> loadTable1(String category);

    List<Brand> bounceRate();

    List<Brand> figure();
    List<Brand> paging(@Param("page") Page page, @Param("category") String category);

}
