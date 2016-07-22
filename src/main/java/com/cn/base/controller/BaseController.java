package com.cn.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * 
 * @author moon
 *
 */
public class BaseController {
	protected HttpServletRequest request; 
    protected HttpServletResponse response; 
    protected HttpSession session; 
    protected Logger logger = Logger.getLogger(this.getClass());
     
    @ModelAttribute 
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){ 
        this.request = request; 
        this.response = response; 
        this.session = request.getSession(); 
        String path = request.getContextPath();
    	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    	request.setAttribute("_ctx", basePath);
    } 
}
