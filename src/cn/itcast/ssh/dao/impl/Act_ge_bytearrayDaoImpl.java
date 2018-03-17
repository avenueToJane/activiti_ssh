package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.IAct_ge_bytearrayDao;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Act_ge_bytearray;
import cn.itcast.ssh.domain.Employee;

public class Act_ge_bytearrayDaoImpl extends HibernateDaoSupport implements IAct_ge_bytearrayDao {

	@Override
	public List<Act_ge_bytearray> findAct_ge_bytearray() {
		String sql="from  Act_ge_bytearray";
		List<Act_ge_bytearray> list =this.getHibernateTemplate().find(sql);
		return list;
	}
	
	
}
