package fc.franchise.repository;

import fc.franchise.domain.GeneralInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GeneralMapper {

    List<GeneralInfo> findAll();
}
