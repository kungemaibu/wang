<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
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
<title>用户管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c"> 日期范围：
		<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" class="input-text Wdate" style="width:120px;">
		<input type="text" class="input-text" style="width:250px" placeholder="输入会员名称、电话、邮箱" id="" name="">
		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"></span> <span class="r">共有数据：<strong>88</strong> 条</span> </div>
	<div class="mt-20">
	
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
		    <tr class="text-c">
			    <th width="25"><input type="checkbox" name="" value=""></th>
				<th width="50"><a href="findbystatus.action?roomflag=1">空房</a></th>
				<th width="50"><a href="findbystatus.action?roomflag=2">已入住</a></th>
				<th width="40"><a href="findbystatus.action?roomflag=3">未清理</a></th>
				<th width="50"><a href="findbystatus.action?roomflag=5">异常</a></th>
			</tr>  
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="50"><a href="selectbyclass.action?rtid=1" method="post">高级标间</a></th>
				<th width="50"><a href="selectbyclass.action?rtid=2">高级单间</a></th>
				<th width="40"><a href="selectbyclass.action?rtid=3">豪华标间</a></th>
				<th width="50"><a href="selectbyclass.action?rtid=4">豪华单间</a></th>
				<th width="70"><a href="selectbyclass.action?rtid=5">商务休闲房</a></th>
				<th width="70"><a href="selectbyclass.action?rtid=6">行政单间</a></th>
				<th width="70"><a href="selectbyclass.action?rtid=7">家庭套房</a></th>
				<th width="50"><a href="selectbyclass.action?rtid=8">总统套房</a></th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="80">房间id</th>
				<th width="100">房间类型</th>
				<th width="80">房间楼层</th>
				<th width="150">房间电话</th>
				<th width="70">房间备注</th>
				<th width="70">房间价格</th>
				<th width="70">房间状态</th>
				<th width="400">操作</th>
			</tr>
			
			
		</thead>
		<tbody>
		<c:forEach items="${list}" var="r">
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td class="roomnumber">${r.roomid }</td>
    			<td>${r.rtid }</td>
    			<td>${r.floorid }楼</td>
    			<td>${r.roomphone }</td>
    			<td>${r.roomcomment }</td>
    			<td>${r.price }</td>
    			<c:if test="${r.roomflag==1 }">
  					<td>空房</td>
  				</c:if>
  				<c:if test="${r.roomflag==2 }">
  					<td>已入住</td>
  				</c:if>
  				<c:if test="${r.roomflag==3 }">
  					<td>未清理</td>
  				</c:if>
  				<c:if test="${r.roomflag==4 }">
  					<td>预定中</td>
  				</c:if>
  				<c:if test="${r.roomflag==5 }">
  					<td>异常</td>
  				</c:if>
 
    		  <td class="td-manage">
			
    			<c:if test="${r.roomflag==1 }">
    				<a href="getroomid.action?roomid=${r.roomid }">登记入住</a>
    			</c:if>
    			<c:if test="${r.roomflag==2 }">
    				<a href="changeroom1.action?roomid=${r.roomid }&price=${r.price }">更换房间</a>
    				<a href="secMessage.action?roomid=${r.roomid }">顾客信息</a>
    				<a href="Debook.action?roomid=${r.roomid }&ocid=1&price=${r.price }" method="post">退房</a>
    				<a href="find.action?roomid=${r.roomid }">增加消费</a>
    			</c:if>
    			<c:if test="${r.roomflag==3 }">
    				<a href="Sweep.action?roomid=${r.roomid }" method="post">打扫房间</a>
    			</c:if>
    			<c:if test="${r.roomflag==5 }">
    				<a href="Sweep.action?roomid=${r.roomid }" method="post">处理</a>
    			</c:if>	
    			
    		</td>	
    			
    			
				
			</tr>
	</c:forEach>  
		</tbody>
	</table>
	</div>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[8]}// 制定列不参与排序
		]
	});
	
});
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
				$(obj).remove();
				layer.msg('已停用!',{icon: 5,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

/*用户-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
				$(obj).remove();
				layer.msg('已启用!',{icon: 6,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});
	});
}
/*用户-编辑*/
function member_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*密码-修改*/
function change_password(title,url,id,w,h){
	layer_show(title,url,w,h);	
}

</script> 
</body>
</html>
