package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_re_modelDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_re_model;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_re_modelService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_re_modelServiceImpl implements Act_re_modelService {

	private Act_re_modelDao act_re_modelDao;
	

	public Act_re_modelDao getAct_re_modelDao() {
		return act_re_modelDao;
	}


	public void setAct_re_modelDao(Act_re_modelDao Act_re_modelDao) {
		this.act_re_modelDao = Act_re_modelDao;
	}


	@Override
	public List<Act_re_model> findAct_re_model() {
		
		return act_re_modelDao.findAct_re_model();
	}

	
	
	
}
