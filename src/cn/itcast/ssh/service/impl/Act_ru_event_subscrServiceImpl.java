package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.Act_ru_event_subscrDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_event_subscr;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.Act_ru_event_subscrService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_ru_event_subscrServiceImpl implements Act_ru_event_subscrService {

	private Act_ru_event_subscrDao act_ru_event_subscrDao;
	

	public Act_ru_event_subscrDao getAct_ru_event_subscrDao() {
		return act_ru_event_subscrDao;
	}


	public void setAct_ru_event_subscrDao(Act_ru_event_subscrDao Act_ru_event_subscrDao) {
		this.act_ru_event_subscrDao = Act_ru_event_subscrDao;
	}


	@Override
	public List<Act_ru_event_subscr> findAct_ru_event_subscr() {
		
		return act_ru_event_subscrDao.findAct_ru_event_subscr();
	}

	
	
	
}
