package com.budgetms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.BudgetInfo;
import com.budgetms.pojo.BudgetType;
import com.budgetms.service.IBudgetService;
import com.budgetms.util.MysqlErrTranslator;

@Controller
@RequestMapping("/budget")
public class BudgetController extends BaseController {
	static Logger logger = Logger.getLogger(BudgetController.class);
	@Resource
	private IBudgetService budgetService;

	// budget info
	@RequestMapping("/findBudgetInfoByPage.do")
	@ResponseBody
	public Object findBudgetInfoByPage(HttpServletRequest request) {
		String json = request.getParameter("obj");
		BudgetInfo budgetInfo = JSON.toJavaObject(JSON.parseObject(json),
				BudgetInfo.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return budgetService.getBudgetInfoByPage(budgetInfo, start, limit);
	}

	@RequestMapping("/updateBudgetInfo.do")
	@ResponseBody
	public Object updateBudgetInfo(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		BudgetInfo budgetInfo = JSON.toJavaObject(JSON.parseObject(json),
				BudgetInfo.class);
		try {
			budgetService.updateBudgetInfo(budgetInfo);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertBudgetInfo.do")
	@ResponseBody
	public Object insertBudgetInfo(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		BudgetInfo budgetInfo = JSON.toJavaObject(JSON.parseObject(json),
				BudgetInfo.class);
		// budgetInfo.setOptUser(1);
		try {
			budgetService.insertBudgetInfo(budgetInfo);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteBudgetInfo.do")
	@ResponseBody
	public Object deleteBudgetInfo(HttpServletRequest request) {
		String id = getId(request);
		logger.info("id:" + id);
		try {
			budgetService.deleteBudgetInfo(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}

	// budget type
	@RequestMapping("/findBudgetTypeByPage.do")
	@ResponseBody
	public Object findBudgetTypeByPage(HttpServletRequest request) {
		String json = request.getParameter("obj");
		BudgetType budgetType = JSON.toJavaObject(JSON.parseObject(json),
				BudgetType.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return budgetService.getBudgetTypeByPage(budgetType, start, limit);
	}

	@RequestMapping("/updateBudgetType.do")
	@ResponseBody
	public Object updateBudgetType(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		BudgetType budgetType = JSON.toJavaObject(JSON.parseObject(json),
				BudgetType.class);
		try {
			budgetService.updateBudgetType(budgetType);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertBudgetType.do")
	@ResponseBody
	public Object insertBudgetType(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		BudgetType budgetType = JSON.toJavaObject(JSON.parseObject(json),
				BudgetType.class);
		// budgetType.setOptUser(1);
		try {
			budgetService.insertBudgetType(budgetType);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteBudgetType.do")
	@ResponseBody
	public Object deleteBudgetType(HttpServletRequest request) {
		String id = getId(request);
		logger.info("id:" + id);
		try {
			budgetService.deleteBudgetType(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}

}
