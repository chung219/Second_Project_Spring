package fc.franchise.repository.food;

import fc.franchise.domain.Food;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MybatisFoodRepository implements FoodInterface {
    private final FoodMapper foodMapper;

    @Override
    public List<Food> findCategory(String category) {
        return foodMapper.findCategory(category);
    }

    @Override
    public List<Food> loadTable(String category) {
        return foodMapper.loadTable(category);
    }
}
