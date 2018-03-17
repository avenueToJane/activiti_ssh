package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_id_groupDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_id_group;
import cn.itcast.ssh.domain.Employee;

public class Act_id_groupDaoImpl extends HibernateDaoSupport implements Act_id_groupDao {

	@Override
	public List<Act_id_group> findAct_id_group() {
		String sql="from  Act_id_group";
		List<Act_id_group> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
