package com.budgetms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.budgetms.dao.IAttachDao;
import com.budgetms.pojo.Attachment;
import com.budgetms.service.IAttachService;

 
public class AttachServiceImpl implements IAttachService {
	@Resource 
	private IAttachDao attachDao=null;
	
	@Override
	public List<Attachment> getAttachByIdType(String recordId, String type) {
		return attachDao.getAttachByIdType(recordId, type);
	}

	@Override
	public List<Attachment> getAttachByProperty(Attachment attach) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertAttach(Attachment attach) {
		
		return attachDao.insertAttach(attach);
	}

	@Override
	public int deletAttach(String attachId) {
		return attachDao.deletAttach(attachId);
	}

	@Override
	public int insertAttach(String recordId, String attachName,
			String attachType) {
		Attachment attach=new Attachment();
		attach.setRecordId(recordId);
		attach.setAttachType(attachType);
		attach.setAttachName(attachName);
		//attach.setUrl("");
		return attachDao.insertAttach(attach);
	}

}
