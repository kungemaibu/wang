<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
     li{
			list-style: none;
		}
		a{
			text-decoration: none;
		}
    #yundan ul{
       display: none; 
    }
    #yundan:hover ul{
       display: block; 
    }
</style>
  </head>
  
  <body>
    <!-- 左侧菜单开始 -->
        <div class="left-nav">
          <div id="side-nav">
            <ul id="nav">
                <li class="list" current>
                    <a href="./index.html">
                        <i class="iconfont">&#xe761;</i>
                        欢迎页面
                        <i class="iconfont nav_right">&#xe697;</i>
                    </a>
                </li>
                
                <!-- -----------------------------------------一级----------------------------------------------->
                
                <c:forEach items="${list}" var="l1">
                   <c:if test="${l1.modules.parentId=='ROOT'}">
                <li class="list" id="yundan">
                    <a href="javascript:;">
                        <i class="iconfont">&#xe70b;</i>
                  ${l1.modules.modulesText}
                        <i class="iconfont nav_right">&#xe697;</i>
                    </a>
                    <!-------------------------二级----------------------------->
                    
                    
                    <ul class="sub-menu">
                    <c:forEach items="${list}" var="l11">
                       <c:if test="${l11.modules.parentId==l1.modules.modulesId }"> 
                    
                        <li>
                            <a href="${l11.modules.modulesUrl}"> 
                                <i class="iconfont">&#xe6a7;</i>
                                ${l11.modules.modulesText}
                            </a>
                        </li>
                    
                     </c:if>
                    </c:forEach>
                    </ul>
                    <!-------------------------二级----------------------------->
                </li>
                
                
                
                </c:if>
                 </c:forEach>
            </ul>
          </div>
        </div>
        <!-- 左侧菜单结束 -->
  </body>
</html>
