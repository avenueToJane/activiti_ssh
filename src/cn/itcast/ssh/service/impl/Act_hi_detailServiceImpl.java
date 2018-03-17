package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_hi_detailDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_detail;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_hi_detailService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_hi_detailServiceImpl implements Act_hi_detailService {

	private Act_hi_detailDao act_hi_detailDao;
	

	public Act_hi_detailDao getAct_hi_detailDao() {
		return act_hi_detailDao;
	}


	public void setAct_hi_detailDao(Act_hi_detailDao Act_hi_detailDao) {
		this.act_hi_detailDao = Act_hi_detailDao;
	}


	@Override
	public List<Act_hi_detail> findAct_hi_detail() {
		
		return act_hi_detailDao.findAct_hi_detail();
	}

	
	
	
}
