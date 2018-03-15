
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
a{ text-decoration:none} 
</style>	
</head>

<body>
  <div class="easyui-accordion" style=" height: 600px;padding:0px"  align="left">

		<div title="业务管理" data-options="iconCls:'icon-search'"
			style="padding:0px;">
			<ul >
				 <li style="list-style-type:none;"> 
         <span><img src="images/main_52.gif" width="20" height="20"><a href="leaveBillAction_home.action" target="main">请假管理</a>
                </span>   
              </li>
			</ul>
		</div>

		<div title="流程管理" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul >
				<li style="list-style-type:none;"><span><img src="images/main_48.gif" width="20" height="20"><a href="workflowAction_deployHome.action" target="main">部署管理</a></span></li>
			</ul>
			<div>
			<ul >
				<li style="list-style-type:none;"><span><img src="images/main_40.gif" width="20" height="20"><a href="workflowAction_listTask.action" target="main">任务管理</a></span></li>
			</ul>
		</div>
		
	<!-- </div>
		<div title="流程管理" data-options="iconCls:'icon-search'"
			style="padding: 0px;">
			<ul >
				<li style="list-style-type:none;"><span><img src="images/main_48.gif" width="20" height="20"><a href="workflowAction_deployHome.action" target="main">部署管理</a></span></li>
			</ul>
			<div>
			<ul >
				<li style="list-style-type:none;"><span><img src="images/main_40.gif" width="20" height="20"><a href="workflowAction_listTask.action" target="main">任务管理</a></span></li>
			</ul>
		</div>
		
	</div> -->
	
</body>
</html>