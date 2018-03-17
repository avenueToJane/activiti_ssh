package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_re_deploymentDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_re_deployment;
import cn.itcast.ssh.domain.Employee;

public class Act_re_deploymentDaoImpl extends HibernateDaoSupport implements Act_re_deploymentDao {

	@Override
	public List<Act_re_deployment> findAct_re_deployment() {
		String sql="from  Act_re_deployment";
		List<Act_re_deployment> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
