package otg.dao;

import java.util.List;

public interface BaseMapperExample<T,ET>{
	
	public long countByExample(ET example);
	
	public int deleteByExample(ET example);
	
	public List<T> selectByExample(ET example);
	
	public int updateByExampleSelective(T record, ET example);
	
	public int updateByExample(T record, ET example);
	
}
