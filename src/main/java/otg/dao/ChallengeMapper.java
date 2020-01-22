package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import otg.bean.Challenge;
import otg.bean.ChallengeExample;

public interface ChallengeMapper extends Mapper<Challenge,ChallengeExample>{

    long countByExample(ChallengeExample example);

    int deleteByExample(ChallengeExample example);

    int deleteByPrimaryKey(Integer challengeId);

    int insert(Challenge record);

    int insertSelective(Challenge record);

    List<Challenge> selectByExample(ChallengeExample example);

    Challenge selectByPrimaryKey(Integer challengeId);

    int updateByExampleSelective(@Param("record") Challenge record, @Param("example") ChallengeExample example);

    int updateByExample(@Param("record") Challenge record, @Param("example") ChallengeExample example);

    int updateByPrimaryKeySelective(Challenge record);

    int updateByPrimaryKey(Challenge record);
}