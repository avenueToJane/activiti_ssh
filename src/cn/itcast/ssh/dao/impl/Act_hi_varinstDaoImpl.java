package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_hi_varinstDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_varinst;
import cn.itcast.ssh.domain.Employee;

public class Act_hi_varinstDaoImpl extends HibernateDaoSupport implements Act_hi_varinstDao {

	@Override
	public List<Act_hi_varinst> findAct_hi_varinst() {
		String sql="from  Act_hi_varinst";
		List<Act_hi_varinst> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
