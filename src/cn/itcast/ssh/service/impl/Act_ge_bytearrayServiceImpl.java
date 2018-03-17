package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.IAct_ge_bytearrayDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ge_bytearray;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.IAct_ge_bytearrayService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_ge_bytearrayServiceImpl implements IAct_ge_bytearrayService {

	private IAct_ge_bytearrayDao act_ge_bytearrayDao;
	

	public IAct_ge_bytearrayDao getAct_ge_bytearrayDao() {
		return act_ge_bytearrayDao;
	}


	public void setAct_ge_bytearrayDao(IAct_ge_bytearrayDao act_ge_bytearrayDao) {
		this.act_ge_bytearrayDao = act_ge_bytearrayDao;
	}


	@Override
	public List<Act_ge_bytearray> findAct_ge_bytearray() {
		
		return act_ge_bytearrayDao.findAct_ge_bytearray();
	}

	
	
	
}
