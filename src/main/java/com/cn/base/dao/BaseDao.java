package com.cn.base.dao;

import org.mybatis.spring.SqlSessionTemplate;

/**
 * 
 * @author moon
 *
 */
public interface BaseDao {
	
	public Object save(String str, Object obj) throws Exception;
	
	public Object update(String str, Object obj) throws Exception;
	
	public Object delete(String str, Object obj) throws Exception;

	public Object findForObject(String str, Object obj) throws Exception;

	public Object findForList(String str, Object obj) throws Exception;
	
	public Object findForMap(String sql, Object obj, String key , String value) throws Exception;
	
	public SqlSessionTemplate getSqlDao();
	
	public void rollback();
	
}
