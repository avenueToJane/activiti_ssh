package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.IAct_ge_bytearrayDao;
import cn.itcast.ssh.dao.IAct_ge_propertyDao;
import cn.itcast.ssh.dao.IAct_hi_actinstDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ge_bytearray;
import cn.itcast.ssh.domain.Act_ge_property;
import cn.itcast.ssh.domain.Act_hi_actinst;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.IAct_ge_bytearrayService;
import cn.itcast.ssh.service.IAct_ge_propertyService;
import cn.itcast.ssh.service.IAct_hi_actinstService;
import cn.itcast.ssh.service.IEmployeeService;

public class Act_hi_actinstServiceImpl implements IAct_hi_actinstService {

	private IAct_hi_actinstDao act_hi_actinstDao;
	

	



	public IAct_hi_actinstDao getAct_hi_actinstDao() {
		return act_hi_actinstDao;
	}






	public void setAct_hi_actinstDao(IAct_hi_actinstDao act_hi_actinstDao) {
		this.act_hi_actinstDao = act_hi_actinstDao;
	}






	@Override
	public List<Act_hi_actinst> findAct_hi_actinst() {
		return act_hi_actinstDao.findAct_hi_actinst();
	}




	
	
	
	
}
