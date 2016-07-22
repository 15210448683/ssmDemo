package com.cn.person.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cn.person.service.IPersonService;

public class PersonController implements Controller{
	
	private IPersonService personService;

	public IPersonService getPersonService() {
		return personService;
	}

	public void setPersonService(IPersonService personService) {
		this.personService = personService;
	}
	
	@Override  
    public ModelAndView handleRequest(HttpServletRequest req,  
            HttpServletResponse resp) throws Exception {   
        
    	personService.getAgeByIdNum("");
    	
        return new ModelAndView("addUser");  
    }  
	

}
