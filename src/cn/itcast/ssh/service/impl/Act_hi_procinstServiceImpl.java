package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_hi_procinstDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_procinst;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_hi_procinstService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_hi_procinstServiceImpl implements Act_hi_procinstService {

	private Act_hi_procinstDao act_hi_procinstDao;
	

	public Act_hi_procinstDao getAct_hi_procinstDao() {
		return act_hi_procinstDao;
	}


	public void setAct_hi_procinstDao(Act_hi_procinstDao Act_hi_procinstDao) {
		this.act_hi_procinstDao = Act_hi_procinstDao;
	}


	@Override
	public List<Act_hi_procinst> findAct_hi_procinst() {
		
		return act_hi_procinstDao.findAct_hi_procinst();
	}

	
	
	
}
