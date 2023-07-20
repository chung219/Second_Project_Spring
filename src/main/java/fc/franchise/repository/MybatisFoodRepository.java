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
    public List<Food> findAllKor() {
        return foodMapper.findAllKor();
    }

    @Override
    public List<Food> findAllJap() {
        return foodMapper.findAllJap();
    }

    @Override
    public List<Food> findAllChina() {
        return foodMapper.findAllChina();
    }

    @Override
    public List<Food> findAllWes() {
        return foodMapper.findAllWes();
    }

    @Override
    public List<Food> findAllOCon() {
        return foodMapper.findAllOCon();
    }

    @Override
    public List<Food> findAllBun() {
        return foodMapper.findAllBun();
    }

    @Override
    public List<Food> findAllFast() {
        return foodMapper.findAllFast();
    }

    @Override
    public List<Food> findAllChic() {
        return foodMapper.findAllChic();
    }

    @Override
    public List<Food> findAllPizza() {
        return foodMapper.findAllPizza();
    }

    @Override
    public List<Food> findAllBread() {
        return foodMapper.findAllBread();
    }

    @Override
    public List<Food> findAllIce() {
        return foodMapper.findAllIce();
    }

    @Override
    public List<Food> findAllCof() {
        return foodMapper.findAllCof();
    }

    @Override
    public List<Food> findAllOther() {
        return foodMapper.findAllOther();
    }

    @Override
    public List<Food> findAllNonCof() {
        return foodMapper.findAllCof();
    }

    @Override
    public List<Food> findAllDrink() {
        return foodMapper.findAllDrink();
    }

    @Override
    public List<Food> findCategory(String category) {
        return foodMapper.findCategory(category);
    }
}
