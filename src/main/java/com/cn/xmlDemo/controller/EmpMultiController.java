package com.cn.xmlDemo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.cn.common.editor.DoubleEditor;
import com.cn.common.editor.FloatEditor;
import com.cn.common.editor.IntegerEditor;
import com.cn.common.editor.LongEditor;

public class EmpMultiController extends MultiActionController{
	
	public ModelAndView to_add(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("add_emp");
		mav.addObject("deptList", new String[]{"sales","manage"});
		return mav;
	}
	
	public ModelAndView doTest(HttpServletRequest request, HttpServletResponse response){
		System.out.println("doTest");
		return null;
	}
	
	public ModelAndView add_emp(HttpServletRequest request, HttpServletResponse response){
		return new ModelAndView("success");
	}

	@Override
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
	   binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));    
	   binder.registerCustomEditor(int.class, new CustomNumberEditor(int.class, true));    
	   binder.registerCustomEditor(int.class, new IntegerEditor());    
	   binder.registerCustomEditor(long.class, new CustomNumberEditor(long.class, true));  
       binder.registerCustomEditor(long.class, new LongEditor());    
       binder.registerCustomEditor(double.class, new DoubleEditor());    
       binder.registerCustomEditor(float.class, new FloatEditor());    
	}
	
}


