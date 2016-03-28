package com.budgetms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Tender;
import com.budgetms.service.impl.TenderServiceImpl;
import com.budgetms.util.MysqlErrTranslator;

@Controller
@RequestMapping("/tender")
class TenderController extends BaseController {
	static Logger logger = Logger.getLogger(TenderController.class);
	@Resource
	private TenderServiceImpl tenderService;
	@RequestMapping("/findTenderByPage.do")
	@ResponseBody
	public Object findTenderByPage(HttpServletRequest request) {
		String json = request.getParameter("obj");
		Tender tender = JSON.toJavaObject(JSON.parseObject(json),
				Tender.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return tenderService.getTenderByPage(tender, start, limit);
	}

	@RequestMapping("/updateTender.do")
	@ResponseBody
	public Object updateTender(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		Tender tender = JSON.toJavaObject(JSON.parseObject(json),
				Tender.class);
		try {
			tenderService.updateTender(tender);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertTender.do")
	@ResponseBody
	public Object insertTender(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		Tender tender = JSON.toJavaObject(JSON.parseObject(json),
				Tender.class);
		// tender.setOptUser(1);
		try {
			tenderService.insertTender(tender);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteTender.do")
	@ResponseBody
	public Object deleteTender(HttpServletRequest request) {
		String id = getId(request);
		logger.info("id:" + id);
		try {
			tenderService.deleteTender(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}
}
