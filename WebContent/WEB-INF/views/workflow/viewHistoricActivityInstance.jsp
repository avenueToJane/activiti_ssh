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
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">ID</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">活动ID</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">活动名称</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">活动类型</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">流程定义ID</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">流程实例ID</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">执行ID</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">任务ID</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">called流程实例ID</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">assignee</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">durationInMillis</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">开始时间</span></div></td>
		         <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">结束时间</span></div></td>
		      </tr>
		      <s:if test="#HistoricActivityInstanceList!=null && #HistoricActivityInstanceList.size()>0">
		      	<s:iterator value="#HistoricActivityInstanceList">
		      		<tr>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE6"><div align="center"><s:property value="id"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="activityId"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="activityName"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="activityType"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="processDefinitionId"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="processInstanceId"/></div></td>
				          <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="executionId"/></div></td>
				          <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="taskId"/></div></td>
				           <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="calledProcessInstanceId"/></div></td>
				            <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="assignee"/></div></td>
				             <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="durationInMillis"/></div></td>
				          <td height="20" bgcolor="#FFFFFF" class="STYLE6"><div align="center"><s:date name="startTime" format="yyyy-MM-dd HH:mm:ss"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:date name="endTime" format="yyyy-MM-dd HH:mm:ss"/></div></td>
				    </tr> 
		      	</s:iterator>
		      </s:if>
		        
		      
		    </table></td>
		  </tr>
	</table>
</body>
</html>