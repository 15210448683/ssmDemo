package com.cn.userDemo.service;

import com.cn.base.service.BaseService;
import com.cn.userDemo.pojo.UserDemo;

public interface UserDemoService  extends BaseService{
	
	public void saveUser (UserDemo u)throws Exception;
	
	public String getUserNameById(int id);

}
