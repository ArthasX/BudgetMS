package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.Attachment;

public interface IAttachDao {
	List<Attachment> getAttachByIdType(String recordId, String type);

	List<Attachment> getAttachByProperty(Attachment attach);

	int insertAttach(Attachment attach);

	int deletAttach(String attachId);
}
