package otg.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import otg.dao.Mapper;

//import otg.bean.Domain;
//import otg.dao.base.DomainMapper;

@Service("baseService")
public abstract class BaseService implements OtgService{

	@Autowired
	@Qualifier("batchSqlSession")
	protected SqlSession batchSqlSession;
	
	//TODO
	@Override
	public <T,ET> int batchOperation(List<T> criteriaList, Class<Mapper<T,ET>> clazz) {
		int count = 0;
		Mapper<T,ET> mapper = batchSqlSession.getMapper(clazz);
		for(T criteria : criteriaList) {
			mapper.insertSelective(criteria);
			count++;
		}
		batchSqlSession.commit();
		batchSqlSession.close();
		return count;
	}
	
}
