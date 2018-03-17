package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_hi_commentDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_comment;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_hi_commentService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_hi_commentServiceImpl implements Act_hi_commentService {

	private Act_hi_commentDao act_hi_commentDao;
	

	public Act_hi_commentDao getAct_hi_commentDao() {
		return act_hi_commentDao;
	}


	public void setAct_hi_commentDao(Act_hi_commentDao Act_hi_commentDao) {
		this.act_hi_commentDao = Act_hi_commentDao;
	}


	@Override
	public List<Act_hi_comment> findAct_hi_comment() {
		
		return act_hi_commentDao.findAct_hi_comment();
	}

	
	
	
}
