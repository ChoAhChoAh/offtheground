package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.Location;
import otg.bean.LocationExample;
import otg.bean.LocationOperation;
import otg.bean.LocationOperationExample;

public interface LocationOperationMapper extends Mapper<LocationOperation,LocationOperationExample> {

    long countByExample(LocationOperationExample example);

    int deleteByExample(LocationOperationExample example);

    int insert(LocationOperation record);

    int insertSelective(LocationOperation record);

    List<LocationOperation> selectByExample(LocationOperationExample example);

    int updateByExampleSelective(@Param("record") LocationOperation record, @Param("example") LocationOperationExample example);

    int updateByExample(@Param("record") LocationOperation record, @Param("example") LocationOperationExample example);
}