package com.budgetms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Instruction;
import com.budgetms.service.IInstService;

@Controller
@RequestMapping("/inst")
public class InstController {
	@Resource
	private IInstService instService;
	
	@RequestMapping("/getInstByProperty")
	@ResponseBody
	public String getInstByProperty(HttpServletRequest request){
		String para= request.getParameter("inst");
		Instruction inst = JSON.toJavaObject(JSON.parseObject(para), Instruction.class);
		List<Instruction> l = instService.getInstByProperty(inst);
		String insts=JSON.toJSONString(l);
		return insts;
		
	}
	
	@RequestMapping("/updateInst")
	@ResponseBody
	public int updateInst(HttpServletRequest request){
		return 0;
	}
	
	@RequestMapping("/insertInst")
	@ResponseBody
	public int insertInst(HttpServletRequest request){
		return 0;
	}
	
}
