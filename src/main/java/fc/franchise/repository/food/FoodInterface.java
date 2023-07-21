package fc.franchise.repository.food;

import fc.franchise.domain.Food;

import java.util.List;

public interface FoodInterface {

    List<Food> findCategory(String category);
}
