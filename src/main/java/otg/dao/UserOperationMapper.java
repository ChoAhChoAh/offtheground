package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.UserChallenge;
import otg.bean.UserChallengeExample;
import otg.bean.UserOperation;
import otg.bean.UserOperationExample;

public interface UserOperationMapper extends Mapper<UserOperation,UserOperationExample> {

    long countByExample(UserOperationExample example);

    int deleteByExample(UserOperationExample example);

    int insert(UserOperation record);

    int insertSelective(UserOperation record);

    List<UserOperation> selectByExample(UserOperationExample example);

    int updateByExampleSelective(@Param("record") UserOperation record, @Param("example") UserOperationExample example);

    int updateByExample(@Param("record") UserOperation record, @Param("example") UserOperationExample example);
}