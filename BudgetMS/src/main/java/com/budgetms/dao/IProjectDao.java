package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.Project;

public interface IProjectDao {
	List<Project> getProjectByProperty(Project p);

	int insertProject(Project p);

	int updateProject(Project p);

	int deleteProject(String proId);

	List<Project> getProjectByPage(Project p, int start, int limit);

	int getProjectCount(Project p);
}
