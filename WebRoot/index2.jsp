<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript">
     function all(){
			if (username()&&psd()&&repsd())
			{
			alert("注册成功");
			
			return true;
			}else{
					alert("注册失败")
					return false;
				}
		}
		 
		     
		
		function checkname(){
				var aa=document.getElementById("username")
			var reg=/^[a-zA-Z0-9_-]{4,16}$/;
			if (reg.test(aa.value))
			{document.getElementById("spanname").innerHTML="";
			return true;
			}else{
			document.getElementById("spanname").innerHTML="<font size=2px><font color=red>X</font></font>"
			return false;
			}
		}
		function checkpsd(){
			var aa=document.getElementById("psd")
			var reg=/^[a-zA-Z]([-_a-zA-Z0-9]{5,19})+$/;
			if (reg.test(aa.value))
			{document.getElementById("spanpassword").innerHTML="";
			return true;
			}else{
			document.getElementById("spanpassword").innerHTML="<font size=2px><font color=red>X</font></font>"
			return false;
			}
		}
		function checkrepsd(){
			var bb=document.getElementById("repsd").value;
			var aa=document.getElementById("psd").value;
				if (bb==aa)
				{document.getElementById("spanrepassword").innerHTML="";
				return true;
				}else{
				document.getElementById("spanrepassword").innerHTML="<font size=2px><font color=red>密码不一致</font></font>"
				return false;
				}
		}
  </script>
  <body>
   <form action="Users_adduser.action" method="post" onsubmit="return all()">
	         
	           账户名：<input type="text" id="username"name="users.userName" onblur="checkname()"/><span id="spanname"></span><br/>
	           <font color="#CCCCCC">4到16位（字母，数字，下划线，减号）</font><br/>
	          账户密码： <input type="text" id="psd" name="users.userPsd" onblur="checkpsd()"/><span id="spanpassword"></span><br/>
	           <font color="#CCCCCC">6至20位，以字母开头，字母，数字，减号，下划线</font><br/>
	          账户密码： <input type="text" id="repsd" name="users.userPsd" onblur="checkrepsd()"/><span id="spanrepassword"></span><br/>
	           <font color="#CCCCCC">再次输入密码</font><br/>
	           分配角色：<td>
	              <select name="${users.rolestable.rolesId}" >
	              
	                  <option value="1">管理员</option>
	                  <option value="2">员工</option>
	                  <option value="3" selected>客户</option>
	              </select>
	           </td><br/>
	           <!-- <input type="text"  name="users.rolestable.rolesId" /><br/> -->
	           
	          员工信息： <input type="text" placeholder="没有可不填" name="users.emp.empId"/><br/><%-- ${z.emp.empId} --%>
	           <input type="submit"  value="注册"/>
	  </form>
  </body>
</html>
