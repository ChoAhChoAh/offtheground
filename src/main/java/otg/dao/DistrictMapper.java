package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.Code;
import otg.bean.CodeExample;
import otg.bean.District;
import otg.bean.DistrictExample;

public interface DistrictMapper extends Mapper<District,DistrictExample>{

    long countByExample(DistrictExample example);

    int deleteByExample(DistrictExample example);

    int deleteByPrimaryKey(Integer districtId);

    int insert(District record);

    int insertSelective(District record);

    List<District> selectByExample(DistrictExample example);

    District selectByPrimaryKey(Integer districtId);

    int updateByExampleSelective(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByExample(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}