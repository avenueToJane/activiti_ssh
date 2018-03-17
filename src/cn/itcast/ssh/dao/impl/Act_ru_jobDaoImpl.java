package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_ru_jobDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_job;
import cn.itcast.ssh.domain.Employee;

public class Act_ru_jobDaoImpl extends HibernateDaoSupport implements Act_ru_jobDao {

	@Override
	public List<Act_ru_job> findAct_ru_job() {
		String sql="from  Act_ru_job";
		List<Act_ru_job> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
