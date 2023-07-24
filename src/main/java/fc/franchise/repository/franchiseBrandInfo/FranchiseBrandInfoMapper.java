package fc.franchise.repository.franchiseBrandInfo;

import fc.franchise.domain.FranchiseBrandInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FranchiseBrandInfoMapper {

    List<FranchiseBrandInfo> regionTop10();
}
