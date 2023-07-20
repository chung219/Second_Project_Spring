package fc.franchise.repository;

import fc.franchise.domain.Food;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MybatisFoodRepository implements FoodInterface {
    private final FoodMapper foodMapper;

    @Override
    public List<Food> findAll() {
        return foodMapper.findAll();


    }
}
