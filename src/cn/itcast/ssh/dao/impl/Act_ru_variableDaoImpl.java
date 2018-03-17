package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_ru_variableDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_variable;
import cn.itcast.ssh.domain.Employee;

public class Act_ru_variableDaoImpl extends HibernateDaoSupport implements Act_ru_variableDao {

	@Override
	public List<Act_ru_variable> findAct_ru_variable() {
		String sql="from  Act_ru_variable";
		List<Act_ru_variable> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
