package fc.franchise.repository.franchiseBrandInfo;

import fc.franchise.domain.FranchiseBrandInfo;

import java.util.List;

public interface FranchiseBrandInfoInterface {

    List<FranchiseBrandInfo> findFranchise();
    List<FranchiseBrandInfo> findFranchise_inc();
    List<FranchiseBrandInfo> findFranchise_bu();
}
