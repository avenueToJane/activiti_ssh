package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.Act_hi_attachmentDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_hi_attachment;
import cn.itcast.ssh.domain.Employee;

public class Act_hi_attachmentDaoImpl extends HibernateDaoSupport implements Act_hi_attachmentDao {

	@Override
	public List<Act_hi_attachment> findAct_hi_attachment() {
		String sql="from  Act_hi_attachment";
		List<Act_hi_attachment> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
