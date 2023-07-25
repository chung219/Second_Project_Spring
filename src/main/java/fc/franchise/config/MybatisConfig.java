package fc.franchise.config;

import fc.franchise.repository.brand.BrandInterface;
import fc.franchise.repository.brand.BrandMapper;
import fc.franchise.repository.brand.MybatisBrandRepository;
import fc.franchise.repository.cost.CostInterface;
import fc.franchise.repository.cost.CostMapper;
import fc.franchise.repository.cost.MybatisCostRepository;
import fc.franchise.repository.food.FoodInterface;
import fc.franchise.repository.food.FoodMapper;
import fc.franchise.repository.food.MybatisFoodRepository;
import fc.franchise.repository.franchiseBrandInfo.FranchiseBrandInfoInterface;
import fc.franchise.repository.franchiseBrandInfo.FranchiseBrandInfoMapper;
import fc.franchise.repository.franchiseBrandInfo.FranchiseBrandInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MybatisConfig {
    private final FoodMapper foodMapper;
    private final BrandMapper brandMapper;
    private final CostMapper costMapper;
    private final FranchiseBrandInfoMapper franchiseBrandInfoMapper;

    @Bean
    public FoodInterface foodInterface() {
        return new MybatisFoodRepository(foodMapper);
    }

    @Bean
    public BrandInterface brandInterface() {
        return new MybatisBrandRepository(brandMapper);
    }

    @Bean
    public CostInterface costInterface() {
        return new MybatisCostRepository(costMapper);
    }

    @Bean
    public FranchiseBrandInfoInterface franchiseBrandInfoInterface() {
        return new FranchiseBrandInfoRepository(franchiseBrandInfoMapper);
    }
}
