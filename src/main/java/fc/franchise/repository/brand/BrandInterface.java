package fc.franchise.repository.brand;

import fc.franchise.domain.Brand;

import java.util.List;

public interface BrandInterface {
    List<Brand> findAll();


    List<Brand> departure();

    List<Brand> getPieChart(String category);


    List<Brand> findTop3(String category);

    List<Brand> findSalesTop5(String category);

    List<Brand> top10List();

    List<Brand> loadTable1(String category);
}
