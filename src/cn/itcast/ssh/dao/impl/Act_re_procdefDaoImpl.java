package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_re_procdefDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_re_procdef;
import cn.itcast.ssh.domain.Employee;

public class Act_re_procdefDaoImpl extends HibernateDaoSupport implements Act_re_procdefDao {

	@Override
	public List<Act_re_procdef> findAct_re_procdef() {
		String sql="from  Act_re_procdef";
		List<Act_re_procdef> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
