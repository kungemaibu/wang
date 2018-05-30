<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <table>
		    <form action="Users_findUsers.action" method="post">
		    <tr>
		        <td>用户名：</td>
		        <td><input type="text" name="userName" /></td>
		    </tr>
		    <tr>
		        <td>密码：</td>
		        <td><input type="password" name="userPsd" /></td>
		    </tr>
		      <tr>
		        <td>操作员：</td>
		        <td>
			        <select name="rolesId">
			            
			            <option value="1">管理员</option>
			            <option value="2">员工</option>
			            <option value="3" selected>普通用户</option>
			        </select>
		        </td>
		    </tr>
		       
		         <tr><td><input type="submit" value="登录"/></td></tr>
		         <a href="index2.jsp">注册</a>
		    </form>
    </table>
  </body>
</html>
