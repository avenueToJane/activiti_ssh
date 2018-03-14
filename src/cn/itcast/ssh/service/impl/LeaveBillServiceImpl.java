package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.ILeaveBillDao;
import cn.itcast.ssh.domain.LeaveBill;
import cn.itcast.ssh.service.ILeaveBillService;
import cn.itcast.ssh.utils.SessionContext;

public class LeaveBillServiceImpl implements ILeaveBillService {

	private ILeaveBillDao leaveBillDao;

	public void setLeaveBillDao(ILeaveBillDao leaveBillDao) {
		this.leaveBillDao = leaveBillDao;
	}
/**
 * 查询自己的请假单的信息
 */
	@Override
	public List<LeaveBill> findLeaveBillList() {
		List<LeaveBill> list=leaveBillDao.findLeaveBillList();
		return list;
	}
	/**
	 * 保存请假单
	 */
@Override
public void saveLeaveBill(LeaveBill leaveBill) {
	Long id=leaveBill.getId();
	if(id!=null) {//代表更新
		//执行update操作
		leaveBillDao.updateLeaveBill(leaveBill);
		
	}else {
		//1 从session中获取当前用户对象，将	LeaveBill中的user与session中的进行关联
		leaveBill.setUser(SessionContext.get());//建立关联关系
		//2 保存请假单
		leaveBillDao.saveLeaveBill(leaveBill);
	}
	
}
/**
 * 使用请假单id 查询请假单对象
 */
	@Override
	public LeaveBill findLeaveBillById(Long id) {
		
		return leaveBillDao.findLeaveBillById(id);
	}
	/**
	 * 通过请假单id删除请假单
	 */
@Override
public void deleteLeaveBillById(Long id) {
	leaveBillDao.deleteLeaveBillById(id);
	
}

}
