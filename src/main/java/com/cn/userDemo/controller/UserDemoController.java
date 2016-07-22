package com.cn.userDemo.controller;

import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.base.controller.BaseController;
import com.cn.userDemo.pojo.UserDemo;
import com.cn.userDemo.service.UserDemoService;
@Controller
@RequestMapping("/userDemo")
public class UserDemoController extends BaseController{
	@Autowired
	private UserDemoService userDemoService;
	
	@RequestMapping(value="/saveUser")
	public void saveUser(){
		logger.info("进入保存用户的函数！");
		String userName = request.getParameter("userName");
		PrintWriter out = null;
		try{
			System.out.println(userDemoService.getSqlDao());
			out = response.getWriter();
			if (userName != null && !"".equals(userName)){
				UserDemo u = new UserDemo();
				u.setUserName(userName);
				u.setAge(13);
				u.setPassword("123456");
				userDemoService.saveUser(u);
				out.print("ok");
				return;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		out.print("failed");
		out.flush();
		out.close();
		return;
	}
	

}
