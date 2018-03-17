package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_ru_identitylinkDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_identitylink;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_ru_identitylinkService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_ru_identitylinkServiceImpl implements Act_ru_identitylinkService {

	private Act_ru_identitylinkDao act_ru_identitylinkDao;
	

	public Act_ru_identitylinkDao getAct_ru_identitylinkDao() {
		return act_ru_identitylinkDao;
	}


	public void setAct_ru_identitylinkDao(Act_ru_identitylinkDao Act_ru_identitylinkDao) {
		this.act_ru_identitylinkDao = Act_ru_identitylinkDao;
	}


	@Override
	public List<Act_ru_identitylink> findAct_ru_identitylink() {
		
		return act_ru_identitylinkDao.findAct_ru_identitylink();
	}

	
	
	
}
