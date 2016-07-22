package com.cn.base.service.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.base.dao.BaseDao;
import com.cn.base.service.BaseService;

/**
 * 
 * @author moon
 *
 */
@Service("baseService")
public class BaseServiceImpl implements BaseService {
	
	@Autowired
	public BaseDao baseDao;
	
	@Override
	public SqlSessionTemplate getSqlDao() {
		return baseDao.getSqlDao();
	}

}
