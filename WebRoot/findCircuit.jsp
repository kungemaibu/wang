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
    
    <title>My JSP 'findCircuit.jsp' starting page</title>
    
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
    <table border="1" rules="all">
         <tr>
             <th>线路编号</th> <th>线路名称</th> <th>网点</th> <th>里程（km）</th> <th>时效（h）</th> <th>账单</th> <th colspan="2">操作</th>
         </tr>
         <c:forEach items="${cir}" var="cir">
           <tr>
               <td>${cir.circuitId}</td> <td>${cir.circuitName}</td> <td>${cir.branch.branchName}</td>
               <td>${cir.mileage}</td> <td>${cir.aging}</td> <td>${cir.accounting}</td>
               <td><button value="${cir.circuitId}" class="deleteCircuit">删除信息</button></td>  
               <td><a href="kfk_findcircuit.action?c.circuitId=${cir.circuitId}"><button value="${cir.circuitId}" class="findcircuit">更改信息</button></a></td>
           </tr>
         </c:forEach>
    </table>
  </body>
</html>
