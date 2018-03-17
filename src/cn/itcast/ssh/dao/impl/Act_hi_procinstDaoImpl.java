package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_hi_procinstDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_procinst;
import cn.itcast.ssh.domain.Employee;

public class Act_hi_procinstDaoImpl extends HibernateDaoSupport implements Act_hi_procinstDao {

	@Override
	public List<Act_hi_procinst> findAct_hi_procinst() {
		String sql="from  Act_hi_procinst";
		List<Act_hi_procinst> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
