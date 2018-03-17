package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_id_userDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_id_user;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_id_userService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_id_userServiceImpl implements Act_id_userService {

	private Act_id_userDao act_id_userDao;
	

	public Act_id_userDao getAct_id_userDao() {
		return act_id_userDao;
	}


	public void setAct_id_userDao(Act_id_userDao Act_id_userDao) {
		this.act_id_userDao = Act_id_userDao;
	}


	@Override
	public List<Act_id_user> findAct_id_user() {
		
		return act_id_userDao.findAct_id_user();
	}

	
	
	
}
