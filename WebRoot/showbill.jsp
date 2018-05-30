<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showbill.jsp' starting page</title>
    
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
     <form action="waybill_updateWayBill.action" method="post">
        <input type="text" value="${waybill.id }" name="${w.id }">
        emp:<input type="text" value="${waybill.emp.empId }" name="w.emp.empId"/>
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
  </body>
</html>
