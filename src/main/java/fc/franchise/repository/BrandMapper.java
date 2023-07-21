package fc.franchise.repository;

import fc.franchise.domain.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {

    List<Brand> findAll();

    List<Brand> departure();

    List<Brand> findTop3(String category);
    
}
