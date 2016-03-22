package com.budgetms.controller;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.budgetms.util.Msg;

public class BaseController {
	protected final static JSON SUCCESS = Msg.SUCCESS;
	//protected final static JSON FAIL = Msg.FAIL;
	//static Logger logger = Logger.getLogger(BaseController.class);
	
	String getId(HttpServletRequest request){
		String id = request.getParameter("obj");
		Object o = JSON.parse(id);
		return o.toString();
		
	}
	
	public static void main(String args[]) {
		System.out.println(SUCCESS);
	}
}
