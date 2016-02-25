package com.budgetms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	@Resource
	private IInstService instService;

	@RequestMapping("/getInstByProperty.do")
	@ResponseBody
	public String getInstByProperty(HttpServletRequest request) {
		String para = request.getParameter("inst");
		Instruction inst = JSON.toJavaObject(JSON.parseObject(para),
				Instruction.class);
		List<Instruction> l = instService.getInstByProperty(inst);
		String insts = JSON.toJSONString(l);
		return insts;

	}

	/**
	 * 返回JSON对象， 此处没有使用Spring的拦截器
	 * 
	 * @return JSON object
	 */
	// Spring MVC 3.0 返回JSON数据的方法，可以使用Spring内置的支持，代码如下：
	// Spring MVC 配置
	// <bean
	// class="org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter">
	// <property name="messageConverters">
	// <list>
	// <bean
	// class="org.springframework.http.converter.json.MappingJacksonHttpMessageConverter"
	// />
	// </list>
	// </property>
	// </bean>
	//
	//
	// jackson-mapper-asl-1.6.4.jar
	// jackson-core-asl-1.6.4.jar
	//
	// Controller中使用：@ResponseBody 标注方法，该方法返回
	// Java对象（支持复杂对象），MappingJacksonHttpMessageConverter 会将对象转换为 JSON 输出
	@RequestMapping("/getAllInst.do")
	@ResponseBody
	public Object getAllInst(HttpServletRequest request) {
		String start = request.getParameter("start");
		String limit = request.getParameter("limit");
		// Map
		List<Instruction> l = instService.getAllInst();
		String s = JSON.toJSONString(l);
		return JSON.toJSON(l);
	}

	@RequestMapping("/updateInst.do")
	@ResponseBody
	public Object updateInst(HttpServletRequest request) {
		JSON json=(JSON) JSON.toJSON(request.getParameter("obj"));
		Instruction inst = (Instruction)JSON.toJavaObject(json,Instruction.class);
		try{
			instService.updateInst(inst);
		}catch(Exception e){
			return MysqlErrTranslator.getJsonErrorInfo(e);
		}
		return SUCCESS;
	}

	@RequestMapping("/insertInst.do")
	@ResponseBody
	public Object insertInst(HttpServletRequest request) {
		JSON json=(JSON) JSON.toJSON(request.getParameter("obj"));
		Instruction inst = (Instruction)JSON.toJavaObject(json,Instruction.class);
		try{
			instService.insertInst(inst);
		}catch(Exception e){
			return MysqlErrTranslator.getJsonErrorInfo(e);
		}
		return SUCCESS;
	}

	@RequestMapping("/deleteInst.do")
	@ResponseBody
	public Object deleteInst(HttpServletRequest request) {
		String instId = request.getParameter("id");
		//instId = null;
		try {
			instService.deleteInst(instId);
		} catch (DataAccessException e) {
			return MysqlErrTranslator.getJsonErrorInfo(e);
		}
		return SUCCESS;
	}
}
