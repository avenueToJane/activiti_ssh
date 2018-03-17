package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_ru_variableDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_variable;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_ru_variableService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_ru_variableServiceImpl implements Act_ru_variableService {

	private Act_ru_variableDao act_ru_variableDao;
	

	public Act_ru_variableDao getAct_ru_variableDao() {
		return act_ru_variableDao;
	}


	public void setAct_ru_variableDao(Act_ru_variableDao Act_ru_variableDao) {
		this.act_ru_variableDao = Act_ru_variableDao;
	}


	@Override
	public List<Act_ru_variable> findAct_ru_variable() {
		
		return act_ru_variableDao.findAct_ru_variable();
	}

	
	
	
}
