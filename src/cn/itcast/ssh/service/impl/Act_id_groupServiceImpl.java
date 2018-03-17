package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_id_groupDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_id_group;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_id_groupService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_id_groupServiceImpl implements Act_id_groupService {

	private Act_id_groupDao act_id_groupDao;
	

	public Act_id_groupDao getAct_id_groupDao() {
		return act_id_groupDao;
	}


	public void setAct_id_groupDao(Act_id_groupDao Act_id_groupDao) {
		this.act_id_groupDao = Act_id_groupDao;
	}


	@Override
	public List<Act_id_group> findAct_id_group() {
		
		return act_id_groupDao.findAct_id_group();
	}

	
	
	
}
