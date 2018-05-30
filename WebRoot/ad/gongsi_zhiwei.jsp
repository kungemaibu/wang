<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gongsi_zhiwei.jsp' starting page</title>
    
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
        <tr>
         <th>id</th>
           <th>账号</th>
           <th>密码</th>
           <th>角色</th>
           <th>员工编号</th>
           
           <th >操作</th>
           <th>姓名</th>
           <!-- Colspan=2 -->
        </tr>
        <c:forEach items="${list}" var="z">
	        <tr>
	        
	        <form action="zhiwei_up.action" method="post">
	         <td><input type="text" value="${z.userId}" name="users.userId"/></td>
	           <td><input type="text" value="${z.userName}" name="users.userName"/></td>
	           <td><input type="text" value="${z.userPsd}" name="users.userPsd"/></td>
	           <%-- <td>
	              <select name="${users.rolestable.rolesId}" >
	              
	                  <option value="1">管理员</option>
	                  <option value="2">员工</option>
	                  <option value="3">客户</option>
	              </select>
	           </td> --%>
	           <td><input type="text" value="${z.rolestable.rolesId}" name="users.rolestable.rolesId" /></td>
	           
	           <td><input type="text" value="${z.emp.empId}" name="users.emp.empId"/></td>
	           <td><input type="submit" value="修改"/>
	          </form>

	           <td><input type="text" value="${z.emp.empName}" name="users.emp.empName"/></td>
	        </tr>
        </c:forEach>
    </table>
  </body>
</html>
<!-- <script src="jquery-1.8.3.min.js"></script>
<script type="text/javascript">

function shi(){
	onblur="shi()"
}
function up(){
   document.pay.action="zhiwei_up.action";
   document.pay.submit();
}
function del(){
   document.pay.action="zhiwei_del.action";
   document.pay.submit();
} -->
</script>
