package com.cn.userDemo.daoMapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.cn.userDemo.pojo.UserDemo;


public interface UserDemoMapper {
	@Select("select user_Name from user where id=#{id}")
	String selectNameById(int id);
	
	
	@Insert("insert into user (id, user_name, password, age) values (#{id}, #{userName}, #{password}, #{age})")
    int insert(UserDemo record);
}
    