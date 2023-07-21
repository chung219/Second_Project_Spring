package fc.franchise.repository.address;

import fc.franchise.domain.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MybatisAddressRepository implements AddressInterface{
    private final AddressMapper addressMapper;

    @Override
    public List<Address> findAll() {
        return addressMapper.findAll();
    }

    @Override
    public Optional<Address> findByName(String brand_name) {
        return addressMapper.findByName(brand_name);
    }
}
