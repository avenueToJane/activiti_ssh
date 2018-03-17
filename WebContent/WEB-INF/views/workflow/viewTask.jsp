<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>任务管理</title>
</head>
<body>
	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
		    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		      <tr>
		        <td height="24" bgcolor="#353c44"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		          <tr>
		            <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
		              <tr>
		                <td width="6%" height="19" valign="bottom"><div align="center"><img src="${pageContext.request.contextPath }/images/tb.gif" width="14" height="14" /></div></td>
		                <td width="94%" valign="bottom"><span class="STYLE1">部署对象表 </span></td>
		              </tr>
		            </table></td>
		            <td><div align="right"><span class="STYLE1">
		              </span></div></td>
		          </tr>
		        </table></td>
		      </tr>
		    </table></td>
		  </tr>
		  <tr>
		    <td><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
		      <tr>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">任务ID</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">任务名称</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">任务描述</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">Priority</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">所有者</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">Assignee</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">DelegationState</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">流程实例ID</span></div></td>
		        <td width="6.25" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">运行ID</span></div></td>
		        
		         <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">流程定义ID</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">创建时间</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">任务KEY</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">过期时间</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">父任务ID</span></div></td>
		        <td width="6.25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">isSuspended</span></div></td>
		        <td width="6.25" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">任务变量</span></div></td>
		      </tr>
		      <s:if test="#TaskList!=null && #TaskList.size()>0">
		      	<s:iterator value="#TaskList">
		      		<tr>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE6"><div align="center"><s:property value="id"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="name"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="description"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="priority"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE6"><div align="center"><s:property value="owner"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="assignee"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="delegationState"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="processInstanceId"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="executionId"/></div></td>
				        
				        
				         <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="processDefinitionId"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:date name="createTime" format="yyyy-MM-dd HH:mm:ss"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE6"><div align="center"><s:property value="taskDefinitionKey"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="dueDate"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="parentTaskId"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="isSuspended"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="taskLocalVariables"/></div></td>
				    </tr> 
		      	</s:iterator>
		      </s:if>
		        
		      
		    </table></td>
		  </tr>
	</table>
</body>
</html>