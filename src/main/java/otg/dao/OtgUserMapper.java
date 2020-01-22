package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.LocationOperation;
import otg.bean.LocationOperationExample;
import otg.bean.OtgUser;
import otg.bean.OtgUserExample;

public interface OtgUserMapper extends Mapper<OtgUser,OtgUserExample> {

    long countByExample(OtgUserExample example);

    int deleteByExample(OtgUserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(OtgUser record);

    int insertSelective(OtgUser record);

    List<OtgUser> selectByExample(OtgUserExample example);

    OtgUser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") OtgUser record, @Param("example") OtgUserExample example);

    int updateByExample(@Param("record") OtgUser record, @Param("example") OtgUserExample example);

    int updateByPrimaryKeySelective(OtgUser record);

    int updateByPrimaryKey(OtgUser record);
}