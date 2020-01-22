package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.City;
import otg.bean.CityExample;
import otg.bean.Code;
import otg.bean.CodeExample;

public interface CodeMapper  extends Mapper<Code,CodeExample>{

    long countByExample(CodeExample example);

    int deleteByExample(CodeExample example);

    int insert(Code record);

    int insertSelective(Code record);

    List<Code> selectByExample(CodeExample example);

    int updateByExampleSelective(@Param("record") Code record, @Param("example") CodeExample example);

    int updateByExample(@Param("record") Code record, @Param("example") CodeExample example);
}