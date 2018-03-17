package cn.itcast.ssh.web.action;

import cn.itcast.ssh.dao.IAct_hi_actinstDao;
import cn.itcast.ssh.domain.Act_ge_bytearray;
import cn.itcast.ssh.domain.Act_ge_property;
import cn.itcast.ssh.domain.Act_hi_actinst;
import cn.itcast.ssh.domain.Act_hi_attachment;
import cn.itcast.ssh.domain.Act_hi_comment;
import cn.itcast.ssh.domain.Act_hi_detail;
import cn.itcast.ssh.domain.Act_hi_identitylink;
import cn.itcast.ssh.domain.Act_hi_procinst;
import cn.itcast.ssh.domain.Act_hi_taskinst;
import cn.itcast.ssh.domain.Act_hi_varinst;
import cn.itcast.ssh.domain.Act_id_group;
import cn.itcast.ssh.domain.Act_id_info;
import cn.itcast.ssh.domain.Act_id_membership;
import cn.itcast.ssh.domain.Act_id_user;
import cn.itcast.ssh.domain.Act_re_deployment;
import cn.itcast.ssh.domain.Act_re_model;
import cn.itcast.ssh.domain.Act_re_procdef;
import cn.itcast.ssh.domain.Act_ru_event_subscr;
import cn.itcast.ssh.domain.Act_ru_execution;
import cn.itcast.ssh.domain.Act_ru_identitylink;
import cn.itcast.ssh.domain.Act_ru_job;
import cn.itcast.ssh.domain.Act_ru_task;
import cn.itcast.ssh.domain.Act_ru_variable;
import cn.itcast.ssh.domain.LeaveBill;
import cn.itcast.ssh.service.Act_hi_attachmentService;
import cn.itcast.ssh.service.Act_hi_commentService;
import cn.itcast.ssh.service.Act_hi_detailService;
import cn.itcast.ssh.service.Act_hi_identitylinkService;
import cn.itcast.ssh.service.Act_hi_procinstService;
import cn.itcast.ssh.service.Act_hi_taskinstService;
import cn.itcast.ssh.service.Act_hi_varinstService;
import cn.itcast.ssh.service.Act_id_groupService;
import cn.itcast.ssh.service.Act_id_infoService;
import cn.itcast.ssh.service.Act_id_membershipService;
import cn.itcast.ssh.service.Act_id_userService;
import cn.itcast.ssh.service.Act_re_deploymentService;
import cn.itcast.ssh.service.Act_re_modelService;
import cn.itcast.ssh.service.Act_re_procdefService;
import cn.itcast.ssh.service.Act_ru_event_subscrService;
import cn.itcast.ssh.service.Act_ru_executionService;
import cn.itcast.ssh.service.Act_ru_identitylinkService;
import cn.itcast.ssh.service.Act_ru_jobService;
import cn.itcast.ssh.service.Act_ru_taskService;
import cn.itcast.ssh.service.Act_ru_variableService;
import cn.itcast.ssh.service.IAct_ge_bytearrayService;
import cn.itcast.ssh.service.IAct_ge_propertyService;
import cn.itcast.ssh.service.IAct_hi_actinstService;
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
import java.util.Map;

