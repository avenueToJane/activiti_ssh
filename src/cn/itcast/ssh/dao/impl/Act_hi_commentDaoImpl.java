package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_hi_commentDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_comment;
import cn.itcast.ssh.domain.Employee;

public class Act_hi_commentDaoImpl extends HibernateDaoSupport implements Act_hi_commentDao {

	@Override
	public List<Act_hi_comment> findAct_hi_comment() {
		String sql="from  Act_hi_comment";
		List<Act_hi_comment> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
