package fc.franchise.repository.food;

import fc.franchise.domain.Food;
import fc.franchise.domain.Page;

import java.util.List;

public interface FoodInterface {

    List<Food> findCategory(String category);

    List<Food> loadTable(String category);

    List<Food>findBrandName(String brandName);

    List<Food> getList(Page page);
}
