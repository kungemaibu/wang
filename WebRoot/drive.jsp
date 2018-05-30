<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'drive.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-1.11.3.min.js" charset="utf-8"></script>
<script type="text/javascript" src="js/index.js" charset="utf-8"></script>
  </head>
  
  <body>
  
       <table border="1">
         <c:forEach items="${driver.list}" var="d">
           <tr>
              <td>${d.driverId}</td>
              <td>${d.driverName}</td>
              <td>${d.driverPhone}</td>
              <td>${d.driverSex}</td>
              <td>${d.driverAdress}</td>
              <td>${d.contractK}</td>
              <td>${d.contractJ}</td>
              <td>${d.driverBei}</td>
              <td>${d.drivingDate}</td>
              <td>${d.drivingNum}</td>
              <td>${d.drivingChe}</td>
              <td><a href="kfk_finddriving?d.driverId=${d.driverId}"><input type="button" value="更改信息"></a>
                  <button value="${d.driverId}" class="deleteDriving">删除信息</button>
              </td>
           </tr>
         </c:forEach>
       </table>
       <p>
           <a href="kfk_findDriving.action?p.nowPage=1">首页</a>
           <a href="kfk_findDriving.action?p.nowPage=${driver.prevPage}">上一页</a>
           <a href="kfk_findDriving.action?p.nowPage=${driver.naxtPage}">下一页</a>
           <a href="kfk_findDriving.action?p.nowPage=${driver.lastPage}">尾页</a>
                                  第${driver.nowPage}页/共${driver.lastPage}页
        </p>
  </body>
</html>
