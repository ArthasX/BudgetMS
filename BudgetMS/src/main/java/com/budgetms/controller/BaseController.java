package com.budgetms.controller;

import com.alibaba.fastjson.JSON;
import com.budgetms.util.Msg;

public class BaseController {
	protected final static JSON SUCCESS=Msg.SUCCESS;
	protected final static JSON FAIL=Msg.FAIL;
	
	public static void main(String args[]){
		System.out.println(SUCCESS);
	}
}