package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_id_infoDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_id_info;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_id_infoService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_id_infoServiceImpl implements Act_id_infoService {

	private Act_id_infoDao act_id_infoDao;
	

	public Act_id_infoDao getAct_id_infoDao() {
		return act_id_infoDao;
	}


	public void setAct_id_infoDao(Act_id_infoDao Act_id_infoDao) {
		this.act_id_infoDao = Act_id_infoDao;
	}


	@Override
	public List<Act_id_info> findAct_id_info() {
		
		return act_id_infoDao.findAct_id_info();
	}

	
	
	
}
