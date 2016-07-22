package com.cn.base.service;

import org.mybatis.spring.SqlSessionTemplate;

/**
 * 
 * @author moon
 *
 */
public interface BaseService {
	public SqlSessionTemplate getSqlDao();
}
