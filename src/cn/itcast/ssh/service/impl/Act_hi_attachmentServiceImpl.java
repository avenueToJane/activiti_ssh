package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_hi_attachmentDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_attachment;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_hi_attachmentService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_hi_attachmentServiceImpl implements Act_hi_attachmentService {

	private Act_hi_attachmentDao act_hi_attachmentDao;
	

	public Act_hi_attachmentDao getAct_hi_attachmentDao() {
		return act_hi_attachmentDao;
	}


	public void setAct_hi_attachmentDao(Act_hi_attachmentDao Act_hi_attachmentDao) {
		this.act_hi_attachmentDao = Act_hi_attachmentDao;
	}


	@Override
	public List<Act_hi_attachment> findAct_hi_attachment() {
		
		return act_hi_attachmentDao.findAct_hi_attachment();
	}

	
	
	
}
