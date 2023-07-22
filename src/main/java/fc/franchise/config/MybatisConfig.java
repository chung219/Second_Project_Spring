package fc.franchise.config;

import fc.franchise.repository.brand.BrandInterface;
import fc.franchise.repository.brand.BrandMapper;
import fc.franchise.repository.brand.MybatisBrandRepository;
import fc.franchise.repository.food.FoodInterface;
import fc.franchise.repository.food.FoodMapper;
import fc.franchise.repository.food.MybatisFoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MybatisConfig {
    private final FoodMapper foodMapper;
    private final BrandMapper brandMapper;

    @Bean
    public FoodInterface foodInterface() {
        return new MybatisFoodRepository(foodMapper);
    }

    @Bean
    public BrandInterface brandInterface() {
        return new MybatisBrandRepository(brandMapper);
    }
}
