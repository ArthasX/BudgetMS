package com.budgetms.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.budgetms.service.IDeptService;

@Controller
@RequestMapping("/dept")
public class DeptController extends BaseController {
	static Logger logger = Logger.getLogger(DeptController.class);
	@Resource
	private IDeptService deptService;

	//static Object deptCache;..暂时也用不到缓存。。
	@RequestMapping("/getAllDept.do")
	@ResponseBody
	public Object getAllDept() {
		Object o = deptService.getAllDept();
		logger.info(o);
		return o;
	}
}
