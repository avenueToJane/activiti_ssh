package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.ILeaveBillDao;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.domain.LeaveBill;
import cn.itcast.ssh.utils.SessionContext;

public class LeaveBillDaoImpl extends HibernateDaoSupport implements ILeaveBillDao {
/**
 * 查询自己所有请假信息（对应表a_leavebill）
 */
	@Override
	public List<LeaveBill> findLeaveBillList() {
		//从session中获取当前用户
		Employee employee=SessionContext.get();
		String sql="from LeaveBill o where o.user=?";//指定当前用户的请假单
		List<LeaveBill> list=this.getHibernateTemplate().find(sql,employee);
		return list;
	}
/**
 * 保存请假单
 */
@Override
public void saveLeaveBill(LeaveBill leaveBill) {
  this.getHibernateTemplate().save(leaveBill);
	
}
/**
 * 使用请假单id获取请假单对象
 */
@Override
public LeaveBill findLeaveBillById(Long id) {
	
	return this.getHibernateTemplate().get(LeaveBill.class, id);
}
/**
 * 更新表单
 */
@Override
public void updateLeaveBill(LeaveBill leaveBill) {
	this.getHibernateTemplate().update(leaveBill);
	
}
/**
 * 删除请假单
 */
@Override
public void deleteLeaveBillById(Long id) {
	
	//使用请假单id获取请假单对象
	LeaveBill bill=this.findLeaveBillById(id);
	this.getHibernateTemplate().delete(bill);
	
}

	
}
