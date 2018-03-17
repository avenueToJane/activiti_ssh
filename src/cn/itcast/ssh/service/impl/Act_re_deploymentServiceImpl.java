package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_re_deploymentDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_re_deployment;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_re_deploymentService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_re_deploymentServiceImpl implements Act_re_deploymentService {

	private Act_re_deploymentDao act_re_deploymentDao;
	

	public Act_re_deploymentDao getAct_re_deploymentDao() {
		return act_re_deploymentDao;
	}


	public void setAct_re_deploymentDao(Act_re_deploymentDao Act_re_deploymentDao) {
		this.act_re_deploymentDao = Act_re_deploymentDao;
	}


	@Override
	public List<Act_re_deployment> findAct_re_deployment() {
		
		return act_re_deploymentDao.findAct_re_deployment();
	}

	
	
	
}
