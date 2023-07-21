package fc.franchise.repository;

import fc.franchise.domain.Food;

import java.util.List;

public interface FoodInterface {

    List<Food> findCategory(String category);
}
