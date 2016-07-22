package com.cn.user.service;

import java.util.List;

import com.cn.user.pojo.User;

public interface IUserService {
	public User getUserById(Integer userId);
	
	public List<User> getUserList();
	
	public void saveOrUpdate(User user);
	
	public User query(Integer id);
	
	public void del(Integer id);
	
	public int getInsertBackId(User user);
	
}
