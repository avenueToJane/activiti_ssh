package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_hi_varinstDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_varinst;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_hi_varinstService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_hi_varinstServiceImpl implements Act_hi_varinstService {

	private Act_hi_varinstDao act_hi_varinstDao;
	

	public Act_hi_varinstDao getAct_hi_varinstDao() {
		return act_hi_varinstDao;
	}


	public void setAct_hi_varinstDao(Act_hi_varinstDao Act_hi_varinstDao) {
		this.act_hi_varinstDao = Act_hi_varinstDao;
	}


	@Override
	public List<Act_hi_varinst> findAct_hi_varinst() {
		
		return act_hi_varinstDao.findAct_hi_varinst();
	}

	
	
	
}
