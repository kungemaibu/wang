<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script></head>
<body>
<article class="page-container">
	<form action="add.action"  class="form form-horizontal" id="form-member-add" method="post">
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>员工编号：：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="ocId" name="ocId"><span id="socid"></span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>员工账号：：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="ocName" name="ocName"><span id="socName"></span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>真实姓名：：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="oczsName" name="oczsName"><span id="soczsName"></span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>账号密码：：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="ocPassword" name="ocPassword"><span id="socPassword"></span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>入职日期：：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" name="ocEntryTime">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>性别：：</label>
			<div class="formControls col-xs-8 col-sm-9">
			
				<input type="radio" name="ocSex" value="男" checked="checked">男
			   		<input type="radio" name="ocSex" value="女">女<br/>		
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>员工年龄：：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="ocAge" name="ocAge"><span id="socAge"></span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>员工生日：：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="ocBrithday" name="ocBrithday"><span id="socBrithday"></span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>部门：：</label>
			<div class="formControls col-xs-8 col-sm-9">
			<select name="dpId">
				<option value="1">前台部</option>
				<option value="2">销售部</option>
				<option value="3">财务部</option>
				<option value="4">保卫部</option>
				<option value="5">服务部</option>
				<option value="6">公司大佬</option>
			</select>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>职位：：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select name="dutyId">
				<option value="6">普通职员</option>
				<option value="2">财务总监</option>
				<option value="3">大厅经理</option>
				<option value="4">项目总监</option>
				<option value="5">人士总监</option>
			</select>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>手机：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="mobile" name="ocPhone"><span id="smobile"></span>
			</div>
		</div>
	<!--  
	<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">附件：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="btn-upload form-group">
				<input class="input-text upload-url" type="text" name="uploadfile" id="uploadfile" readonly nullmsg="请添加附件！" style="width:200px">
				<a href="javascript:void();" class="btn btn-primary radius upload-btn"><i class="Hui-iconfont">&#xe642;</i> 浏览文件</a>
				<input type="file" multiple name="file-2" class="input-file">
				</span> </div>
		</div> -->
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>地址：：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="ocAddress" name="ocAddress"><span id="socAddress"></span>
			</div>
		</div>
		<!-- 
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">备注：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="beizhu" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" onKeyUp="$.Huitextarealength(this,100)"></textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
			</div>
		</div>
		 -->
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-primary radius" type="submit" id="sub" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</article>

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
$("#ocId").blur(function(){
	var ocid=$("#ocId").val();
	if(ocid.length<1){
		$("#socid").html("员工编号不能为空！");
		return false;
	}else{
		$("#socid").html("");
		return true;
	}
});
$("#ocName").blur(function(){
	var ocid=$("#ocName").val();
	if(ocid.length<1){
		$("#socName").html("员工账号不能为空！");
	}else{
		$("#socName").html("");
	}
});
$("#oczsName").blur(function(){
	var ocid=$("#oczsName").val();
	if(ocid.length<1){
		$("#soczsName").html("员工真实姓名不能为空！");
	}else{
		$("#soczsName").html("");
	}
});
$("#ocPassword").blur(function(){
	var ocid=$("#ocPassword").val();
	if(ocid.length<1){
		$("#socPassword").html("员工密码不能为空！");
	}else{
		$("#socPassword").html("");
	}
});
$("#mobile").blur(function(){
	var ocid=$("#mobile").val();
	var reg=/^1[3|4|5|8][0-9]\d{4,8}$/g;
	if(reg.test(ocid)){
		$("#smobile").html("");
		return true;
	}else{
		$("#smobile").html("手机号格式不对");
		return false;
	}
});
$("#ocAddress").blur(function(){
	var ocid=$("#ocAddress").val();
	if(ocid.length<1){
		$("#socAddress").html("地址不能为空");
		return false;
	}else{
		$("#socAddress").html("");
		return true;
	}
});
$("#sub").click(function(){
	var msg = "确认提交？\n\n请确认！"; 
	 if (confirm(msg)==true){ 
  	return true; 
 	}else{ 
 	 return false; 
 	}
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>