<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fincircuit.jsp' starting page</title>
    
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
  <script type="text/javascript" src="js/jquery-1.11.3.min.js" charset="utf-8"></script>
 <script type="text/javascript" src="js/index.js" charset="utf-8"></script>
     <form action="kfk_updateCircuit.action" method="post">
         线路编号:<input type="text" value="${cir.circuitId}" name="c.circuitId">
         线路名称:<input type="text" value="${cir.circuitName}"  name="c.circuitName">
          网点:<select name="c.branch.branchId">
                  <c:forEach items="${branch}" var="b">
                     <c:if test="${b.branchId==cir.branch.branchId}">
                          <option value="${b.branchId}" selected="selected">${b.branchName}</option>
                     </c:if>
                     <c:if test="${b.branchId!=c.branch.branchId}">
                          <option value="${b.branchId}">${b.branchName}</option>
                     </c:if>
                  </c:forEach>
              </select>
         里程:<input type="number" value="${cir.mileage}"  name="c.mileage">(km/千米)<br/><br/>
         时效:<input type="number" value="${cir.aging}"  name="c.aging">(h/小时)
         账单:<input type="text" value="${cir.accounting}"  name="c.accounting">
         <input type="submit" value="提交">
     </form>
  </body>
</html>
