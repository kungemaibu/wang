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
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="jquery-1.8.3.min.js"></script>
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
  <script type="text/javascript">
   /*  $(function(){  
            $("#yundan ul").hover(  
                   if(){
                   
                   }
            ); 
            }) */
</script>
  <body>
  
      <%--  <p> ${l.modules.modulesId}</p>
       <p> ${l.modules.modulesText}</p>
       <p> ${l.modules.modulesType}</p>
       <p> ${l.modules.modulesUrl}</p> --%>
   
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
                <!-- -----------------------------------------一级--------------------------------------------- -->
                <c:forEach items="${list}" var="l1">
                   <c:if test="${l1.modules.parentId=='ROOT'}">
                <li class="list" id="yundan">
                    <a href="javascript:;">
                        <i class="iconfont">&#xe70b;</i>
                        运单管理
                        <i class="iconfont nav_right">&#xe697;</i>
                    </a>
                    <!-------------------------二级----------------------------->
                    <ul class="sub-menu">
                    <c:forEach items="${list}" var="l11">
                       <c:if test="${l11.modules.parentId==l1.modules.modulesId }"> 
                    
                      
                        <li>
                            <a href="${l11.modules.modulesUrl}">${l11.modules.modulesUrl}
                                <i class="iconfont">&#xe6a7;</i>`
                                运单列表
                            </a>
                        </li>
                        <%-- <li>
                            <a href="ad/${l11.modules.modulesUrl}">${l11.modules.modulesUrl}
                                <i class="iconfont">&#xe6a7;</i>
                                创建运单
                            </a>
                        </li>
                        <li>
                            <a href="ad/${l11.modules.modulesUrl}">
                                <i class="iconfont">&#xe6a7;</i>
                                改单管理
                            </a>
                        </li>
                        <li>
                            <a href="${l111.modules.modulesUrl}">
                                <i class="iconfont">&#xe6a7;</i>
                                订单管理
                            </a>
                        </li> --%>
                        
                    
                     </c:if>
                    </c:forEach>
                    </ul>
                    <!-------------------------二级---------------------------  -->
                </li>
                
                
                
                <!-- ----------------------------------------------------------------------------------------- -->
                
                
                <li class="list" >
                    <a href="javascript:;">
                        <i class="iconfont">&#xe6a3;</i>
                        中转管理
                        <i class="iconfont nav_right">&#xe697;</i>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="./category.html">
                                <i class="iconfont">&#xe6a7;</i>
                                外部中转
                            </a>
                        </li>
                    </ul>
                </li>
                
                <li class="list" >
                    <a href="javascript:;">
                        <i class="iconfont">&#xe6a3;</i>
                        财务管理
                        <i class="iconfont nav_right">&#xe697;</i>
                    </a>
                    <!-------------------------二级---------------------------  -->
                   
                    <ul class="sub-menu" style="display:block;">
                     <c:forEach items="${list}" var="l31">
                       <c:if test="${l31.modules.parentId==l1.modules.modulesId }">
                        <li>
                            <a href="${l31.modules.modulesUrl}">${l31.modules.modulesUrl}
                                <i class="iconfont">&#xe6a7;</i>
                                结算管理
                            </a>
                        </li>
                       <%--  <li>
                            <a href="${l31.modules.modulesUrl}">${l31.modules.modulesUrl}
                                <i class="iconfont">&#xe6a7;</i>
                                资金流水
                            </a>
                        </li>
                        <li>
                            <a href="${l31.modules.modulesUrl}">${l31.modules.modulesUrl}
                                <i class="iconfont">&#xe6a7;</i>
                                客户对账
                            </a>
                        </li>
                        <li>
                            <a href="${l31.modules.modulesUrl}">${l31.modules.modulesUrl}
                                <i class="iconfont">&#xe6a7;</i>
                                日常收支
                            </a>
                        </li> --%>
                        </c:if>
                    </c:forEach>
                    </ul>
                    
                    <!-------------------------二级---------------------------  -->
                </li>
               
                
                <!-- ----------------------------------------------------------------------------------------- -->
                
                <li class="list" >
                    <a href="javascript:;">
                        <i class="iconfont">&#xe6a3;</i>
                        报表中心
                        <i class="iconfont nav_right">&#xe697;</i>
                    </a>
                    <ul class="sub-menu" style="display:none">
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                业务报表
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                业绩报表
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                流量流向报表
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                时效报表
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                财务报表
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                会计报表
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="list" >
                    <a href="javascript:;">
                        <i class="iconfont">&#xe6a3;</i>
                        运营管理
                        <i class="iconfont nav_right">&#xe697;</i>
                    </a>
                    <ul class="sub-menu" style="display:none">
                        <li>
                            <a href="./echarts1.html">
                                <i class="iconfont">&#xe6a7;</i>
                                提货管理
                            </a>
                        </li>
                        <li>
                            <a href="./echarts2.html">
                                <i class="iconfont">&#xe6a7;</i>
                                库存管理
                            </a>
                        </li>
                        <li>
                            <a href="./echarts3.html">
                                <i class="iconfont">&#xe6a7;</i>
                                签收管理
                            </a>
                        </li>
                        <li>
                            <a href="./echarts4.html">
                                <i class="iconfont">&#xe6a7;</i>
                                车辆配载
                            </a>
                        </li>
                        <li>
                            <a href="./echarts5.html">
                                <i class="iconfont">&#xe6a7;</i>
                                到车管理
                            </a>
                        </li>
                        <li>
                            <a href="./echarts6.html">
                                <i class="iconfont">&#xe6a7;</i>
                                送货管理
                            </a>
                        </li>
                        <li>
                            <a href="http://echarts.baidu.com/examples.html">
                                <i class="iconfont">&#xe6a7;</i>
                                回单管理
                            </a>
                        </li>
                         <li>
                            <a href="http://echarts.baidu.com/examples.html">
                                <i class="iconfont">&#xe6a7;</i>
                                退货管理
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="list" >
                    <a href="javascript:;">
                        <i class="iconfont">&#xe6a3;</i>
                        公司管理
                        <i class="iconfont nav_right">&#xe697;</i>
                    </a>
                    <ul class="sub-menu" style="display:none">
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                职位管理
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                线路管理
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                路由管理
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                车线管理
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                客户管理
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                承运商管理
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                司机管理
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                车辆管理
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                费用管理
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                收支方式管理
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                系统设置
                            </a>
                        </li>
                        <li>
                            <a href="./banner-list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                系统日志
                            </a>
                        </li>
                    </ul>
                </li>
                </c:if>
                 </c:forEach>
            </ul>
          </div>
        </div>
        <!-- 左侧菜单结束 -->
       
  </body>
</html>

