package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.Picture;
import otg.bean.PictureExample;
import otg.bean.Provience;
import otg.bean.ProvienceExample;

public interface ProvienceMapper extends Mapper<Provience,ProvienceExample> {

    long countByExample(ProvienceExample example);

    int deleteByExample(ProvienceExample example);

    int deleteByPrimaryKey(Integer provienceId);

    int insert(Provience record);

    int insertSelective(Provience record);

    List<Provience> selectByExample(ProvienceExample example);

    Provience selectByPrimaryKey(Integer provienceId);

    int updateByExampleSelective(@Param("record") Provience record, @Param("example") ProvienceExample example);

    int updateByExample(@Param("record") Provience record, @Param("example") ProvienceExample example);

    int updateByPrimaryKeySelective(Provience record);

    int updateByPrimaryKey(Provience record);
}