package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.UserOperation;
import otg.bean.UserOperationExample;
import otg.bean.Video;
import otg.bean.VideoExample;

public interface VideoMapper  extends Mapper<Video,VideoExample> {

    long countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Integer videoId);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer videoId);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
}