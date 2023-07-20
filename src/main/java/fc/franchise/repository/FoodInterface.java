package fc.franchise.repository;

import fc.franchise.domain.Food;

import java.util.List;

public interface FoodInterface {
    List<Food> findAllKor();
    List<Food> findAllJap();
    List<Food> findAllChina();
    List<Food> findAllWes();
    List<Food> findAllOCon();
    List<Food> findAllBun();
    List<Food> findAllFast();
    List<Food> findAllChic();
    List<Food> findAllPizza();
    List<Food> findAllBread();
    List<Food> findAllIce();
    List<Food> findAllCof();
    List<Food> findAllOther();
    List<Food> findAllNonCof();
    List<Food> findAllDrink();

    List<Food> findCategory(String category);
}
