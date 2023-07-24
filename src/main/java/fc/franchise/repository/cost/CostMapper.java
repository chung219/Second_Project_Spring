package fc.franchise.repository.cost;

import fc.franchise.domain.Cost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CostMapper {
    List<Cost> findAll();
}
