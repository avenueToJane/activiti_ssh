package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_id_infoDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_id_info;
import cn.itcast.ssh.domain.Employee;

public class Act_id_infoDaoImpl extends HibernateDaoSupport implements Act_id_infoDao {

	@Override
	public List<Act_id_info> findAct_id_info() {
		String sql="from  Act_id_info";
		List<Act_id_info> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
