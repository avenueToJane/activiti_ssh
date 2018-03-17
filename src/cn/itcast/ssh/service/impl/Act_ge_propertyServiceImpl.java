package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.IAct_ge_bytearrayDao;
import cn.itcast.ssh.dao.IAct_ge_propertyDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ge_bytearray;
import cn.itcast.ssh.domain.Act_ge_property;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.IAct_ge_bytearrayService;
import cn.itcast.ssh.service.IAct_ge_propertyService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_ge_propertyServiceImpl implements IAct_ge_propertyService {

	private IAct_ge_propertyDao act_ge_propertyDao;
	

	

	public IAct_ge_propertyDao getAct_ge_propertyDao() {
		return act_ge_propertyDao;
	}




	public void setAct_ge_propertyDao(IAct_ge_propertyDao act_ge_propertyDao) {
		this.act_ge_propertyDao = act_ge_propertyDao;
	}



	@Override
	public List<Act_ge_property> findAct_ge_property() {
		return act_ge_propertyDao.findAct_ge_property();
	}




	
	
	
	
}
