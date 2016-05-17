package com.budgetms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.IAttachDao;
import com.budgetms.pojo.Attachment;
import com.budgetms.service.IAttachService;

@Service("attachService") 
public class AttachServiceImpl implements IAttachService {
	@Resource 
	private IAttachDao attachDao=null;
	
	@Override
	public List<Attachment> getAttachByIdType(String recordId, String type) {
		return attachDao.getAttachByIdType(recordId, type);
	}

	@Override
	public Object getAttachByProperty(Attachment attach) {
		return JSON.toJSON(attachDao.getAttachByProperty(attach));
	}

	@Override
	public int insertAttach(Attachment attach) {
		
		return attachDao.insertAttach(attach);
	}

	@Override
	public int deleteAttach(String attachId) {
		return attachDao.deleteAttach(attachId);
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
