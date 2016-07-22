package com.cn.base.dao;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author moon
 *
 */
@Repository("baseDao")
public class BaseDaoImpl implements BaseDao {
	@Autowired
	public SqlSessionTemplate sqlDao;
	public Logger logger = Logger.getLogger(String.class);

	public Object save(String str, Object obj) throws Exception {
		return sqlDao.insert(str, obj);
	}
	
	public Object update(String str, Object obj) throws Exception {
		return sqlDao.update(str, obj);
	}

	public Object delete(String str, Object obj) throws Exception {
		return sqlDao.delete(str, obj);
	}
	 
	public Object findForObject(String str, Object obj) throws Exception {
		return sqlDao.selectOne(str, obj);
	}

	public Object findForList(String str, Object obj) throws Exception {
		return sqlDao.selectList(str, obj);
	}
	
	public Object findForMap(String str, Object obj, String key, String value) throws Exception {
		return sqlDao.selectMap(str, obj, key);
	}
	
	public void rollback(){
		try{
			sqlDao.rollback();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlDao.close();
		}
	}
	
	public SqlSessionTemplate getSqlDao(){
		return sqlDao;
	}
	
}
