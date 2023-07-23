package fc.franchise.repository.sales;


import fc.franchise.domain.Sales;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MybatisSalesRepository implements SalesInterface{

    private final SalesMapper salesMapper;

    @Override
    public List<Sales> findAll() {
        return salesMapper.findAll();
    }


}
