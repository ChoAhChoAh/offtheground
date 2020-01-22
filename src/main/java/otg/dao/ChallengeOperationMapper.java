package otg.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import otg.bean.Challenge;
import otg.bean.ChallengeExample;
import otg.bean.ChallengeOperation;
import otg.bean.ChallengeOperationExample;

public interface ChallengeOperationMapper  extends Mapper<ChallengeOperation,ChallengeOperationExample>{

    long countByExample(ChallengeOperationExample example);

    int deleteByExample(ChallengeOperationExample example);

    int insert(ChallengeOperation record);

    int insertSelective(ChallengeOperation record);

    List<ChallengeOperation> selectByExample(ChallengeOperationExample example);

    int updateByExampleSelective(@Param("record") ChallengeOperation record, @Param("example") ChallengeOperationExample example);

    int updateByExample(@Param("record") ChallengeOperation record, @Param("example") ChallengeOperationExample example);
}