package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_id_userDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_id_user;
import cn.itcast.ssh.domain.Employee;

public class Act_id_userDaoImpl extends HibernateDaoSupport implements Act_id_userDao {

	@Override
	public List<Act_id_user> findAct_id_user() {
		String sql="from  Act_id_user";
		List<Act_id_user> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
