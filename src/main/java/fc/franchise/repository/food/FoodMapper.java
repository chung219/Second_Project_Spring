package fc.franchise.repository.food;

import fc.franchise.domain.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodMapper {
    List<Food> findCategory(String category);

    List<Food> loadTable(String category);
}
