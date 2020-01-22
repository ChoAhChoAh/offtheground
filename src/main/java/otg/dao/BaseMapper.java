package otg.dao;


public interface BaseMapper<T> {
	
	public int insert(T record);
	
	public int deleteByPrimaryKey(Integer id);
	
	public int insertSelective(T record);
	
	public T selectByPrimaryKey(Integer id);
	
	public int updateByPrimaryKeySelective(T record);
	
	public int updateByPrimaryKey(T record);
	
}
