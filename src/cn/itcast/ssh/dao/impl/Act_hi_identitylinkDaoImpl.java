package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_hi_identitylinkDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_identitylink;
import cn.itcast.ssh.domain.Employee;

public class Act_hi_identitylinkDaoImpl extends HibernateDaoSupport implements Act_hi_identitylinkDao {

	@Override
	public List<Act_hi_identitylink> findAct_hi_identitylink() {
		String sql="from  Act_hi_identitylink";
		List<Act_hi_identitylink> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
