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
    public List<FranchiseBrandInfo> findFranchise() {
        return franchiseBrandInfoMapper.findFranchise();
    }

    @Override
    public List<FranchiseBrandInfo> findFranchise_inc() {
        return franchiseBrandInfoMapper.findFranchise_inc();
    }

    @Override
    public List<FranchiseBrandInfo> findFranchise_bu() {
        return franchiseBrandInfoMapper.findFranchise_bu();
    }
}
