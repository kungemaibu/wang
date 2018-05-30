<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>

<![endif]-->
<link href="static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/h-ui.admin/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />

<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>空白页</title>
<link rel="stylesheet" type="text/css" href="js/bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="js/bootstrap/css/bootstrap.min.css">
    <style type="text/css">
            input{
                border: 1px solid #ccc;
                padding: 7px 0px;
                border-radius: 3px;
                padding-left:5px;
                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
                box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
                -webkit-transition: border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
                -o-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
                transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s
            }
            input:focus{
                    border-color: #66afe9;
                    outline: 0;
                    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6);
                    box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6)
            }    
    </style>
</head>
<body>
     <table class="table table-bordered table-hover table-condensed">
  			<tr>
  				<td></td>
  				<td>网点名称</td>
  				<td>仓库名称</td>
  				<td>订单id</td>
  				<td>货物名称</td>
  				<td>入库时间</td>
  				<td>入库状态</td>
  				<td>库存体积</td>
  				<td>发站</td>  	
  				<td>目的站</td>
  				<td>路由</td>    
  				<td>发货人</td>  	
  				<td>收货人</td>
  				<td>备注</td>     								    							
  			</tr>
    	<c:forEach items="${p.list }" var="re">
    		<tr>
    			<td>${re.branch.branchName }</td>
    			<td>${re.warehouse.warehouseName }</td>
    			<td>${re.order.orderId }</td>
    			<td>${re.cargoName }</td>
    			<td>${re.repertoryTime }</td>
    			<td>${re.repertoryState }</td>
    			<td>${re.repertoryVolume }</td>
    			<td>${re.fromStand }</td>
    			<td>${re.toStand }</td>
    			<td>${re.route }</td>
    			<td>${re.consigner }</td>
    			<td>${re.consignee }</td>
    			<td>${re.remarks }</td>
    			<td><a href="Repertory_updateRepertory.action?repertory.repertoryId=${re.repertoryId }">出库</a></td>
    		</tr>
    	</c:forEach>			
    </table>
    <form action="Repertor_findbyPager.action" method="post">
	    <ul class="pager">
	    	<li>当前页：<span id="curPage">${p.curPage }</span>总页数：<span id="totalPages">${p.totalPages }</span></li>
	    	<li><a id="first" href="Repertory_findbyPager.action?pager.curPage=${p.first }">首页</a></li>
	    	<li><a id="prev" href="Repertory_findbyPager.action?pager.curPage=${p.prev }">上一页</a></li>
	    	<li><a id="next" href="Repertory_findbyPager.action?pager.curPage=${p.next }">下一页</a></li>
	    	<li><a id="last" href="Repertory_findbyPager.action?pager.curPage=${p.last }">尾页</a></li>
	    	<li>
		    		<input type="number" id="texCurPage"  min="1" max="${p.totalPages }" name="pager.curPage" style="100px">
		    		<input type="submit" value="go" class="btn btn-primary">	
	    	</li>
	    </ul>   
    </form> 
  </body>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> 
</body>
</html>
