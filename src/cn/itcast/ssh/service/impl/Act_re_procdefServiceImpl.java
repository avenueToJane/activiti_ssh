package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_re_procdefDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_re_procdef;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_re_procdefService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_re_procdefServiceImpl implements Act_re_procdefService {

	private Act_re_procdefDao act_re_procdefDao;
	

	public Act_re_procdefDao getAct_re_procdefDao() {
		return act_re_procdefDao;
	}


	public void setAct_re_procdefDao(Act_re_procdefDao Act_re_procdefDao) {
		this.act_re_procdefDao = Act_re_procdefDao;
	}


	@Override
	public List<Act_re_procdef> findAct_re_procdef() {
		
		return act_re_procdefDao.findAct_re_procdef();
	}

	
	
	
}
