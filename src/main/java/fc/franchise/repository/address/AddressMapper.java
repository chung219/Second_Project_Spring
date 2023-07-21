package fc.franchise.repository.address;

import fc.franchise.domain.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AddressMapper {
    List<Address> findAll();

    Optional<Address> findByName(String brand_name);
}
