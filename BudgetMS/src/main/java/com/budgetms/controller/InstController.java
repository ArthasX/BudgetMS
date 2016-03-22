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
import com.budgetms.pojo.InstructionAdjust;
import com.budgetms.pojo.InstructionDivide;
import com.budgetms.service.IInstService;
import com.budgetms.util.Msg;
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
		String id = getId(request);
		logger.info("id:" + id);
		try {
			instService.deleteInst(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}

	// inst divide

	@RequestMapping("/findInstDivideByPage.do")
	@ResponseBody
	public Object findInstDivideByPage(HttpServletRequest request) {
		String json = request.getParameter("obj");
		InstructionDivide i = JSON.toJavaObject(JSON.parseObject(json),
				InstructionDivide.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return instService.getInstDivideByPage(i, start, limit);
	}

	@RequestMapping("/updateInstDivide.do")
	@ResponseBody
	public Object updateInstDivide(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		InstructionDivide i = JSON.toJavaObject(JSON.parseObject(json),
				InstructionDivide.class);
		int result;
		try {
			result = instService.updateInstDivide(i);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		if (result != -1)
			return SUCCESS;
		else
			return Msg.NO_PROINFO_ID;
	}

	@RequestMapping("/insertInstDivide.do")
	@ResponseBody
	public Object insertInstDivide(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		InstructionDivide i = JSON.toJavaObject(JSON.parseObject(json),
				InstructionDivide.class);
		// inst.setOptUser(1);
		int result;
		try {
			result = instService.insertInstDivide(i);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		if (result != -1)
			return SUCCESS;
		else
			return Msg.NO_PROINFO_ID;
	}

	@RequestMapping("/deleteInstDivide.do")
	@ResponseBody
	public Object deleteInstDivide(HttpServletRequest request) {
		String id = getId(request);
		logger.info("id:" + id);
		try {
			instService.deleteInstDivide(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}

	// inst adj

	@RequestMapping("/findInstAdjByPage.do")
	@ResponseBody
	public Object findInstAdjByPage(HttpServletRequest request) {
		String json = request.getParameter("obj");
		InstructionAdjust i = JSON.toJavaObject(JSON.parseObject(json),
				InstructionAdjust.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return instService.getInstAdjByPage(i, start, limit);
	}

	@RequestMapping("/updateInstAdj.do")
	@ResponseBody
	public Object updateInstAdj(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		InstructionAdjust i = JSON.toJavaObject(JSON.parseObject(json),
				InstructionAdjust.class);
		try {
			instService.updateInstAdj(i);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertInstAdj.do")
	@ResponseBody
	public Object insertInstAdj(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		InstructionAdjust i = JSON.toJavaObject(JSON.parseObject(json),
				InstructionAdjust.class);
		// inst.setOptUser(1);
		try {
			instService.insertInstAdj(i);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteInstAdj.do")
	@ResponseBody
	public Object deleteInstAdj(HttpServletRequest request) {
		String id = getId(request);
		logger.info("id:" + id);
		try {
			instService.deleteInstAdj(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}
}
