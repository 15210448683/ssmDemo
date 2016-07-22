package com.cn.person.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class PersonController1 extends MultiActionController{
	
	
  
    public ModelAndView add(HttpServletRequest req,  
            HttpServletResponse resp) throws Exception {   
        
    	System.out.println("1111");
    	
        return new ModelAndView("addUser");  
    }  
    
    public ModelAndView update(HttpServletRequest req,  
            HttpServletResponse resp) throws Exception {   
        
    	System.out.println("2222");
    	
        return new ModelAndView("addUser");  
    }  
	
    
    public ModelAndView updateUser(HttpServletRequest request,HttpServletResponse response){
    	System.out.println("updateUser");//方便于跟踪执行了哪个方法　
    	return new ModelAndView("addUser","from","updateUser");
    }
    public ModelAndView deleteUser(HttpServletRequest request,HttpServletResponse response) {
    	System.out.println("deleteUser");//方便于跟踪执行了哪个方法　
    	return new ModelAndView("addUser","from","deleteUser");
    }
    
    public ModelAndView method01(
    		HttpServletRequest request,   HttpServletResponse response) {
    	
    		return new ModelAndView("courseList", "courses", "method01");
    		}

}
