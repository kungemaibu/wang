<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	-->
	<style type="text/css">
	    *{padding:0;margin:0;}  
	    .table #thead tr th{
		   background:#999;
		 }
		.table td,th{
		       text-align:center;
		}
		 #carstwoage input{
		       margin:5px;    
		 }
		 /*[target=_blank] 选择 target="_blank" 的所有元素。 */
		 [type=number]{
		      width:60px;
		 }
	</style>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
  </head>
  <body>
  <script type="text/javascript" src="js/jquery-1.11.3.min.js" charset="utf-8"></script>
 <script type="text/javascript" src="js/index.js" charset="utf-8"></script>
<script src="js/jquery-2.1.1.js"></script>
<script src="js/bootstrap.min1.js"></script>
		 <h4>
		     <button class="addcar"  data-toggle="modal" data-target="#myModal">添加车辆</button>
		     <button class="adddrive"  data-toggle="modal" data-target="#driving">添加司机</button>
		     <button class="addcircui"  data-toggle="modal" data-target="#circuit">添加线路</button>
		     <button class="addcarstwoage">添加配载</button>
		 </h4>
	    <a href="kfk_findCar.action">车辆查询</a>
	    <a href="kfk_findDriving.action">司机查询</a>
	    <a href="kfk_findCircuit.action">线路查询</a>
	<!-- 添加配载 -->
	    <div id="carstwoage" style="display:none;background:#f0f0f0;padding:15px;">
	                          分批处理:<input  type="text" name="carstwo.startBatch">                
	                          出发时间:<input type="data" name="carstwo.departureTime">
	                          配载车辆:<select id="carstwoVehicle" name="carstwo.vehicle.vehicleId"></select> 
	                          网点:<select id="carstwobranch" name="carstwo.branch.branchId"></select>
                                      状态:<select id="carstwoStatus" name="carstwo.startBatchStatus.startBatchStatusId"></select>                                        
	                          车线:<select id="carstwoPath" name="carstwo"></select>
	                          司机:<select id="carstwoDriver" name="carstwo.driving.drivingId"></select><br/> 
	                          装载数量:<input type="number" value="0" min="0" name="carstwo.truckLoadingNum">件                
	                          装载重量:<input type="number" value="0"  min="0"  name="carstwo.theLoadingWeight">kg(千克/公斤)                                 
	                          装载体积:<input type="number"  value="0"  min="0" name="carstwo.loadingVolume">m<sup>3</sup>/L(立方米/升)
	                          备注:<input type="text" name="carstwo.remarks"><br>
	                         通流支付方式:<input type="number"  min="0" name="carstwo.currentPayment">                
	                         费用:<input type="number"  value="0"  min="0" name="caratwo.cashCharge">
	                         不懂:<input type="number"  value="0"  min="0" name="carstwo.toPayFreight"> 
	                         又是不懂:<input type="number" value="0"  min="0"  name="carstwo.vehicleTransportCosts">                                
	                         还是不懂:<input type="number"  value="0" min="0" name="carstwo.backFreight"><br>
	                         又是啥:<input type="number"  value="0"  min="0" name="carstwo.totalTransportationCost">                 
	         
	    </div> 
	<!-- 结束配载 -->
     <table class="table table-bordered table-hover" style="width:2400px;">
        <thead id="thead">
            <tr>
              <th>车辆编号</th> <th>不知道</th> <th>车辆来源</th> 
              <th>支付方式</th> <th>线路</th> <th>车辆类型</th> <th>品牌</th>
              <th>声明</th> <th>放这</th> <th>荷载</th> <th>体积(容量)</th>
              <th>车辆长度</th> <th>车辆宽度</th> <th>车辆高度</th> <th>车辆颜色</th> <th>日期</th>
              <th>车辆识别码</th> <th>发动机编号</th> <th>操作</th> <th>保险</th> <th>保险开始日期</th> <th>保险结束日期</th>
              <th>单位</th>  <th>单位地址</th> <th>车主电话</th> <th>编辑车辆</th>
            </tr>
        </thead>
        <tbody style="width:1000px" id="tbody">
        <c:forEach items="${car.list}"  var="c">
        <tr>
           <td>${c.vehicleId}</td> <td>${c.vehicleChe}</td> <td>${c.vehicleSource}</td> 
           <td>${c.payment.paymentName}</td>
          <td>${c.circuit.circuitName}</td>
           <td>${c.motorcycle}</td>
           <td>${c.brand}</td> <td>${c.statement}</td> <td>${c.headstock}</td> <td>${c.vload}</td> <td>${c.vbulk}</td> 
           <td>${c.vlength}</td> <td>${c.vwidth}</td> <td>${c.vheight}</td> <td>${c.vcolour}</td> <td>${c.vriqi}</td> 
           <td>${c.vvin}</td> <td>${c.vengine}</td> <td>${c.voperation}</td> <td>${c.insurance}</td> <td>${c.insuranceK}</td>
           <td>${c.insuranceJ}</td> <td>${c.carDanWei}</td> <td>${c.carAdress}</td> <td>${c.carPhone}</td> 
           <%-- <td>
                 <c:forEach items="${c.drivings}" var="d">
                    <a href="kfk_finddriving?d.driverId=${d.driverId}" title="点击查看司机信息">${d.driverName}</a>，
                 </c:forEach>
           </td> --%>
           <td>
               <a href="kfk_findcar.action?v.vehicleId=${c.vehicleId}"><input type="button" value="更改信息"/></a>
               <button class="deleteCar" value="${c.vehicleId}">删除信息</button>
           </td> 
        </tr>
        </c:forEach>
        </tbody>
        <tfoot id="tfoot">
           <tr>
             <th colspan="3"><a href="kfk_findCar.action?p.nowPage=1">首页</a></th> 
             <th colspan="3"><a href="kfk_findCar.action?p.nowPage=${car.prevPage}">上一页</a></th>
             <th colspan="3"><a href="kfk_findCar.action?p.nowPage=${car.naxtPage}">下一页</a></th> 
             <th colspan="3"><a href="kfk_findCar.action?p.nowPage=${car.lastPage}">尾页</a></th>
             <th colspan="3">
                 <form action="kfk_findCar.action" method="post">
                                                                  跳转到第<input type="number"  max="${car.lastPage}" value="${car.nowPage}" min="1" name="p.nowPage"/>页
                          <input type="submit" value="提交" class="btn">
                 </form>
             </th>
             <th colspan="3">第${car.nowPage}页/共${car.lastPage}页</th> 
           </tr>
        </tfoot>
        </table>
         <!-- 添加车辆表单开始 -->
         <!-- 模态框（Modal） -->
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
										&times;
									</button>
									<h4 class="modal-title" id="myModalLabel">
										添加车辆
									</h4>
								</div>
								<form id="Carform">
								<div class="modal-body">
							                   线路:<select id="circuitselect" name="v.circuit.circuitId"></select>
					                                          支付方式  :<select id="paymentselect" name="v.payment.paymentId" class="glyphicon-option-vertical"></select>
					                                           啥:<input type="text"name="v.vehicleChe"/><br><br>
					                                           车辆来源:<input type="text" name="v.vehicleSource"/>
					                                           声明:<input type="text" name="v.statement"/><br/><br/>
					                                          主轴箱:<input type="text" name="v.headstock"/> 
					                                           类型:<input type="text"  name="v.motorcycle"/><br/><br/>
					                                           品牌:<input type="text" name="v.brand"/>
					                                           荷载:<input type="text" name="v.vload"/><br/><br/>                         
					                                           容量:<input type="text" name="v.vbulk"/>
					                                           宽度:<input type="text" name="v.vwidth"/><br/><br/>
					                                           高度:<input type="text"  name="v.vheight"/>
					                                           长度:<input type="text"  name="v.vlength"/> <br/><br/>                      
					                                           颜色:<input type="text"  name="v.vcolour"/>
					                                           日期:<input type="date" name="v.vriqi"/><br/><br/>
					                                           车辆识别码:<input type="text" name="v.vvin"/>
					                                           发动机编号:<input type="text"  name="v.vengine"/><br/><br/>
					                                           不知道:<input type="text" name="v.voperation"/>
					                                           保险:<input type="text" name="v.insurance"/><br/><br/>
					                                           保险开始日期:<input type="date" name="v.insuranceK"/>
					                                           保险结束日期:<input type="date"  name="v.insuranceJ"/><br/><br/>
					                                           单位:<input type="text" name="v.carDanWei"/>
					                                           地址:<input type="text"  name="v.carAdress"/><br/><br/>
					                                           车主电话:<input type="text"  name="v.carPhone"/>            
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">关闭
									</button>
									<button type="button" class="saveCar btn btn-primary">
										提交更改
									</button>
								</div>
								</form>
							</div><!-- /.modal-content -->
						</div><!-- /.modal -->
					</div>
					</div>
        <!-- 添加车辆表单结束 -->
        <!-- 添加司机表单开始 -->
        <!-- 模态框（Modal） -->
			<div class="modal fade" id="driving" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
								&times;
							</button>
							<h4 class="modal-title" id="myModalLabel">
								添加司机
							</h4>
						</div>
						<form id="Drivingform">
						<div class="modal-body">
						   司机姓名：<input type="text" name="d.driverName"/>
					              司机电话：<input type="text"  name="d.driverPhone"/><br><br>
					              司机性别：<input type="text" name="d.driverSex"/>
					              司机地址：<input type="text"  name="d.driverAdress"/>
					              开始日期：<input type="Date" name="d.contractK"/><br><br>
					              结束日期：<input type="Date"  name="d.contractJ"/>
				                          备注： <input type="text"  name="d.driverBei"/><br><br>
					              添加日期：<input type="text"  name="d.drivingDate"/>
					              司机...：<input type="text"  name="d.drivingNum"/><br><br>
			             ... <input type="text"  name="d.drivingChe"/><br><br>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">关闭
							</button>
							<button type="button" class="saveDriving btn btn-primary">
								提交更改
							</button>
						</div>
						</form>
					</div><!-- /.modal-content -->
				</div><!-- /.modal -->
			</div>
       <!--  添加司机表单结束 -->
       <!-- 添加线路表单开始 -->
                <!-- 模态框（Modal） -->
				<div class="modal fade" id="circuit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
									&times;
								</button>
								<h4 class="modal-title" id="myModalLabel">
									添加线路
								</h4>
							</div>
							 <form id="Circuiform">
							<div class="modal-body">
							                 线路名称:<input type="text" name="c.circuiName"/>
							                 始发点:<select class="branchselect glyphicon-option-vertical"></select>→
							                  终点:<select  class="branchselect glyphicon-option-vertical"></select>
							         <br>
							                 网点:<select name="c.branch.branchId" class="branchselect glyphicon-option-vertical"></select>
							                  里程:<input type="number" name="c.mileage"><br/>
							                  时效:<input type="number" name="c.aging"/>
							                  单价:<input type="number" name="c.accounting"/><br/>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">关闭
								</button>
								<button type="button" class="saveCircui  btn  btn-primary">
									提交更改
								</button>
							</div>
							</form>
						</div><!-- /.modal-content -->
					</div><!-- /.modal -->
				</div>
        <!-- 添加线路表单结束 -->
        
        
        <!-- <div class="form-group">
                           <label class="col-sm-3 control-label">客资类型：</label>
                            <div class="col-sm-4">
                                <select id="usertype" name="usertype" class="selectpicker show-tick form-control" multiple data-live-search="false">
                                        <option value="0">苹果</option>
                                        <option value="1">菠萝</option>
                                        <option value="2">香蕉</option>
                                        <option value="3">火龙果</option>
                                        <option value="4">梨子</option>
                                        <option value="5">草莓</option>
                                        <option value="6">哈密瓜</option>
                                        <option value="7">椰子</option>
                                        <option value="8">猕猴桃</option>
                                        <option value="9">桃子</option>
                                </select>
                            </div>
                          </div> -->
  </body>
</html>
<!-- Latest compiled and minified CSS -->
<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/css/bootstrap-select.min.css"> -->

<!-- Latest compiled and minified JavaScript -->
<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/js/bootstrap-select.min.js"></script> -->

<!-- (Optional) Latest compiled and minified JavaScript translation files -->
<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/js/i18n/defaults-*.min.js"></script> -->
  
  
  
  
  
  
  
  
  
  
  
  
  
  
