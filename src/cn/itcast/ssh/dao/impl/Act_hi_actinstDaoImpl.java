package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.IAct_ge_propertyDao;
import cn.itcast.ssh.dao.IAct_hi_actinstDao;
import cn.itcast.ssh.dao.IAct_ge_bytearrayDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ge_bytearray;
import cn.itcast.ssh.domain.Act_ge_property;
import cn.itcast.ssh.domain.Act_hi_actinst;
import cn.itcast.ssh.domain.Employee;

public class Act_hi_actinstDaoImpl extends HibernateDaoSupport implements IAct_hi_actinstDao {

	@Override
	public List<Act_hi_actinst> findAct_hi_actinst() {
		String sql="from  Act_hi_actinst";
		List<Act_hi_actinst> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
