package com.budgetms.service;
import com.budgetms.pojo.ProInfo;
import com.budgetms.pojo.ProInfoAdjust;
import com.budgetms.pojo.Project;
public interface IProService {
	//project
	Object  getProjectByProperty(Project p);
	int insertProject(Project p);
	int updateProject(Project p);
	int deleteProject(String id);
	Object  getProjectByPage(Project p,int start,int limit);
	//pro info
	
	Object getProInfoByProId(String id);
	int insertProInfo(ProInfo pi);
	int updateProInfo(ProInfo pi);
	int deleteProInfo(String id);
	Object getProInfoByPage(ProInfo pi,int start,int limit);
	//pro info adj
	Object getProInfoAdjByProInfoId(String id);
	int insertProInfoAdj(ProInfoAdjust pia);
	int updateProInfoAdj(ProInfoAdjust pia);
	int deleteProInfoAdj(String id);
	Object getProInfoAdjByPage(ProInfoAdjust pia,int start,int limit);
}
