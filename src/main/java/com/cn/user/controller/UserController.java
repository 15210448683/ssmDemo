package com.cn.user.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.user.pojo.User;
import com.cn.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	public Logger log= Logger.getLogger(UserController.class);;
	/**
	 * 获取user
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		Integer userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/main")
	public String main(HttpServletRequest request,Model model){
		List<User> users=userService.getUserList();
		log.info("进入user列表");
		model.addAttribute("list", users);
		return "userList";
	}
	
	@RequestMapping("/add")
	public String add(HttpServletRequest request,HttpServletResponse response,Model model){
		return "addUser";
	}
	
	@RequestMapping("/save")
	public ModelAndView save(User user,HttpServletRequest request,Model model){
		
		userService.saveOrUpdate(user);
		return new ModelAndView("redirect:/user/main");
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id")Integer id,HttpServletRequest request,ModelMap modelMap){
		User user=userService.query(id);
		modelMap.put("data", user);
		
		return "addUser";
	}
	
	@RequestMapping("/del/{id}")
	public ModelAndView del(@PathVariable("id")Integer id,HttpServletRequest request,ModelMap modelMap){
		userService.del(id);		
		return new ModelAndView("redirect:/user/main");
	}
}
