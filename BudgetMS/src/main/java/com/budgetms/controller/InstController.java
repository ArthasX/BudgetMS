package com.budgetms.controller;

/**
 * 返回JSON对象，没有使用Spring的拦截器 Spring MVC 3.0
 * 返回JSON数据的方法，可以使用Spring内置的支持，代码如下： Spring MVC 配置 <bean class=
 * "org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter"
 * > <property name="messageConverters"> <list> <bean class=
 * "org.springframework.http.converter.json.MappingJacksonHttpMessageConverter"
 * /> </list> </property> </bean>
 * jackson-mapper-asl-1.6.4.jar jackson-core-asl-1.6.4.jar
 * 
 * Controller中使用：@ResponseBody 标注方法，该方法返回
 * Java对象（支持复杂对象），MappingJacksonHttpMessageConverter 会将对象转换为 JSON 输出
 * 
 * @return JSON object
 * 
 */
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.Decoder;
import org.apache.commons.codec.DecoderException;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Instruction;
import com.budgetms.service.IInstService;
import com.budgetms.util.MysqlErrTranslator;

@Controller
@RequestMapping("/inst")
public class InstController extends BaseController {
	static Logger logger = Logger.getLogger(InstController.class);
	@Resource
	private IInstService instService;

	@RequestMapping("/findInstByProperty.do")
	@ResponseBody
	public Object findInstByProperty(HttpServletRequest request) {
		String json = request.getParameter("obj");
		Instruction inst = JSON.toJavaObject(JSON.parseObject(json),
				Instruction.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return instService.getInstByPage(inst, start, limit);
	}

 
	@RequestMapping("/updateInst.do")
	@ResponseBody
	public Object updateInst(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		Instruction inst = JSON.toJavaObject(JSON.parseObject(json),
				Instruction.class);
		try {
			instService.updateInst(inst);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertInst.do")
	@ResponseBody
	public Object insertInst(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		Instruction inst = JSON.toJavaObject(JSON.parseObject(json),
				Instruction.class);
		// inst.setOptUser(1);
		try {
			instService.insertInst(inst);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteInst.do")
	@ResponseBody
	public Object deleteInst(HttpServletRequest request) {
		String instId = request.getParameter("obj");
		JSON json = JSON.parseObject(instId);
		// json.
		logger.info("id:" + instId);
		try {
			instService.deleteInst(instId);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}
}
