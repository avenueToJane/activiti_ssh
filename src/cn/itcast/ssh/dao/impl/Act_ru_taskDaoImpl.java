package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_ru_taskDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_task;
import cn.itcast.ssh.domain.Employee;

public class Act_ru_taskDaoImpl extends HibernateDaoSupport implements Act_ru_taskDao {

	@Override
	public List<Act_ru_task> findAct_ru_task() {
		String sql="from  Act_ru_task";
		List<Act_ru_task> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
