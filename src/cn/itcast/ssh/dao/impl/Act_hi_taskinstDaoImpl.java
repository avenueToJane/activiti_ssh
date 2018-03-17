package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_hi_taskinstDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_taskinst;
import cn.itcast.ssh.domain.Employee;

public class Act_hi_taskinstDaoImpl extends HibernateDaoSupport implements Act_hi_taskinstDao {

	@Override
	public List<Act_hi_taskinst> findAct_hi_taskinst() {
		String sql="from  Act_hi_taskinst";
		List<Act_hi_taskinst> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
