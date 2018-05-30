<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
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
       <form action="order_updateOrder.action" method="post">
         <input type="text" value="${order.orderId }" name="o.orderId"/>
   empId:<input type="text" value="${order.emp.empId }" name="o.emp.empId"/>
           网点:<select name="o.branch.branchId">
            <option value="1">新乡网点</option>
            <option value="2">郑州网点</option>
            <option value="3">北京网点</option>
            <option value="4">开封网点</option>
            <option value="5">许昌网点</option>
       </select>
      clienteleId:<input type="text" name="o.clientele.clienteleId" value="${order.clientele.clienteleId }"/><br/><br/>
                订单发货情况:<input type="text" name="o.orderUrgency" value="${order.orderUrgency }"/><br/><br/>
                订单时间:<input type="text" name="o.orderDate" value="${order.orderDate }"/><br/><br/>
                订单贸易:<input type="text" name="o.deliveryWay" value="${order.deliveryWay }"/><br/><br/>
               订单接收员:<input type="text" name="o.receiptWay" value="${order.receiptWay }"/><br/><br/> 
               订单费用:<input type="text" name="o.orderCharge" value="${order.orderCharge }"/><br/><br/>
               订单签收:<input type="text" name="o.orderRefuse" value="${order.orderRefuse }"/><br/><br/>  
               订单状态:<input type="text" name="o.orderCancellation" value="${order.orderCancellation }"/><br/><br/>
               订单状态名称:<input type="text" name="o.orderCancellationName" value="${order.orderCancellationName }"/><br/><br/>
               订单附注:<input type="text" name="o.orderRemarks" value="${order.orderRemarks }"/>  
               <input type="submit"  name="提交"/>   
       </form>
    </div>
  </body>
</html>
