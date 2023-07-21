package fc.franchise.repository.general;


import fc.franchise.domain.GeneralInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MybatisGeneralRepository implements GeneralInterface {

    private final GeneralMapper generalMapper;

    @Override
    public List<GeneralInfo> findAll() {
        return generalMapper.findAll();
    }
}
