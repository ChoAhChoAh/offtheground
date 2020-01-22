package otg.service;

import java.util.List;

import otg.dao.Mapper;

public interface OtgService {
	
	public <T,ET> int batchOperation(List<T> criteriaList,Class<Mapper<T,ET>> clazz);
	
}
