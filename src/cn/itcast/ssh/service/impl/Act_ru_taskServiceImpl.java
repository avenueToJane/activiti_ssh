package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_ru_taskDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_task;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_ru_taskService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_ru_taskServiceImpl implements Act_ru_taskService {

	private Act_ru_taskDao act_ru_taskDao;
	

	public Act_ru_taskDao getAct_ru_taskDao() {
		return act_ru_taskDao;
	}


	public void setAct_ru_taskDao(Act_ru_taskDao Act_ru_taskDao) {
		this.act_ru_taskDao = Act_ru_taskDao;
	}


	@Override
	public List<Act_ru_task> findAct_ru_task() {
		
		return act_ru_taskDao.findAct_ru_task();
	}

	
	
	
}
