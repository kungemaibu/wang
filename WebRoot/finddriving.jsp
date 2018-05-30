<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'finddriving.jsp' starting page</title>
    
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
        <form action="kfk_updateDriving.action"  method="post">
              <h3>更新司机信息</h3>
                                           车牌号：<input type="text" value="${dr.vehicle.vvin}">
              <input type="text" value="${dr.driverId}" readonly="readonly" name="d.driverId"/>
              <input type="text" value="${dr.driverName}" name="d.driverName"/><br><br>
              <input type="text" value="${dr.driverPhone}" name="d.driverPhone"/>
              <input type="text" value="${dr.driverSex}" name="d.driverSex"/><br><br>
              <input type="text" value="${dr.driverAdress}" name="d.driverAdress"/>
              <input type="data" value="${dr.contractK}" name="d.contractK"/><br><br>
              <input type="data" value="${dr.contractJ}" name="d.contractJ"/>
              <input type="text" value="${dr.driverBei}" name="d.driverBei"/><br><br>
              <input type="data" value="${dr.drivingDate}" name="d.drivingDate"/>
              <input type="text" value="${dr.drivingNum}" name="d.drivingNum"/><br><br>
              <input type="text" value="${dr.drivingChe}" name="d.drivingChe"/><br><br>
              <input type="submit" value="提交"/>
        </form>
  </body>
</html>
