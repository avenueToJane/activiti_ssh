package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_ru_executionDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_execution;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_ru_executionService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_ru_executionServiceImpl implements Act_ru_executionService {

	private Act_ru_executionDao act_ru_executionDao;
	

	public Act_ru_executionDao getAct_ru_executionDao() {
		return act_ru_executionDao;
	}


	public void setAct_ru_executionDao(Act_ru_executionDao Act_ru_executionDao) {
		this.act_ru_executionDao = Act_ru_executionDao;
	}


	@Override
	public List<Act_ru_execution> findAct_ru_execution() {
		
		return act_ru_executionDao.findAct_ru_execution();
	}

	
	
	
}
