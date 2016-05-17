package com.budgetms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.budgetms.pojo.Attachment;

public interface IAttachDao {
	List<Attachment> getAttachByIdType(@Param("recordId")  String recordId, @Param("attachType")  String type);

	List<Attachment> getAttachByProperty(Attachment attach);

	int insertAttach(Attachment attach);

	int deleteAttach(String attachId);
}
