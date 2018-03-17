package cn.itcast.ssh.web.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.ssh.domain.Act_ge_bytearray;
import cn.itcast.ssh.domain.LeaveBill;
import cn.itcast.ssh.service.IAct_ge_bytearrayService;
import cn.itcast.ssh.service.ILeaveBillService;
import cn.itcast.ssh.utils.ValueContext;

@SuppressWarnings("serial")
public class TableAction extends ActionSupport implements ModelDriven<Act_ge_bytearray>{
	private Act_ge_bytearray act_ge_bytearray = new Act_ge_bytearray();
	@Override
	public Act_ge_bytearray getModel() {
		
		return act_ge_bytearray;
	}
	private IAct_ge_bytearrayService iAct_ge_bytearrayService;

	public void setLeaveBillService(IAct_ge_bytearrayService iAct_ge_bytearrayService) {
		this.iAct_ge_bytearrayService = iAct_ge_bytearrayService;
	}
	
	/**
	 * 
	 */
	public String IAct_ge_bytearray(){
		//1 查询自己所有请假信息（对应表a_leavebill）
		List<Act_ge_bytearray> list=iAct_ge_bytearrayService.findAct_ge_bytearray();
		//2 放到上下文中
		ValueContext.putValueContext("list", list);
		System.out.println("========================"+list);
		return "IAct_ge_bytearray";
	}
}
