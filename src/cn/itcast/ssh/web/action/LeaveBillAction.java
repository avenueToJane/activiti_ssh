package cn.itcast.ssh.web.action;

import cn.itcast.ssh.domain.LeaveBill;
import cn.itcast.ssh.service.ILeaveBillService;
import cn.itcast.ssh.utils.ValueContext;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class LeaveBillAction extends ActionSupport implements ModelDriven<LeaveBill> {

	private LeaveBill leaveBill = new LeaveBill();
	
	@Override
	public LeaveBill getModel() {
		return leaveBill;
	}
	
	private ILeaveBillService leaveBillService;

	public void setLeaveBillService(ILeaveBillService leaveBillService) {
		this.leaveBillService = leaveBillService;
	}

	/**
	 * 请假管理首页显示
	 * @return
	 */
	public String home(){
		//1 查询自己所有请假信息（对应表a_leavebill）
		List<LeaveBill> list=leaveBillService.findLeaveBillList();
		//2 放到上下文中
		ValueContext.putValueContext("list", list);
		return "home";
	}
	
	/**
	 * 添加请假申请
	 * @return
	 */
	public String input(){
		//获取传递请假单id
		Long id=leaveBill.getId();
		if(id!=null) {//不等于null，代表是修改
			//使用请假单id查询请假单信息
			LeaveBill bill=leaveBillService.findLeaveBillById(id);
			//将请假单信息放到栈顶，页面使用Struts2标签，支持表单回显
			ValueContext.putValueStack(bill);
			
		}
		return "input";
	}
	
	/**
	 * 保存/更新，请假申请
	 * 
	 * */
	public String save() {
		//执行保存
		leaveBillService.saveLeaveBill(leaveBill);
		return "save";
	}
	
	/**
	 * 删除，请假申请
	 * 
	 * */
	public String delete(){
		
		//获取请假单id
		Long id =leaveBill.getId();
		leaveBillService.deleteLeaveBillById(id);
		return "save";
	}
	
}
