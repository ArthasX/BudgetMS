package com.budgetms.service;

import java.util.List;

import com.budgetms.pojo.Attachment;

public interface IAttachService {
	List<Attachment> getAttachByIdType(String recordId, String type);

	Object getAttachByProperty(Attachment attach);

	int insertAttach(Attachment attach);

	int insertAttach(String recordId, String attachName, String attachType);

	int deleteAttach(String attachId);
}
