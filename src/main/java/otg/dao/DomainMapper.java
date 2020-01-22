package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.District;
import otg.bean.DistrictExample;
import otg.bean.Domain;
import otg.bean.DomainExample;

public interface DomainMapper extends Mapper<Domain,DomainExample>{

    long countByExample(DomainExample example);

    int deleteByExample(DomainExample example);

    int deleteByPrimaryKey(Integer domainId);

    int insert(Domain record);

    int insertSelective(Domain record);

    List<Domain> selectByExample(DomainExample example);

    Domain selectByPrimaryKey(Integer domainId);

    int updateByExampleSelective(@Param("record") Domain record, @Param("example") DomainExample example);

    int updateByExample(@Param("record") Domain record, @Param("example") DomainExample example);

    int updateByPrimaryKeySelective(Domain record);

    int updateByPrimaryKey(Domain record);
}