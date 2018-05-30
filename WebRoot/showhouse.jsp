<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showhouse.jsp' starting page</title>
    
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
  <a href="wareHouse_findWareHouse.action">查询仓库</a>
  <a href="wareHouse_findWareHouse.action">添加库存</a>
     <table border="1">
       <c:forEach items="${w.list }" var="w">
         <tr>
          <!-- 网点表 -->
            <td>${w.branch.branchId }</td><td>${w.branch.branchName }</td><td>${w.branch.branchAddress }</td>
            <td>${w.branch.branchContact }</td><td>${w.branch.branchDate }</td>
          <!-- 仓库表 -->
            <td>${w.warehouseName }</td><td>${w.warehouseAdress }</td><td>${w.warehouseArea }</td>
            <td>${w.warehouseren }</td><td>${w.rent }</td>
         </tr>
       </c:forEach>
      
      <form action="wareHouse_findWareHouse.action" method="post" onsubmit="return checkPage()">
      当前页:${w.curPage }/总页数:<span id="totalPages">${w.totalPages}</span>
   <a href="wareHouse_findWareHouse.action?curPage=${w.firstPage }">首页</a>
   <a href="wareHouse_findWareHouse.action?curPage=${w.prevPage }">上一页</a>
   <a href="wareHouse_findWareHouse.action?curPage=${w.nextPage }">下一页</a>
   <a href="wareHouse_findWareHouse.action?curPage=${w.lastPage }">尾页</a><br/>
   <input type="text" name="curPage" value="${w.curPage }"/>
   <input type="submit" value="Lte's go" id="num"/>
      </form>
      <!-- <div>
        <h1>创建仓库</h1>
      <form action="wareHouse_saveRepertory.action" method="post">
         网点:<select name="w.branch.branchId">
            <option value="1">新乡网点</option>
            <option value="2">郑州网点</option>
            <option value="3">北京网点</option>
            <option value="4">开封网点</option>
            <option value="5">许昌网点</option>
  
       </select><br/><br/>
      货物:<input type="text" name="${r.CargoName }">
      <input type="submit" name="提交">
      </div>-->
    </table>
  </body>
</html>
