package com.cn.person.service.impl;

import javax.annotation.Resource;

import com.cn.person.daoMapper.PersonMapper;
import com.cn.person.service.IPersonService;

public class PersonServiceImpl implements IPersonService {
	
	@Resource
	public PersonMapper personDao;

	@Override
	public String getAgeByIdNum(String idNum) {
		// TODO Auto-generated method stub		
		return personDao.selectNameByIdNum(idNum);
	}

}
