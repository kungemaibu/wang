<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
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
     <div>
        <h1>修改车辆信息</h1>
             <form action="kfk_updateCar.action"  method="post">
             <input type="text" value="${car.vehicleId}" name="v.vehicleId" hidden="hidden">
                                         车线:<select name="v.circuit.circuitId">
                        <c:forEach items="${cir}" var="c">
                           <c:if test="${c.circuitId==car.circuit.circuitId}">
                              <option value="${c.circuitId}" selected="selected">${c.circuitName}</option>
                           </c:if>
                           <c:if test="${c.circuitId!=car.circuit.circuitId}">
                              <option value="${c.circuitId}">${c.circuitName}</option>
                           </c:if>
                        </c:forEach>
                 </select>
                                         司机人员:<select>
                      <c:forEach items="${car.drivings}" var="d">
                        <option>${d.driverName}</option> 
                      </c:forEach>
                 </select>
                                          支付方式:<select name="v.payment.paymentId">
                         <c:forEach items="${pay}" var="p">
                              <c:if test="${p.paymentId==car.payment.paymentId}">
                                 <option value="${p.paymentId}" selected="selected">${p.paymentName}</option> 
                              </c:if>
                               <c:if test="${p.paymentId!=car.payment.paymentId}">
                                 <option value="${p.paymentId}">${p.paymentName}</option> 
                              </c:if>
                         </c:forEach>
                    </select>
                                           啥:<input type="text" value="${car.vehicleChe}" name="v.vehicleChe"/>
                                           车辆来源:<input type="text" value="${car.vehicleSource}" name="v.vehicleSource"/><br/><br/>
                                           声明:<input type="text" value="${car.statement}" name="v.statement"/>
                                          主轴箱:<input type="text" value="${car.headstock}" name="v.headstock"/><br/><br/>                            
                                           类型:<input type="text" value="${car.motorcycle}" name="v.motorcycle"/>
                                           品牌:<input type="text" value="${car.brand}" name="v.brand"/><br/><br/>
                                           荷载:<input type="number" value="${car.vload}" name="v.vload"/>                           
                                           容量:<input type="number" value="${car.vbulk}" name="v.vbulk"/><br/><br/>
                                           宽度:<input type="number" value="${car.vwidth}" name="v.vwidth"/>
                                           高度:<input type="number" value="${car.vheight}" name="v.vheight"/><br/><br/>
                                           长度:<input type="number" value="${car.vlength}" name="v.vlength"/>                           
                                           颜色:<input type="text" value="${car.vcolour}" name="v.vcolour"/><br/><br/>
                                           日期:<input type="text" value="${car.vriqi}" name="v.vriqi"/>
                                           车辆识别码:<input type="text" value="${car.vvin}" name="v.vvin"/><br/><br/>
                                           发动机编号:<input type="text" value="${car.vengine}" name="v.vengine"/>
                                           不知道:<input type="text" value="${car.voperation}" name="v.voperation"/><br/><br/>
                                           保险:<input type="text" value="${car.insurance}" name="v.insurance"/>
                                           保险开始日期:<input type="text" value="${car.insuranceK}"  name="v.insuranceK"/><br/><br/>
                                           保险结束日期:<input type="text" value="${car.insuranceJ}" name="v.insuranceJ"/>
                                           单位:<input type="text" value="${car.carDanWei}" name="v.carDanWei"/><br/><br/>
                                           地址:<input type="text" value="${car.carAdress}" name="v.carAdress"/>
                                           车主电话:<input type="text" value="${car.carPhone}" name="v.carPhone"/><br/><br/>
                           <input type="submit" value="提交">
             </form>
        </div>
  </body>
</html>
