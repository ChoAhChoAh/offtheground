package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.ChallengeOperation;
import otg.bean.ChallengeOperationExample;
import otg.bean.City;
import otg.bean.CityExample;

public interface CityMapper  extends Mapper<City,CityExample>{

    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer cityId);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer cityId);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}