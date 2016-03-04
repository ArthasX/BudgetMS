package com.budgetms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.budgetms.service.ITypeInfoService;

@Controller
@RequestMapping("/typeInfo")
public class TypeInfoController extends BaseController {
	@Resource
	private ITypeInfoService typeInfoService;

	@RequestMapping("/getAllTypeInfo.do")
	@ResponseBody
	public Object getAllTypeInfo() {
		return typeInfoService.getAllTypeInfo();
	}
}
