package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_ru_executionDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_execution;
import cn.itcast.ssh.domain.Employee;

public class Act_ru_executionDaoImpl extends HibernateDaoSupport implements Act_ru_executionDao {

	@Override
	public List<Act_ru_execution> findAct_ru_execution() {
		String sql="from  Act_ru_execution";
		List<Act_ru_execution> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
