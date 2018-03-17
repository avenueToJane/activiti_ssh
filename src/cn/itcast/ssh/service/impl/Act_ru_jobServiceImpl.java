package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_ru_jobDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_job;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_ru_jobService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_ru_jobServiceImpl implements Act_ru_jobService {

	private Act_ru_jobDao act_ru_jobDao;
	

	public Act_ru_jobDao getAct_ru_jobDao() {
		return act_ru_jobDao;
	}


	public void setAct_ru_jobDao(Act_ru_jobDao Act_ru_jobDao) {
		this.act_ru_jobDao = Act_ru_jobDao;
	}


	@Override
	public List<Act_ru_job> findAct_ru_job() {
		
		return act_ru_jobDao.findAct_ru_job();
	}

	
	
	
}
