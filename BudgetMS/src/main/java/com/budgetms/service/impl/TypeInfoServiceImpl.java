package com.budgetms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.ITypeInfoDao;
import com.budgetms.pojo.TypeInfo;
import com.budgetms.service.ITypeInfoService;
@Service("typeInfoService")
public class TypeInfoServiceImpl implements ITypeInfoService {

	@Resource
	private ITypeInfoDao typeInfoDao=null;
	
	@Override
	public Object getAllTypeInfo() {
		List<TypeInfo> l = typeInfoDao.getAllTypeInfo();
		return JSON.toJSON(l);
	}

}
