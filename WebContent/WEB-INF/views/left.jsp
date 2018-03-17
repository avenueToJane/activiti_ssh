
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>菜单</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/easyui/css/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/easyui/css/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/easyui/css/demo.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/easyui/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/easyui/js/jquery.easyui.min.js"></script>
<style>
a {
	text-decoration: none
}
</style>
</head>

<body>
	<div class="easyui-accordion" style="height: 600px; padding: 0px"
		align="left">

		<div title="业务管理" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_52.gif" width="20" height="20"><a
						href="leaveBillAction_home.action" target="main">请假管理</a> </span></li>
			</ul>
		</div>

		<div title="流程管理" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_48.gif" width="20" height="20"><a
						href="workflowAction_deployHome.action" target="main">部署管理</a></span></li>
			</ul>
			<div>
				<ul>
					<li style="list-style-type: none;"><span><img
							src="images/main_40.gif" width="20" height="20"><a
							href="workflowAction_listTask.action" target="main">任务管理</a></span></li>
				</ul>
			</div>

		</div>

     <div title="Activiti数据库" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewWelcome.action" target="main">查看表结构图</a></span></li>
			</ul>
		</div>
		<div title="Activiti表结构" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewTable.action" target="main">查看表结构图</a></span></li>
			</ul>
		</div>
		<div title="流程存储表" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_re_deployment.action" target="main">部署数据表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_re_procdef.action" target="main">流程定义表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_re_model.action" target="main">流程设计模型部署表</a></span></li>
			</ul>
		</div>
		<div title="运行时数据表" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_ru_execution.action" target="main">流程实例表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_ru_task.action" target="main">流程任务表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_ru_variable.action" target="main">流程参数表</a></span></li>
			</ul>
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_ru_identitylink.action" target="main">流程与身份关系表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_ru_job.action" target="main">工作数据表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_ru_event_subscr.action" target="main">事件描述表</a></span></li>
			</ul>
		</div>

		<div title="历史数据表" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_hi_procinst.action" target="main">流程历史实例表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_hi_detail.action" target="main">流程历史明细表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_hi_taskinst.action" target="main">历史任务表</a></span></li>
			</ul>
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_hi_actinst.action" target="main">历史行为表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_hi_attachment.action" target="main">附件表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_hi_comment.action" target="main">评论表</a></span></li>
			</ul>
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_hi_varinst.action" target="main">历史参数表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_hi_identitylink.action" target="main">身份关系表</a></span></li>
			</ul>
		</div>
		<div title="身份数据表" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_id_user.action" target="main">用户表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_id_info.action" target="main">用户账号信息表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_id_group.action" target="main">用户组表</a></span></li>
			</ul>
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_id_membership.action" target="main">关系表</a></span></li>
			</ul>
		</div>
		<div title="通用数据表" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_ge_bytearray.action" target="main">资源表</a></span></li>
			</ul>

			<ul>
				<li style="list-style-type: none;"><span><img
						src="images/main_1000.png" width="20" height="20"><a
						href="workflowAction_viewAct_ge_property.action" target="main">属性表</a></span></li>
			</ul>
		</div>
		
</body>
</html>