import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricDetail;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.Model;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.task.Comment;
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

	private IAct_ge_bytearrayService act_ge_bytearrayService;

	private IAct_ge_propertyService act_ge_propertyService;

	private IAct_hi_actinstService act_hi_actinstService;

	private Act_hi_attachmentService act_hi_attachmentService;
	private Act_hi_commentService act_hi_commentService;
	private Act_hi_detailService act_hi_detailService;
	private Act_hi_identitylinkService act_hi_identitylinkService;
	private Act_hi_procinstService act_hi_procinstService;
	private Act_hi_taskinstService act_hi_taskinstService;
	private Act_hi_varinstService act_hi_varinstService;;
	private Act_id_groupService act_id_groupService;
	private Act_id_infoService act_id_infoService;
	private Act_id_membershipService act_id_membershipService;
	private Act_id_userService act_id_userService;;
	private Act_re_deploymentService act_re_deploymentService;
	private Act_re_modelService act_re_modelService;
	private Act_re_procdefService act_re_procdefService;

	private Act_ru_event_subscrService act_ru_event_subscrService;
	private Act_ru_executionService act_ru_executionService;
	private Act_ru_identitylinkService act_ru_identitylinkService;
	private Act_ru_jobService act_ru_jobService;
	private Act_ru_taskService act_ru_taskService;
	private Act_ru_variableService act_ru_variableService;
	
	

	public void setAct_hi_attachmentService(Act_hi_attachmentService act_hi_attachmentService) {
		this.act_hi_attachmentService = act_hi_attachmentService;
	}

	public void setAct_hi_commentService(Act_hi_commentService act_hi_commentService) {
		this.act_hi_commentService = act_hi_commentService;
	}

	public void setAct_hi_detailService(Act_hi_detailService act_hi_detailService) {
		this.act_hi_detailService = act_hi_detailService;
	}

	public void setAct_hi_identitylinkService(Act_hi_identitylinkService act_hi_identitylinkService) {
		this.act_hi_identitylinkService = act_hi_identitylinkService;
	}

	public void setAct_hi_procinstService(Act_hi_procinstService act_hi_procinstService) {
		this.act_hi_procinstService = act_hi_procinstService;
	}

	public void setAct_hi_taskinstService(Act_hi_taskinstService act_hi_taskinstService) {
		this.act_hi_taskinstService = act_hi_taskinstService;
	}

	public void setAct_hi_varinstService(Act_hi_varinstService act_hi_varinstService) {
		this.act_hi_varinstService = act_hi_varinstService;
	}

	public void setAct_id_groupService(Act_id_groupService act_id_groupService) {
		this.act_id_groupService = act_id_groupService;
	}

	public void setAct_id_infoService(Act_id_infoService act_id_infoService) {
		this.act_id_infoService = act_id_infoService;
	}

	public void setAct_id_membershipService(Act_id_membershipService act_id_membershipService) {
		this.act_id_membershipService = act_id_membershipService;
	}

	public void setAct_id_userService(Act_id_userService act_id_userService) {
		this.act_id_userService = act_id_userService;
	}

	public void setAct_re_deploymentService(Act_re_deploymentService act_re_deploymentService) {
		this.act_re_deploymentService = act_re_deploymentService;
	}

	public void setAct_re_modelService(Act_re_modelService act_re_modelService) {
		this.act_re_modelService = act_re_modelService;
	}

	public void setAct_re_procdefService(Act_re_procdefService act_re_procdefService) {
		this.act_re_procdefService = act_re_procdefService;
	}

	public void setAct_ru_event_subscrService(Act_ru_event_subscrService act_ru_event_subscrService) {
		this.act_ru_event_subscrService = act_ru_event_subscrService;
	}

	public void setAct_ru_executionService(Act_ru_executionService act_ru_executionService) {
		this.act_ru_executionService = act_ru_executionService;
	}

	public void setAct_ru_identitylinkService(Act_ru_identitylinkService act_ru_identitylinkService) {
		this.act_ru_identitylinkService = act_ru_identitylinkService;
	}

	public void setAct_ru_jobService(Act_ru_jobService act_ru_jobService) {
		this.act_ru_jobService = act_ru_jobService;
	}

	public void setAct_ru_taskService(Act_ru_taskService act_ru_taskService) {
		this.act_ru_taskService = act_ru_taskService;
	}

	public void setAct_ru_variableService(Act_ru_variableService act_ru_variableService) {
		this.act_ru_variableService = act_ru_variableService;
	}

	public void setAct_hi_actinstService(IAct_hi_actinstService act_hi_actinstService) {
		this.act_hi_actinstService = act_hi_actinstService;
	}

	public WorkflowBean getWorkflowBean() {
		return workflowBean;
	}

	public void setWorkflowBean(WorkflowBean workflowBean) {
		this.workflowBean = workflowBean;
	}

	public void setAct_ge_propertyService(IAct_ge_propertyService act_ge_propertyService) {
		this.act_ge_propertyService = act_ge_propertyService;
	}

	public void setLeaveBillService(ILeaveBillService leaveBillService) {
		this.leaveBillService = leaveBillService;
	}

	public void setWorkflowService(IWorkflowService workflowService) {
		this.workflowService = workflowService;
	}

	public void setAct_ge_bytearrayService(IAct_ge_bytearrayService act_ge_bytearrayService) {
		this.act_ge_bytearrayService = act_ge_bytearrayService;
	}
    
	/**
	 * 查看表结构图
	 * @return
	 */
	public String viewWelcome() {
		
		return "viewWelcome";
	}
	
	/**
	 * 查看表结构图
	 * @return
	 */
	public String viewTable() {
		
		return "viewTable";
	}
	// ******************************activiti的23张表查询开始*********************************************************
	// ===============================历史数据表8张表=====================================================
	/**
	 * 1 历史行为表 ACT_HI_ACTINST 所有活动的历史节点表
	 */
	/*
	 * public String viewHistoricActivityInstance() {
	 * System.out.println(" 历史行为表 ACT_HI_ACTINST 所有活动的历史节点表");
	 * List<HistoricActivityInstance>
	 * HistoricActivityInstanceList=workflowService.findHistoricActivityInstanceList
	 * (); ValueContext.putValueContext("HistoricActivityInstanceList",
	 * HistoricActivityInstanceList); return "viewHistoricActivityInstance"; }
	 */
	public String viewAct_hi_actinst() {
		System.out.println(" 历史行为表 ACT_HI_ACTINST 所有活动的历史节点表");
		List<Act_hi_actinst> list = act_hi_actinstService.findAct_hi_actinst();
		System.out.println(list);
		ValueContext.putValueContext("list", list);
		return "viewAct_hi_actinst";
	}

	/**
	 * 2 流程明细表ACT_HI_DETAIL
	 */

	/*public String viewHistoricDetail() {
		List<HistoricDetail> HistoricDetailList = workflowService.findHistoricDetailList();
		ValueContext.putValueContext("HistoricDetailList", HistoricDetailList);
		return "viewHistoricDetail";
	}*/
	public String viewAct_hi_detail() {
		System.out.println(" 历史行为表 Act_hi_detail 所有活动的历史节点表");
		List<Act_hi_detail> list = act_hi_detailService.findAct_hi_detail();
		System.out.println(list);
		ValueContext.putValueContext("list", list);
		return "viewAct_hi_detail";
	}

	/**
	 * 3 任务历史表 （只有节点是UserTask的时候，该表中存在数据） ACT_HI_TASKINST
	 */
