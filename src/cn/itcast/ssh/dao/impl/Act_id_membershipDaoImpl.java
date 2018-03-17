package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_id_membershipDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_id_membership;
import cn.itcast.ssh.domain.Employee;

public class Act_id_membershipDaoImpl extends HibernateDaoSupport implements Act_id_membershipDao {

	@Override
	public List<Act_id_membership> findAct_id_membership() {
		String sql="from  Act_id_membership";
		List<Act_id_membership> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
