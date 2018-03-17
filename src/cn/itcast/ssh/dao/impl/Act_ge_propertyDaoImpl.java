package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.IAct_ge_propertyDao;
import cn.itcast.ssh.dao.IAct_ge_bytearrayDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ge_bytearray;
import cn.itcast.ssh.domain.Act_ge_property;
import cn.itcast.ssh.domain.Employee;

public class Act_ge_propertyDaoImpl extends HibernateDaoSupport implements IAct_ge_propertyDao {

	@Override
	public List<Act_ge_property> findAct_ge_property() {
		String sql="from  Act_ge_property";
		List<Act_ge_property> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
