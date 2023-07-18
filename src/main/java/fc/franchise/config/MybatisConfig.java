package fc.franchise.config;

import fc.franchise.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MybatisConfig {
    private final AddressMapper addressMapper;
    private final FoodMapper foodMapper;

    @Bean
    public AddressInterface addressInterface(){
        return new MybatisAddressRepository(addressMapper);
    }

    @Bean
    public FoodInterface foodInterface() {
        return new MybatisFoodRepository(foodMapper);
    }
}
