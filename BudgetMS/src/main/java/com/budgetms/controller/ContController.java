package com.budgetms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Contract;
import com.budgetms.service.IContService;
import com.budgetms.util.MysqlErrTranslator;

@Controller
@RequestMapping("/cont")
public class ContController extends BaseController {
	static Logger logger = Logger.getLogger(ContController.class);
	@Resource
	private IContService contService;

	@RequestMapping("/findContByProperty.do")
	@ResponseBody
	public Object findInstByProperty(HttpServletRequest request) {
		String json = request.getParameter("obj");
		Contract cont = JSON.toJavaObject(JSON.parseObject(json),
				Contract.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return contService.getContByPage(cont, start, limit);
	}

 
	@RequestMapping("/updateCont.do")
	@ResponseBody
	public Object updateCont(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		Contract cont = JSON.toJavaObject(JSON.parseObject(json),
				Contract.class);
		try {
			contService.updateCont(cont);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertCont.do")
	@ResponseBody
	public Object insertCont(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		Contract cont = JSON.toJavaObject(JSON.parseObject(json),
				Contract.class);
		try {
			contService.insertCont(cont);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteCont.do")
	@ResponseBody
	public Object deleteCont(HttpServletRequest request) {
		String contId = request.getParameter("obj");
		JSON json=JSON.parseObject(contId);
		//json.
		logger.info("id:" + contId);
		try {
			contService.deleteCont(contId);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}
}
