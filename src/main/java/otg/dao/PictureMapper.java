package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.OtgUser;
import otg.bean.OtgUserExample;
import otg.bean.Picture;
import otg.bean.PictureExample;

public interface PictureMapper extends Mapper<Picture,PictureExample> {

    long countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(Integer pictureId);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(Integer pictureId);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}