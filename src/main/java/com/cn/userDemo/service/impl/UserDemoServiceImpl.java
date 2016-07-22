package com.cn.userDemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cn.base.service.impl.BaseServiceImpl;
import com.cn.userDemo.dao.UserDemoDao;
import com.cn.userDemo.daoMapper.UserDemoMapper;
import com.cn.userDemo.pojo.UserDemo;
import com.cn.userDemo.service.UserDemoService;
import com.sun.media.jfxmedia.logging.Logger;

@Service("userDemoService")
public class UserDemoServiceImpl extends BaseServiceImpl implements UserDemoService{

	@Autowired
	public UserDemoDao userDemoDao;
	
	@Autowired
	public UserDemoMapper userDemoMapper;
	
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void saveUser(UserDemo u) throws Exception {
		// TODO Auto-generated method stub
		try{
			userDemoDao.save("UserDemo.saveUser", u);
			//baseDao.save("UserDemo.saveUser", u);
			//userDemoMapper.insert(u);
		}catch(Exception e){
			throw e;
		}
		
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly=true)
	public String getUserNameById(int id) {
		// TODO Auto-generated method stub
		//String userName=userDemoMapper.selectNameById(id);
		String userName="";
		try {
			UserDemo user=(UserDemo)userDemoDao.findForObject("UserDemo.getUserById", 1);
			userName=user.getUserName();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return userName;
	}
	
	
	

}
