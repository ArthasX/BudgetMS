package com.budgetms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Invoice;
import com.budgetms.service.IInvoService;
import com.budgetms.util.Msg;
import com.budgetms.util.MysqlErrTranslator;

@Controller
@RequestMapping("/invo")
public class InvoController extends BaseController {
	static Logger logger = Logger.getLogger(InvoController.class);
	@Resource
	private IInvoService invoService;

	@RequestMapping("/findInvoByProperty.do")
	@ResponseBody
	public Object findInvoByProperty(HttpServletRequest request) {
		String json = request.getParameter("obj");
		Invoice invo = JSON.toJavaObject(JSON.parseObject(json), Invoice.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return invoService.getInvoByPage(invo, start, limit);
	}

	@RequestMapping("/updateInvo.do")
	@ResponseBody
	public Object updateInvo(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		Invoice invo = JSON.toJavaObject(JSON.parseObject(json), Invoice.class);
		int result;
		try {
			result = invoService.updateInvo(invo);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		if (result != -1)
			return SUCCESS;
		else
			return Msg.NO_CONTPAYMENT_ID;
	}

	@RequestMapping("/insertInvo.do")
	@ResponseBody
	public Object insertInvo(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		Invoice invo = JSON.toJavaObject(JSON.parseObject(json), Invoice.class);
		// invo.setOptUser(1);
		int result;
		try {
			result = invoService.insertInvo(invo);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		if (result != -1)
			return SUCCESS;
		else
			return Msg.NO_CONTPAYMENT_ID;
	}

	@RequestMapping("/deleteInvo.do")
	@ResponseBody
	public Object deleteInvo(HttpServletRequest request) {
		String id = getId(request);
		logger.info("id:" + id);
		try {
			invoService.deleteInvo(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}
}
