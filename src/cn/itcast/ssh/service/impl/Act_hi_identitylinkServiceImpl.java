package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_hi_identitylinkDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_identitylink;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_hi_identitylinkService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_hi_identitylinkServiceImpl implements Act_hi_identitylinkService {

	private Act_hi_identitylinkDao act_hi_identitylinkDao;
	

	public Act_hi_identitylinkDao getAct_hi_identitylinkDao() {
		return act_hi_identitylinkDao;
	}


	public void setAct_hi_identitylinkDao(Act_hi_identitylinkDao Act_hi_identitylinkDao) {
		this.act_hi_identitylinkDao = Act_hi_identitylinkDao;
	}


	@Override
	public List<Act_hi_identitylink> findAct_hi_identitylink() {
		
		return act_hi_identitylinkDao.findAct_hi_identitylink();
	}

	
	
	
}
