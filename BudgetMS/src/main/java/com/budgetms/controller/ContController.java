package com.budgetms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.ContAdjust;
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
	public Object findContByProperty(HttpServletRequest request) {
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
		String id = getId(request);
		logger.info("id:" + id);
		try {
			contService.deleteCont(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}

	// cont adj

	@RequestMapping("/findContAdjByPage.do")
	@ResponseBody
	public Object findContAdjByPage(HttpServletRequest request) {
		String json = request.getParameter("obj");
		ContAdjust ca = JSON.toJavaObject(JSON.parseObject(json),
				ContAdjust.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return contService.getContAdjByPage(ca, start, limit);
	}

	@RequestMapping("/updateContAdj.do")
	@ResponseBody
	public Object updateContAdj(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		ContAdjust ca = JSON.toJavaObject(JSON.parseObject(json),
				ContAdjust.class);
		try {
			contService.updateContAdj(ca);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertContAdj.do")
	@ResponseBody
	public Object insertContAdj(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		ContAdjust ca = JSON.toJavaObject(JSON.parseObject(json),
				ContAdjust.class);
		try {
			contService.insertContAdj(ca);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteContAdj.do")
	@ResponseBody
	public Object deleteContAdj(HttpServletRequest request) {
		String id = getId(request);
		logger.info("id:" + id);
		try {
			contService.deleteContAdj(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}

}
