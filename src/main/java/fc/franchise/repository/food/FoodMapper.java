package fc.franchise.repository.food;

import fc.franchise.domain.Food;
import fc.franchise.domain.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodMapper {
    List<Food> findCategory(String category);

    List<Food> loadTable(String category);

    List<Food> findBrandName(String brandName);

    List<Food> getList(Page page);
}
