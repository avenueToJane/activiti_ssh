package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_re_modelDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_re_model;
import cn.itcast.ssh.domain.Employee;

public class Act_re_modelDaoImpl extends HibernateDaoSupport implements Act_re_modelDao {

	@Override
	public List<Act_re_model> findAct_re_model() {
		String sql="from  Act_re_model";
		List<Act_re_model> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
