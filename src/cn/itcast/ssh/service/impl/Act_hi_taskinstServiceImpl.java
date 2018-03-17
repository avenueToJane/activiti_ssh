package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_hi_taskinstDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_taskinst;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_hi_taskinstService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_hi_taskinstServiceImpl implements Act_hi_taskinstService {

	private Act_hi_taskinstDao act_hi_taskinstDao;
	

	public Act_hi_taskinstDao getAct_hi_taskinstDao() {
		return act_hi_taskinstDao;
	}


	public void setAct_hi_taskinstDao(Act_hi_taskinstDao Act_hi_taskinstDao) {
		this.act_hi_taskinstDao = Act_hi_taskinstDao;
	}


	@Override
	public List<Act_hi_taskinst> findAct_hi_taskinst() {
		
		return act_hi_taskinstDao.findAct_hi_taskinst();
	}

	
	
	
}
