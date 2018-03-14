package cn.itcast.ssh.utils;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import cn.itcast.ssh.domain.Employee;


/**
 * 登录验证拦截器
 *
 */
@SuppressWarnings("serial")
public class LoginInteceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	 /**
	  * 每次访问action类，先执行这个方法
	  */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//获取当前访问的URL。
		String name=invocation.getProxy().getActionName();
		//如果当前URl的值是loginAction_login,表示此时还没有session,需要放行
		if(!name.equals("loginAction_login")) {
			//从session中获取当前用户对象
			Employee employee=SessionContext.get();
			//如果不存在，跳转到登录页面
			if(employee==null) {
				return "login";
			}
		}	
		//放行 访问action类的方法
		return invocation.invoke();
		
	}

}
