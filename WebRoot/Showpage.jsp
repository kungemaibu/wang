<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt"  prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Showpage.jsp' starting page</title>
    
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
<style>
 .num{width:30px;}
</style>
  </head>
  
  <body>
    <table border="1" style="width:300px">
      <tr>
        <td>id</td>
        <td>DeliveryRelease</td>
      
        <td>ReceiptNum</td>
        <td>WayBillRemarks</td>
        <td>VolumeUnitPrice</td>
        <td>WeightUnitPrice</td>
        <td>Loans</td>
        
        <td>TotalFreight</td>
        <td>DeTuned</td>
        <td>Duetothe</td>
       
        
      </tr>
  		<c:forEach var="w" items="${w.list }">
  		  <tr>
            <td>id</td>
        <td>DeliveryRelease</td>
      
        <td>ReceiptNum</td>
        <td>WayBillRemarks</td>
        <td>VolumeUnitPrice</td>
        <td>WeightUnitPrice</td>
        <td>Loans</td>
        
        <td>TotalFreight</td>
        <td>DeTuned</td>
        <td>Duetothe</td>
         </tr>
  		</c:forEach>
				<form action="wayBill_findByPages.action" method="post" onsubmit="return checkPage()">
  					   当前页:${w.curPage}/总页数:<span id="totalPages">${w.totalPages}</span>
    			    <a href="wayBill_findByPages.action?curPage=${w.firstPage}">首页</a>
    				<a href="wayBill_findByPages.action?curPage=${w.prevPage }">上一页</a>
    				<a href="wayBill_findByPages.action?curPage=${w.nextPage }">下一页</a>
    				<a href="wayBill_findByPages.action?curPage=${w.lastPage}">尾页</a><br/>
    				<input type="text" name="curPage" value="${w.curPage}"/>
    				<input type="submit" value="Let's go" id="num"/>
  				</form>
    			

    </table>
  </body>
</html>
