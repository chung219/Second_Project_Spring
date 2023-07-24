package fc.franchise.repository.franchiseBrandInfo;

import fc.franchise.domain.FranchiseBrandInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FranchiseBrandInfoRepository implements FranchiseBrandInfoInterface{

    private final FranchiseBrandInfoMapper franchiseBrandInfoMapper;

    @Override
    public List<FranchiseBrandInfo> regionTop10() {
        return franchiseBrandInfoMapper.regionTop10();
    }
}
