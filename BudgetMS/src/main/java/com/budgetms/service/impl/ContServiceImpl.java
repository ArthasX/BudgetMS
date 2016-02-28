package com.budgetms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.budgetms.dao.IContractDao;
import com.budgetms.pojo.Contract;
import com.budgetms.service.IContService;
@Service("contService")
public class ContServiceImpl implements IContService {

	@Resource
	private IContractDao contDao=null;
	@Override
	public List<Contract> getContByProperty(Contract cont) {
		return contDao.getContByProperty(cont);
	}

	@Override
	public int updateCont(Contract cont) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCont(String contId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertCont(Contract cont) {
		return contDao.insertCont(cont);
	}

	@Override
	public List<Contract> getAllCont() {
		// TODO Auto-generated method stub
		return null;
	}

}
