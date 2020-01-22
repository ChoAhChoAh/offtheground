package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.Provience;
import otg.bean.ProvienceExample;
import otg.bean.ResourceOperation;
import otg.bean.ResourceOperationExample;

public interface ResourceOperationMapper extends Mapper<ResourceOperation,ResourceOperationExample> {

    long countByExample(ResourceOperationExample example);

    int deleteByExample(ResourceOperationExample example);

    int insert(ResourceOperation record);

    int insertSelective(ResourceOperation record);

    List<ResourceOperation> selectByExample(ResourceOperationExample example);

    int updateByExampleSelective(@Param("record") ResourceOperation record, @Param("example") ResourceOperationExample example);

    int updateByExample(@Param("record") ResourceOperation record, @Param("example") ResourceOperationExample example);
}