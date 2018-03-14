package cn.itcast.ssh.web.action;

import cn.itcast.ssh.service.ILeaveBillService;
import cn.itcast.ssh.service.IWorkflowService;
import cn.itcast.ssh.utils.SessionContext;
import cn.itcast.ssh.utils.ValueContext;
import cn.itcast.ssh.web.form.WorkflowBean;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.task.Task;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class WorkflowAction extends ActionSupport implements ModelDriven<WorkflowBean> {

	private WorkflowBean workflowBean = new WorkflowBean();
	
	@Override
	public WorkflowBean getModel() {
		return workflowBean;
	}
	
	private IWorkflowService workflowService;
	
	private ILeaveBillService leaveBillService;

	public void setLeaveBillService(ILeaveBillService leaveBillService) {
		this.leaveBillService = leaveBillService;
	}

	public void setWorkflowService(IWorkflowService workflowService) {
		this.workflowService = workflowService;
	}

	/**
	 * 部署管理首页显示
	 * @return
	 */
	public String deployHome(){
		
		//1 查询部署对象信息 对应表（act_re_deployment）
		List<Deployment> dList=workflowService.findDeploymentList();
		//2 查询流程定义信息 对应表（act_re_procdef）
		List<ProcessDefinition> pList=workflowService.findProcessDefinitionList();
		//放到上下文对象中
		System.out.println(dList+" ================"+pList);
		ValueContext.putValueContext("dList", dList);
		ValueContext.putValueContext("pList", pList);
		return "deployHome";
	}
	
	/**
	 * 发布流程
	 * @return
	 */
	public String newdeploy(){
		//1获取页面传递的值
		String fileName=workflowBean.getFilename();
		//2获取页面传递的zip文件
		File file=workflowBean.getFile();
		
		workflowService.saveNewDeploy(file,fileName);
		return "list";
	}
	
	/**
	 * 删除部署信息
	 */
	public String delDeployment(){
		//1 获取部署对象id
		String deploymentId=workflowBean.getDeploymentId();
		//2 使用部署对象id，删除流程定义
		workflowService.deleteProcessDefinitionByDeploymentId(deploymentId);
		
		return "list";//重定向
	}
	
	/**
	 * 查看流程图
	 * @throws Exception 
	 */
	public String viewImage() throws Exception{
		//1 获取页面中传递的部署id和资源图片名称
		String deploymentId=workflowBean.getDeploymentId();
		String imageName=workflowBean.getImageName();
		//2获取资源文件表(act_ge_bytearray)中的资源图片输入流InputStream
		InputStream inputStream=workflowService.findImageInputStream(deploymentId,imageName);
		//3 从response获取输出流
		OutputStream outputStream=ServletActionContext.getResponse().getOutputStream();
		//4 将输入流中的对象取出来，写到输出流中
		
		for(int b=-1;(b=inputStream.read())!=-1;) {
			outputStream.write(b);
		}
		outputStream.close();
		inputStream.close();
		//将图显示到页面上。用输入流写
		return null;
	}
	
	// 启动流程
	public String startProcess(){
		//更新请假状态，启动流程实例，让启动的流程实例关联业务
				workflowService.saveStartProcess(workflowBean);
				return "listTask";
	}
	
	
	
	/**
	 * 任务管理首页显示
	 * @return
	 */
	public String listTask(){
		//1：从Session中获取当前用户名
				String name = SessionContext.get().getName();
				//2：使用当前用户名查询正在执行的任务表，获取当前任务的集合List<Task>
				List<Task> list = workflowService.findTaskListByName(name); 
				ValueContext.putValueContext("list", list);
				return "task";
	}
	
	/**
	 * 打开任务表单
	 */
	public String viewTaskForm(){
		return "viewTaskForm";
	}
	
	// 准备表单数据
	public String audit(){
		return "taskForm";
	}
	
	/**
	 * 提交任务
	 */
	public String submitTask(){
		return "listTask";
	}
	
	/**
	 * 查看当前流程图（查看当前活动节点，并使用红色的框标注）
	 */
	public String viewCurrentImage(){
		return "image";
	}
	
	// 查看历史的批注信息
	public String viewHisComment(){
		return "viewHisComment";
	}
}
