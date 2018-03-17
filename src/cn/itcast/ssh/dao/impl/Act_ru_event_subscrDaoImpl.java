package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_ru_event_subscrDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ru_event_subscr;
import cn.itcast.ssh.domain.Employee;

public class Act_ru_event_subscrDaoImpl extends HibernateDaoSupport implements Act_ru_event_subscrDao {

	@Override
	public List<Act_ru_event_subscr> findAct_ru_event_subscr() {
		String sql="from  Act_ru_event_subscr";
		List<Act_ru_event_subscr> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
