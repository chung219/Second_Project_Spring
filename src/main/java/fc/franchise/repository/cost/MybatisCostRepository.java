package fc.franchise.repository.cost;

import fc.franchise.domain.Cost;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MybatisCostRepository implements CostInterface{

    private final CostMapper costMapper;

    @Override
    public List<Cost> findAll() {
        return costMapper.findAll();
    }
}
