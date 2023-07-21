package fc.franchise.repository.address;

import fc.franchise.domain.Address;

import java.util.List;
import java.util.Optional;

public interface AddressInterface {
    List<Address> findAll();

    Optional<Address> findByName(String brand_name);

}
