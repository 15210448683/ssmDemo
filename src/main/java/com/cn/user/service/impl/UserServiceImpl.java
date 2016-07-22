package com.cn.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.user.daoMapper.UserMapper;
import com.cn.user.pojo.User;
import com.cn.user.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userDao;
	
	
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}


	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		List<User> users=this.userDao.queryUsers();
		return users;
	}


	public void saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		if (user.getId() == null || user.getId() == 0) {
			//新增用户
			userDao.insert(user);
		} else {
			userDao.updateByPrimaryKeySelective(user);
		}
		
	}
	
	public User query(Integer id) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(id);
		
	}
	
	public void del(Integer id) {
		// TODO Auto-generated method stub
		 userDao.deleteByPrimaryKey(id);
		 
	}
	
	public int getInsertBackId(User user) {
		// TODO Auto-generated method stub
		 return userDao.insertUserWithBackId(user);		 
	}
	

}
