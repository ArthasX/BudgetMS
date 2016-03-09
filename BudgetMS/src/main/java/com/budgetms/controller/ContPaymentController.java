package com.budgetms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.ContPayment;
import com.budgetms.service.IContPaymentService;
import com.budgetms.util.MysqlErrTranslator;

@Controller
@RequestMapping("/cont")
public class ContPaymentController extends BaseController {
	static Logger logger = Logger.getLogger(ContPaymentController.class);
	@Resource
	private IContPaymentService contPaymentService;

	@RequestMapping("/findContPaymentByPage.do")
	@ResponseBody
	public Object findContPaymentByPage(HttpServletRequest request) {
		String json = request.getParameter("obj");
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		ContPayment c = JSON.toJavaObject(JSON.parseObject(json), ContPayment.class);
		return contPaymentService.getContPaymentByPage(c, start, limit);
	}

	@RequestMapping("/findContPaymentByContId.do")
	@ResponseBody
	public Object findContPaymentByContId(HttpServletRequest request) {
		String id = request.getParameter("obj");
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));

		return contPaymentService.getContPaymentByContId(id);
	}

	@RequestMapping("/updateContPayment.do")
	@ResponseBody
	public Object updateCont(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		ContPayment contPayment = JSON.toJavaObject(JSON.parseObject(json),
				ContPayment.class);
		try {
			contPaymentService.updateContPayment(contPayment);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertContPayment.do")
	@ResponseBody
	public Object insertCont(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		ContPayment contPayment = JSON.toJavaObject(JSON.parseObject(json),
				ContPayment.class);
		try {
			contPaymentService.insertContPayment(contPayment);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteContPayment.do")
	@ResponseBody
	public Object deleteCont(HttpServletRequest request) {
		String contPaymentId = request.getParameter("obj");
		logger.info("id:" + contPaymentId);
		try {
			contPaymentService.deleteContpayment(contPaymentId);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}
}
