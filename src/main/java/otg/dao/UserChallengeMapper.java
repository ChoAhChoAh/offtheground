package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.ResourceOperation;
import otg.bean.ResourceOperationExample;
import otg.bean.UserChallenge;
import otg.bean.UserChallengeExample;

public interface UserChallengeMapper extends Mapper<UserChallenge,UserChallengeExample> {

    long countByExample(UserChallengeExample example);

    int deleteByExample(UserChallengeExample example);

    int deleteByPrimaryKey(Integer ucId);

    int insert(UserChallenge record);

    int insertSelective(UserChallenge record);

    List<UserChallenge> selectByExample(UserChallengeExample example);

    UserChallenge selectByPrimaryKey(Integer ucId);

    int updateByExampleSelective(@Param("record") UserChallenge record, @Param("example") UserChallengeExample example);

    int updateByExample(@Param("record") UserChallenge record, @Param("example") UserChallengeExample example);

    int updateByPrimaryKeySelective(UserChallenge record);

    int updateByPrimaryKey(UserChallenge record);
}