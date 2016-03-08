package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.ProInfo;

public interface IProInfoDao {
	List<ProInfo> getProInfoByProId(String proId);

	List<ProInfo> getProInfoByProperty(ProInfo p);

	int insertProInfo(ProInfo p);

	int updateProInfo(ProInfo p);

	int deleteProInfo(String proInfoId);

	List<ProInfo> getProInfoByPage(ProInfo p, int start, int limit);
	
	int getProInfoCount(ProInfo pi);
}
