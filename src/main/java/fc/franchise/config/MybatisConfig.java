package fc.franchise.config;

import fc.franchise.repository.AddressInterface;
import fc.franchise.repository.AddressMapper;
import fc.franchise.repository.MybatisAddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MybatisConfig {
    private final AddressMapper addressMapper;

    @Bean
    public AddressInterface addressInterface(){
        return new MybatisAddressRepository(addressMapper);
    }
}
