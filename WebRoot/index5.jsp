<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@  taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
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
	<script type="text/javascript">
	  function checkPage(){
	  totalPages=parseInt(document.getElementById("totalPages").value);
	  var num=parseInt(document.getElementById("num").value);
	  if(num<=totalPages){
	     return true;
	  }else{
	     alert("没有值");
	     return false;
	  }
	  }
	</script>
<style type="text/css">
	a:HOVER{
		color:red;
		text-decorationnone;
	}
	.num{width:30px;}
</style>
  </head>
  
  <body>
    <a href="order_findOrder.action">查询订单</a>
    <table style="border-collapse: collapse;" border="1px">
     <c:forEach items="${o1.list }" var="o">
        <tr>
        <!-- 网点表 -->
          <td>${o.branch.branchId }</td><td>${o.branch.branchName }</td><td>${o.branch.branchAddress }</td>
           <td>${o.branch.branchContact }</td><td>${o.branch.branchDate }</td>
        <!-- 员工表 -->
           <td>${o.emp.empName }</td><td>${o.emp.empPhone }</td>
        <!-- 顾客表 -->
           <td>${o.clientele.clienteleName }</td> <td>${o.clientele.clientelePhone }</td> <td>${o.clientele.clienteleAdress }</td>
        <!-- 订单详情表 -->
           <td>${o.orderstatus.orderStatusName }</td>
        <!-- 订单类型表 -->
           <td>${o.ordertype.orderTypeName }</td>
        <!-- 提货表 -->
           <td>${o.pickingway.pickingWayName }</td>
        <!-- 运单表 -->
           <c:forEach items="${o.waybills }" var="w">
           <td>${w.wayBillRemarks }</td>
            <td>${w.volumeUnitPrice }</td>
            <td>${w.weightUnitPrice }</td>
            <td>${w.totalFreight }</td>
           </c:forEach>
        <!-- 库存表 -->
           <c:forEach items="${o.repertories }" var="r"><td>${r.cargoName }</td>
           <td>${r.repertoryState }</td><td>${r.route }</td><td>${r.consigner }</td>
           <td>${r.consignee }</td><td>${r.remarks }</td>
           </c:forEach>
        <!-- 订单详情表 -->
           <c:forEach items="${o.orderdetails }" var="od"><td>${od.cargoName }</td>
           <td>${od.cargoPack }</td><td>${od.cargoSpecification }</td>
           </c:forEach>
       
        <td>
        <a href="order_findorder.action?o.orderId=${o.orderId}">更新</a>
        <a href="order_deleteOrder.action?o.orderId=${o.orderId }">删除</a>
       </td>
       </tr>
     </c:forEach>
  
  <form action="order_findOrder.action" method="post" onsubmit="return checkPage()">
   当前页:${o.curPage }/总页数:<span id="totalPages">${o.totalPages}</span>
   <a href="order_findOrder.action?curPage=${o.firstPage }">首页</a>
   <a href="order_findOrder.action?curPage=${o.prevPage }">上一页</a>
   <a href="order_findOrder.action?curPage=${o.nextPage }">下一页</a>
   <a href="order_findOrder.action?curPage=${o.lastPage }">尾页</a><br/>
   <input type="text" name="curPage" value="${o.curPage }"/>
   <input type="submit" value="Lte's go" id="num"/>
  </form> 
  <div>
    <h2>创建订单</h2>
    <form action="order_saveOrder.action" method="post"> 
       网点:<select name="o.branch.branchId">
            <option value="1">新乡网点</option>
            <option value="2">郑州网点</option>
            <option value="3">北京网点</option>
            <option value="4">开封网点</option>
            <option value="5">许昌网点</option>
      
       </select><br/><br/>
    clienteleId:<input type="text" name="o.clientele.clienteleId"/><br/><br/>
                订单发货情况:<input type="text" name="o.orderUrgency"/><br/><br/>
                订单时间:<input type="text" name="o.orderDate"/><br/><br/>
                订单贸易:<input type="text" name="o.deliveryWay"/><br/><br/>
               订单接收员:<input type="text" name="o.receiptWay"/><br/><br/> 
               订单费用:<input type="text" name="o.orderCharge"/><br/><br/>
               订单签收:<input type="text" name="o.orderRefuse"/><br/><br/>  
               订单状态:<input type="text" name="o.orderCancellation"/><br/><br/>
               订单状态名称:<input type="text" name="o.orderCancellationName"/><br/><br/>
               订单附注:<input type="text" name="o.orderRemarks"/><br/><br/>       
               <input type="submit"  name="提交"/>   
    </form>
  </div>                      
    </table>
  </body>
</html>
