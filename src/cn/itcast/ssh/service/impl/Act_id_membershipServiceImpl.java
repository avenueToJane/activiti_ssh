package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_id_membershipDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_id_membership;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_id_membershipService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_id_membershipServiceImpl implements Act_id_membershipService {

	private Act_id_membershipDao act_id_membershipDao;
	

	public Act_id_membershipDao getAct_id_membershipDao() {
		return act_id_membershipDao;
	}


	public void setAct_id_membershipDao(Act_id_membershipDao Act_id_membershipDao) {
		this.act_id_membershipDao = Act_id_membershipDao;
	}


	@Override
	public List<Act_id_membership> findAct_id_membership() {
		
		return act_id_membershipDao.findAct_id_membership();
	}

	
	
	
}
