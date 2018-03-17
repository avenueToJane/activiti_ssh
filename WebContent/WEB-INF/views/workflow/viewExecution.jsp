<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>流程实例表</title>
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
		                <td width="94%" valign="bottom"><span class="STYLE1">流程实例表 </span></td>
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
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">isSuspended</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">isEnded</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">活动ID</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">流程实例ID</span></div></td>
		        <td width="7.69%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">父Id</span></div></td>

		      </tr>
		      <s:if test="#ExecutionList!=null && #ExecutionList.size()>0">
		      	<s:iterator value="#ExecutionList">
		      		<tr>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE6"><div align="center"><s:property value="id"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="isSuspended"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="isEnded"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="activityId"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="processInstanceId"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="parentId"/></div></td>
				    </tr> 
		      	</s:iterator>
		      </s:if>
		        
		      
		    </table></td>
		  </tr>
	</table>
</body>
</html>