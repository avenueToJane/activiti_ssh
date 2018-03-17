package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_ru_identitylinkDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_identitylink;
import cn.itcast.ssh.domain.Employee;

public class Act_ru_identitylinkDaoImpl extends HibernateDaoSupport implements Act_ru_identitylinkDao {

	@Override
	public List<Act_ru_identitylink> findAct_ru_identitylink() {
		String sql="from  Act_ru_identitylink";
		List<Act_ru_identitylink> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
