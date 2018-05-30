<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>添加用户 - H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script></head>
<body>
<article class="page-container">
<div>

  		<form action="addConsume.action" method="post">
  				
  		<c:forEach items="${list1 }" var="l">
  		
  		
  						<input type="hidden" name="ctid" value="${ctid }"/>
  						<input type="hidden" name="spName" value="${l.spName }"/>
  						<input type="hidden" name="spPrice" value="${l.spPrice }"/>
  				商品编号：<span>${l.spId }</span><br/>
  				商品名：<span>${l.spName }</span><br/>
  				商品类型：<span>${l.sptid }</span><br/>
  				仓库编号：<span>${l.whId }</span><br/>
  				价格：<span id="price">${l.spPrice }</span><br/>
  				数量：<span id="maxnum">${l.spnum }</span>
  		</c:forEach>
               
              		购买数量：<input type="button" value="-"  id="jian">
              		<input type="text" id="shu" value="0" style="width: 50px;height:25px" name="spnum">
              		<input type="button" value="+" id="jia">
              		<span id="tips"></span>
              		<input type="text" id="jiaqian" style="width: 50px;height:25px" name="xfprice"/>
              		<input type="submit" value="付款" class="fukuan" id="sub"/>
        </form>
  	</div>
  	</article>
  	<script type="text/javascript">
  		$("#jian").click(
	      function(){
	      var maxshu=parseFloat($("#maxnum").html());
	      	var shu=parseFloat($("#shu").val());
	      	var price=parseFloat($("#price").html());
	      	if(shu<maxshu){
	      		$("#shu").val(shu-1);
	      		$("#jiaqian").val((shu-1)*price);
	      		$("#tips").html("");
	      	}if(shu<=0){
	      		$("#shu").val(0);
	      		$("#jiaqian").val(shu*price);
	      		$("#tips").html("已经是最小数量");
	      	}
	      }
	      
	);
	 
	      
	     
	$("#jia").click(
	      function(){
	      var maxshu=parseFloat($("#maxnum").html());
	      	var shu=parseFloat($("#shu").val());
	      	var price=parseFloat($("#price").html());
	      	if(shu<maxshu){
	      		$("#shu").val(shu+1);
	      		$("#jiaqian").val((shu+1)*price);
	      		$("#tips").html("");
	      	}if(shu>maxshu){
	      		$("#shu").val(maxshu);
	      		$("#jiaqian").val(maxshu*price);
	      		$("#tips").html("已经是最大数量");
	      	}
	      }
	     
	);
	$("#sub").click(function(){
		alert("增加消费成功！");
	});
  	</script>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
/*$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
		
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			//$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			//parent.$('.btn-refresh').click();
			parent.layer.close(index);
		}
	});
});*/
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html> 
