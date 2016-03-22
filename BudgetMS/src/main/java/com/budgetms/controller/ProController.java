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
import com.budgetms.pojo.ProInfo;
import com.budgetms.pojo.ProInfoAdjust;
import com.budgetms.pojo.Project;
import com.budgetms.service.IProService;
import com.budgetms.util.MysqlErrTranslator;

@Controller
@RequestMapping("/pro")
public class ProController extends BaseController {
	static Logger logger = Logger.getLogger(ProController.class);
	@Resource
	private IProService proService;

	@RequestMapping("/findProByPage.do")
	@ResponseBody
	public Object findProByPage(HttpServletRequest request) {
		String json = request.getParameter("obj");
		Project pro = JSON.toJavaObject(JSON.parseObject(json), Project.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return proService.getProjectByPage(pro, start, limit);
	}

	@RequestMapping("/updatePro.do")
	@ResponseBody
	public Object updatePro(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		Project pro = JSON.toJavaObject(JSON.parseObject(json), Project.class);
		try {
			proService.updateProject(pro);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertPro.do")
	@ResponseBody
	public Object insertPro(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		Project pro = JSON.toJavaObject(JSON.parseObject(json), Project.class);
		// pro.setOptUser(1);
		try {
			proService.insertProject(pro);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deletePro.do")
	@ResponseBody
	public Object deletePro(HttpServletRequest request) {
		String id = getId(request);
		logger.info("id:" + id);
		try {
			proService.deleteProject(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}

	/***
	 * pro info
	 * 
	 */

	@RequestMapping("/findProInfoByPage.do")
	@ResponseBody
	public Object findProInfoByPage(HttpServletRequest request) {
		String json = request.getParameter("obj");
		ProInfo proInfo = JSON.toJavaObject(JSON.parseObject(json),
				ProInfo.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return proService.getProInfoByPage(proInfo, start, limit);
	}

	@RequestMapping("/updateProInfo.do")
	@ResponseBody
	public Object updateProInfo(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		ProInfo proInfo = JSON.toJavaObject(JSON.parseObject(json),
				ProInfo.class);
		try {
			proService.updateProInfo(proInfo);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertProInfo.do")
	@ResponseBody
	public Object insertProInfo(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		ProInfo proInfo = JSON.toJavaObject(JSON.parseObject(json),
				ProInfo.class);
		// proInfo.setOptUser(1);
		try {
			proService.insertProInfo(proInfo);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteProInfo.do")
	@ResponseBody
	public Object deleteProInfo(HttpServletRequest request) {
		String id = getId(request);
		logger.info("id:" + id);
		try {
			proService.deleteProject(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}

	/***
	 *
	 * pro info adj
	 */

	@RequestMapping("/findProInfoAdjByPage.do")
	@ResponseBody
	public Object findProInfoAdjByPage(HttpServletRequest request) {
		String json = request.getParameter("obj");
		ProInfoAdjust proInfoAdj = JSON.toJavaObject(JSON.parseObject(json),
				ProInfoAdjust.class);
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return proService.getProInfoAdjByPage(proInfoAdj, start, limit);
	}

	@RequestMapping("/updateProInfoAdj.do")
	@ResponseBody
	public Object updateProInfoAdj(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		ProInfoAdjust pro = JSON.toJavaObject(JSON.parseObject(json),
				ProInfoAdjust.class);
		try {
			proService.updateProInfoAdj(pro);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertProInfoAdj.do")
	@ResponseBody
	public Object insertProInfoAdj(HttpServletRequest request) {
		String json = request.getParameter("obj");
		logger.info("json:" + json);
		ProInfoAdjust pro = JSON.toJavaObject(JSON.parseObject(json),
				ProInfoAdjust.class);
		// pro.setOptUser(1);
		try {
			proService.insertProInfoAdj(pro);
		} catch (Exception e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteProInfoAdj.do")
	@ResponseBody
	public Object deleteProInfoAdj(HttpServletRequest request) {
		String id = getId(request);
		logger.info("id:" + id);
		try {
			proService.deleteProInfoAdj(id);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorMsg(e, logger);
		}
		logger.info(SUCCESS);
		return SUCCESS;
	}
}
