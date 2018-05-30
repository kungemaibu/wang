<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'my.jsp' starting page</title>
    
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
    <a href="waybill_findWayBill.action">查询运单</a>
     <table style="border-collapse: collapse;" border="1px">
       <c:forEach items="${w.list }" var="w">
         <tr>
        <!-- 网点表 -->
          <td>${w.branch.branchId }</td><td>${w.branch.branchName }</td><td>${w.branch.branchAddress }</td>
           <td>${w.branch.branchContact }</td><td>${w.branch.branchDate }</td>
        <!-- 员工表 -->
           <td>${w.emp.empName }</td><td>${w.emp.empPhone }</td>
        <!-- 付款方式 -->
           <td>${w.payment.paymentId }</td><td>${w.payment.paymentName }</td>
        <!--服务方式  -->
        <td>${w.servetype.serveId}</td><td>${w.servetype.serveName }</td>
        <!-- 订单表 -->
        <td>${w.order.orderId }</td><td>${w.order.orderUrgency }</td>
        <td>${w.order.orderDate }</td>
        <!--运单状态  -->
        <td>${w.waybilltype.waybillTypeId }</td><td>${w.waybilltype.waybillTypeName }</td>
        <!-- 提货表 -->
         <td>${w.pickingway.pickingWayName }</td>
        <!-- 送货运单表 -->
      <c:forEach items="${w.deliverywaybills }" var="d">
        <td>${w.deliveryTypeId }</td>
        <td>${w.deliveryTypeName }</td>
      
      </c:forEach>
      <td>
       <a href="waybill_findwayBill.action?w.Id=${w.id }">更新</a>
       <a href="waybill_deleteWayBill.action?w.Id=${w.id }">删除</a>
      </td>
           </tr>
       </c:forEach>
    <form action="waybill_findWayBill.action" method="post" onsubmit="return checkPage()">
                当前页:${w.curPage }/总页数:<span id="totalPages">${w.totalPages}</span>
        <a href="waybill_findWayBill.action?curPage=${w.firstPage }">首页</a>
        <a href="waybill_findWayBill.action?curPage=${w.prevPage }">上一页</a>
        <a href="waybill_findWayBill.action?curPage=${w.nextPage }">下一页</a>
        <a href="waybill_findWayBill.action?curPage=${w.lastPage }">尾页</a>
         <input type="text" name="curPage" value="${w.curPage }"/><br/><br/>
         <input type="submit" value="Lte's go" id="num"/>
    </form>
    <div>
        <h1>创建运单</h1>
        <form action="waybill_saveWayBill.action" method="post">
              网点:<select name="w.branch.branchId">
            <option value="1">新乡网点</option>
            <option value="2">郑州网点</option>
            <option value="3">北京网点</option>
            <option value="4">开封网点</option>
            <option value="5">许昌网点</option>
      
       </select><br/><br/>
       serveId:<input type="text" name="w.servetype.serveId"><br/><br/>
           运单时间:<input type="text" name="w.deliveryRelease"><br/><br/>
           数量:<input type="text" name="w.receiptNum"><br/><br/>
           运单标记:<input type="text" name="w.wayBillRemarks"><br/><br/>
           单位价钱:<input type="text" name="w.volumeUnitPrice"><br/><br/>
           价钱:<input type="text" name="w.weightUnitPrice"><br/><br/>
           金额:<input type="text" name="w.loans"/><br/><br/>
           运费:<input type="text" name="w.totalFreight"/><br/><br/>
           调整:<input type="text" name="w.deTuned"><br/><br/>
           到期:<input type="text" name="w.duetothe"><br/><br/>
           <input type="submit" name="提交" ><br/><br/>
        </form>
    </div>
     </table>
  </body>
</html>
