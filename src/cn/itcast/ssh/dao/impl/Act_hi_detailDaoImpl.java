package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_hi_detailDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_detail;
import cn.itcast.ssh.domain.Employee;

public class Act_hi_detailDaoImpl extends HibernateDaoSupport implements Act_hi_detailDao {

	@Override
	public List<Act_hi_detail> findAct_hi_detail() {
		String sql="from  Act_hi_detail";
		List<Act_hi_detail> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