/*
	public String viewHistoricTaskInstance() {
		List<HistoricTaskInstance> HistoricTaskInstanceList = workflowService.findHistoricTaskInstanceList();
		ValueContext.putValueContext("HistoricTaskInstanceList", HistoricTaskInstanceList);
		return "viewHistoricTaskInstance";
	}*/
	
	public String viewAct_hi_taskinst() {
		System.out.println(" 历史行为表 Act_hi_taskinst 所有活动的历史节点表");
		List<Act_hi_taskinst> list = act_hi_taskinstService.findAct_hi_taskinst();
		System.out.println(list);
		ValueContext.putValueContext("list", list);
		return "viewAct_hi_taskinst";
	}
	
	/**
	 * 4 流程实例表 流程实例的历史表 ACT_HI_PROCINST
	 */

	/*public String viewHistoricProcessInstance() {
		List<HistoricProcessInstance> HistoricProcessInstanceList = workflowService.findHistoricProcessInstanceList();
		ValueContext.putValueContext("HistoricProcessInstanceList", HistoricProcessInstanceList);
		return "viewHistoricProcessInstance";
	}*/
	public String viewAct_hi_procinst() {
		System.out.println(" 历史行为表 Act_hi_procinst 所有活动的历史节点表");
		List<Act_hi_procinst> list = act_hi_procinstService.findAct_hi_procinst();
		System.out.println(list);
		ValueContext.putValueContext("list", list);
		return "viewAct_hi_procinst";
	}
	/**
	 * 5 历史参数表ACT_HI_VARINST
	 */

	/*public String viewHistoricVariableInstance() {
		List<HistoricVariableInstance> HistoricVariableInstanceList = workflowService
				.findHistoricVariableInstanceList();
		ValueContext.putValueContext("HistoricVariableInstanceList", HistoricVariableInstanceList);
		return "viewHistoricVariableInstance";
	}*/
	public String viewAct_hi_varinst() {
		System.out.println(" 历史行为表 Act_hi_varinst 所有活动的历史节点表");
		List<Act_hi_varinst> list = act_hi_varinstService.findAct_hi_varinst();
		System.out.println(list);
		ValueContext.putValueContext("list", list);
		return "viewAct_hi_varinst";
	}
	/**
	 * 6 历史附件表act_hi_attachment
	 */
	public String viewAct_hi_attachment() {
		System.out.println(" 历史行为表 Act_hi_attachment 所有活动的历史节点表");
		List<Act_hi_attachment> list = act_hi_attachmentService.findAct_hi_attachment();
		System.out.println(list);
		ValueContext.putValueContext("list", list);
		return "viewAct_hi_attachment";
	}
	/**
	 * 7 历史评论表 审批记录表 act_hi_comment
	 */
	public String viewAct_hi_comment() {
		System.out.println(" 历史行为表 Act_hi_comment 所有活动的历史节点表");
		List<Act_hi_comment> list = act_hi_commentService.findAct_hi_comment();
		System.out.println(list);
		ValueContext.putValueContext("list", list);
		return "viewAct_hi_comment";
	}
	/**
	 * 8 身份关系表act_hi_identitylink 历史任务办理人表（个人任务和组任务）
	 */
	public String viewAct_hi_identitylink() {
		System.out.println(" 历史行为表 Act_hi_identitylink 所有活动的历史节点表");
		List<Act_hi_identitylink> list = act_hi_identitylinkService.findAct_hi_identitylink();
		System.out.println(list);
		ValueContext.putValueContext("list", list);
		return "viewAct_hi_identitylink";
	}
	
	// ===============================通用数据表2张表=====================================================
	/**
	 * 1 资源表 资源文件表 act_ge_bytearray
	 */

	public String viewAct_ge_bytearray() {
		List<Act_ge_bytearray> list = act_ge_bytearrayService.findAct_ge_bytearray();
		ValueContext.putValueContext("list", list);
		System.out.println("++++++++++++++++++++++++" + list);
		return "viewAct_ge_bytearray";
	}

	/**
	 * 2 属性表 主键生成策略表 act_ge_property
	 */

	public String viewAct_ge_property() {
		List<Act_ge_property> list = act_ge_propertyService.findAct_ge_property();
		ValueContext.putValueContext("list", list);
		System.out.println("++++++++++++++++++++++++" + list);
		return "viewAct_ge_property";
	}
	// ===============================流程存储表3张表=====================================================

	/**
	 * 1 部署对象表 act_re_deployment
	 * 
	 */

	/*public String viewDeployment() {
		System.out.println("===========================================");
		List<Deployment> DeploymentList = workflowService.findReDeploymentList();
		ValueContext.putValueContext("DeploymentList", DeploymentList);
		return "viewDeployment";
	}*/
     public String viewAct_re_deployment() { 
    	 List<Act_re_deployment> list=act_re_deploymentService.findAct_re_deployment();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 return "viewAct_re_deployment";
     }
	/**
	 * 2 流程定义表 act_re_procdef
	 */
	/*public String viewProcessDefinition() {
		List<ProcessDefinition> processDefinitionList = workflowService.findReProcessDefinitionList();
		ValueContext.putValueContext("processDefinitionList", processDefinitionList);
		return "viewProcessDefinition";
	}*/
     public String viewAct_re_procdef() { 
    	 List<Act_re_procdef> list=act_re_procdefService.findAct_re_procdef();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 return "viewAct_re_procdef";
     }
	/**
	 * 3 流程设计模型部署表 act_re_model
	 */
	/*public String viewModel() {
		System.out.println("===========================================");
		List<Model> ModelList = workflowService.findReModelList();
		ValueContext.putValueContext("ModelList", ModelList);
		return "viewModel";
	}*/
     public String viewAct_re_model() { 
    	 List<Act_re_model> list=act_re_modelService.findAct_re_model();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 return "viewAct_re_model";
     }
	// ===============================运行时数据表6张表=====================================================

	/**
	 * 1 正在执行的执行对象表act_ru_execution
	 */

	/*public String viewExecution() {
		List<Execution> ExecutionList = workflowService.findRuExecutionList();

		System.out.println("=============" + ExecutionList);
		ValueContext.putValueContext("ExecutionList", ExecutionList);
		return "viewExecution";
	}*/
     
     public String viewAct_ru_execution() {
    	 List<Act_ru_execution> list=act_ru_executionService.findAct_ru_execution();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 
    	 return "viewAct_ru_execution";
     }

	/**
	 * 2 正在执行的任务表（只有节点是UserTask的时候，该表中存在数据）act_ru_task
	 */
	/*public String viewTask() {
		List<Task> TaskList = workflowService.findRuTaskList();
		ValueContext.putValueContext("TaskList", TaskList);
		return "viewTask";
	}*/
     
     
     public String viewAct_ru_task() {
    	 List<Act_ru_task> list=act_ru_taskService.findAct_ru_task();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 
    	 return "viewAct_ru_task";
     }
	/**
	 * 3 正在执行的流程变量表 act_ru_variable
	 */
     public String viewAct_ru_variable() {
    	 List<Act_ru_variable> list=act_ru_variableService.findAct_ru_variable();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 
    	 return "viewAct_ru_variable";
     }
	/**
	 * 4 任务办理人表（个人任务和组任务）流程与身份关联表 act_ru_identitylink
	 */
     
     public String viewAct_ru_identitylink() {
    	 List<Act_ru_identitylink> list=act_ru_identitylinkService.findAct_ru_identitylink();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 
    	 return "viewAct_ru_identitylink";
     }
	/**
	 * 5 工作数据表act_ru_job
	 */
     
     public String viewAct_ru_job() {
    	 List<Act_ru_job> list=act_ru_jobService.findAct_ru_job();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 
    	 return "viewAct_ru_job";
     }
	/**
	 * 6 事件描述表 act_ru_event_subscr
	 */
     
     public String viewAct_ru_event_subscr() {
    	 List<Act_ru_event_subscr> list=act_ru_event_subscrService.findAct_ru_event_subscr();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 
    	 return "viewAct_ru_event_subscr";
     }
	// ===============================身份数据数据表4张表(组织机构表)=====================================================

	/**
	 * 1 用户表 act_id_user
	 */
     
     public String viewAct_id_user() {
    	 List<Act_id_user> list=act_id_userService.findAct_id_user();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 
    	 return "viewAct_id_user";
     }
	/**
	 * 2 用户账号信息表act_id_info
	 */
     
     
     public String viewAct_id_info() {
    	 List<Act_id_info> list=act_id_infoService.findAct_id_info();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 
    	 return "viewAct_id_info";
     }
	/**
	 * 3角色表（用户组表）act_id_group
	 */
     
     public String viewAct_id_group() {
    	 List<Act_id_group> list=act_id_groupService.findAct_id_group();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 
    	 return "viewAct_id_group";
     }
	/**
	 * 4 关系表 用户角色关联表 act_id_membership
	 */
     
     public String viewAct_id_membership() {
    	 List<Act_id_membership> list=act_id_membershipService.findAct_id_membership();
    	 ValueContext.putValueContext("list", list);
 		   System.out.println("++++++++++++++++++++++++" + list);
    	 
    	 return "viewAct_id_membership";
     }
	// ******************************activiti的23张表查询结束*********************************************************

	/**
	 * 部署管理首页显示
	 * 
	 * @return
	 */
	public String deployHome() {

		// 1 查询部署对象信息 对应表（act_re_deployment）
		List<Deployment> dList = workflowService.findDeploymentList();
		// 2 查询流程定义信息 对应表（act_re_procdef）
		List<ProcessDefinition> pList = workflowService.findProcessDefinitionList();
		// 放到上下文对象中
		System.out.println(dList + " ================" + pList);
		ValueContext.putValueContext("dList", dList);// 部署信息表
		ValueContext.putValueContext("pList", pList);// 流程定义表
		return "deployHome";
	}

	/**
	 * 发布流程
	 * 
	 * @return
	 */
	public String newdeploy() {
		// 1获取页面传递的值
		String fileName = workflowBean.getFilename();
		// 2获取页面传递的zip文件
		File file = workflowBean.getFile();

		workflowService.saveNewDeploy(file, fileName);
		return "list";
	}

	/**
	 * 删除部署信息
	 */
	public String delDeployment() {
		// 1 获取部署对象id
		String deploymentId = workflowBean.getDeploymentId();
		// 2 使用部署对象id，删除流程定义
		workflowService.deleteProcessDefinitionByDeploymentId(deploymentId);

		return "list";// 重定向
	}

	/**
	 * 查看流程图
	 * 
	 * @throws Exception
	 */
	public String viewImage() throws Exception {
		// 1 获取页面中传递的部署id和资源图片名称
		String deploymentId = workflowBean.getDeploymentId();
		String imageName = workflowBean.getImageName();
		// 2获取资源文件表(act_ge_bytearray)中的资源图片输入流InputStream
		InputStream inputStream = workflowService.findImageInputStream(deploymentId, imageName);
		// 3 从response获取输出流
		OutputStream outputStream = ServletActionContext.getResponse().getOutputStream();
		// 4 将输入流中的对象取出来，写到输出流中

		for (int b = -1; (b = inputStream.read()) != -1;) {
			outputStream.write(b);
		}
		outputStream.close();
		inputStream.close();
		// 将图显示到页面上。用输入流写
		return null;
	}

	// 启动流程
	public String startProcess() {
		// 更新请假状态，启动流程实例，让启动的流程实例关联业务
		workflowService.saveStartProcess(workflowBean);
		return "listTask";
	}

	/**
	 * 任务管理首页显示
	 * 
	 * @return
	 */
	public String listTask() {
		// 1：从Session中获取当前用户名
		String name = SessionContext.get().getName();
		// 2：使用当前用户名查询正在执行的任务表，获取当前任务的集合List<Task>
		List<Task> list = workflowService.findTaskListByName(name);
		ValueContext.putValueContext("list", list);
		return "task";
	}

	/**
	 * 打开任务表单
	 */
	public String viewTaskForm() {
		// 任务ID
		String taskId = workflowBean.getTaskId();
		// 获取任务表单中任务节点的url连接
		String url = workflowService.findTaskFormKeyByTaskId(taskId);
		url += "?taskId=" + taskId;
		ValueContext.putValueContext("url", url);
		return "viewTaskForm";
	}

	// 准备表单数据
	public String audit() {
		// 获取任务ID
		String taskId = workflowBean.getTaskId();
		/** 一：使用任务ID，查找请假单ID，从而获取请假单信息 */
		LeaveBill leaveBill = workflowService.findLeaveBillByTaskId(taskId);
		ValueContext.putValueStack(leaveBill);
		/** 二：已知任务ID，查询ProcessDefinitionEntiy对象，从而获取当前任务完成之后的连线名称，并放置到List<String>集合中 */
		List<String> outcomeList = workflowService.findOutComeListByTaskId(taskId);
		ValueContext.putValueContext("outcomeList", outcomeList);
		/** 三：查询所有历史审核人的审核信息，帮助当前人完成审核，返回List<Comment> */
		List<Comment> commentList = workflowService.findCommentByTaskId(taskId);
		ValueContext.putValueContext("commentList", commentList);
		return "taskForm";
	}

	/**
	 * 提交任务
	 */
	public String submitTask() {
		workflowService.saveSubmitTask(workflowBean);
		return "listTask";
	}

	/**
	 * 查看当前流程图（查看当前活动节点，并使用红色的框标注）
	 */
	public String viewCurrentImage() {
		// 任务ID
		String taskId = workflowBean.getTaskId();
		/** 一：查看流程图 */
		// 1：获取任务ID，获取任务对象，使用任务对象获取流程定义ID，查询流程定义对象
		ProcessDefinition pd = workflowService.findProcessDefinitionByTaskId(taskId);
		// workflowAction_viewImage?deploymentId=<s:property
		// value='#deploymentId'/>&imageName=<s:property value='#imageName'/>
		ValueContext.putValueContext("deploymentId", pd.getDeploymentId());
		ValueContext.putValueContext("imageName", pd.getDiagramResourceName());
		/** 二：查看当前活动，获取当期活动对应的坐标x,y,width,height，将4个值存放到Map<String,Object>中 */
		Map<String, Object> map = workflowService.findCoordingByTask(taskId);
		ValueContext.putValueContext("acs", map);
		return "image";
	}

	// 查看历史的批注信息
	public String viewHisComment() {
		// 获取清单ID
		Long id = workflowBean.getId();
		// 1：使用请假单ID，查询请假单对象，将对象放置到栈顶，支持表单回显
		LeaveBill leaveBill = leaveBillService.findLeaveBillById(id);
		ValueContext.putValueStack(leaveBill);
		// 2：使用请假单ID，查询历史的批注信息
		List<Comment> commentList = workflowService.findCommentByLeaveBillId(id);
		ValueContext.putValueContext("commentList", commentList);
		return "viewHisComment";
	}

}
