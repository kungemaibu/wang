// JavaScript Document
$(function(){
	$(".addcar").click(
			function(){
				//$("#Carform").slideToggle(100);
				$.ajax({
					url:"${pageContext.request.contextPath}/kfk_findcarp.action",
					data:null,
					dataType:"json",
					type:"post",
					success:function(data){
						$("#circuitselect").html("");//清空下拉框内容
                         var circuit=data.clist;//获取clist集合
                         var payment=data.plist;//获取plist集合
                         for(var i=0;i<circuit.length;i++){//循环clist
                         	var obj=circuit[i];//获取当前对象
                         	var option="<option value="+obj.circuitId+">"+
                         	   obj.circuitName
                         	+"</option>";
                         	$("#circuitselect").append(option);
                         }  
                         $("#paymentselect").html("");//清空
                         for(var i=0;i<payment.length;i++){//循环plist
                          	var obj=payment[i];//获取当前对象
                          	var option="<option value="+obj.paymentId+">"+
                          	   obj.paymentName
                          	+"</option>";
                          	$("#paymentselect").append(option);
                          }  
					}
				})
			}
	)
	/*添加路线*/
	$(".addcircui").click(function(){
		$.ajax({
			url:"${pageContext.request.contextPath}/kfk_findcarp.action",
			data:null,
			dataType:"json",
			type:"post",
			success:function(data){
				$(".branchselect").html("");
				 var branch=data.blist;
				 for(var i=0;i<branch.length;i++){
						var obj=branch[i];//获取当前对象
                      	var option="<option>"+
                      	   obj.branchName
                      	+"</option>";
                      	$(".branchselect").append(option);
				 }
			}
		})
	})
	//提交添加路线
       $(".saveCircui").click(function(){
    	   $.ajax({
    		   url:"${pageContext.request.contextPath}/kfk_saveCircuit.action",
    		   data:$("#Circuiform").serialize(),//序列化表单里的内容
    		   dataType:"text",
    		   type:"post",
    		   success:function(data){
    			      alert(data);
    		   }
    	   })
       })
	//添加车辆
    $(".saveCar").click(function(){
          $.ajax({
               url:"${pageContext.request.contextPath}/kfk_saveCar.action",//提交地址
               data:$("#Carform").serialize(),//将表单里的内容序列化字符串
               dataType:"text",//返回数据类型
               type:"post",//提交方式
               success:function(data){//成功后执行的函数
               alert(data);
               }
          })
     })
     //删除车辆
     $(".deleteCar").click(function(){
               var id=$(this).val();
               var delet=$(this).parent().parent();
               $.ajax({
                      url:"${pageContext.request.contextPath}/kfk_deleteCar.action",
                      data:{"v.vehicleId":id},
                      dataType:"text",
                      type:"post",
                      success:function(data){
                      delet.remove();//删除该标签所有内容
                      alert(data);
                      }
               })
     })
     //添加司机
    $(".saveDriving").click(function(){
    	$.ajax({
            url:"${pageContext.request.contextPath}/kfk_saveDriving.action",  
            data:$("#Drivingform").serialize(),
            dataType:"text",
            type:"post",
            success:function(data){
            	alert(data);
            }
    	})
    })
    //删除司机信息
    $(".deleteDriving").click(function(){
               var id=$(this).val();
               var delet=$(this).parent().parent();
               $.ajax({
                      url:"${pageContext.request.contextPath}/kfk_deleteDriving.action",
                      data:{"d.driverId":id},
                      dataType:"text",
                      type:"post",
                      success:function(data){
                             delet.remove();
                             alert(data);
                      }
               })
       })
     
       //删除路线"deleteCircuit"
       $(".deleteCircuit").click(function(){
    	   var id=$(this).val();
    	   var tr=$(this).parent().parent();
    	   $.ajax({
    		   url:"${pageContext.request.contextPath}/kfk_deleteCircuit.action",
    		   data:{"c.circuitId":id},
    		   dataType:"text",
    		   type:"post",
    		   success:function(data){
    			   alert(data);
    			   tr.remove();
    		   }
    	   })
       })
       
       $(".findcircuit").click(function(){
    	   var id=$(this).val();
    	   $.ajax({
    		   url:"${pageContext.request.contextPath}/kfk_findcircuit.action",
    		   data:{"c.circuitId":id},
    		   dataType:"json",
    		   type:"post",
    		   success:function(data){
    			   alert("dfsfde");
    		   }
    	   })
       })
       
       //添加配载
       $(".addcarstwoage").click(function(){
    	       $("#carstwoage").slideToggle(100);
    	       $("#carstwoPath").html("");
    	       $("#carstwobranch").html("");
    	       $.ajax({
        		   url:"${pageContext.request.contextPath}/kfk_findcarp.action",
        		   data:null,
        		   dataType:"json",
        		   type:"post",
        		   success:function(data){
        			   var clist=data.clist,
        			       blist=data.blist;
        			   for(var i=0;i<clist.length;i++){
        				   var obj=clist[i];
        				   var op="<option value="+obj.circuitId+">"+obj.circuitName+"</option>";
        				   $("#carstwoPath").append(op);
        			   }
        			   for(var i=0;i<=blist.length;i++){
        				   var obj=blist[i];
        				   var op="<option value="+obj.branchId+">"+obj.branchName+"</option>";
        					   $("#carstwobranch").append(op);
        			   }
        		   }
        	   })
       })
       
       
})




 $(window).on('load', function () {
    	    $('#usertype').selectpicker({
    	        'selectedText': 'cat'
    	    });
    	});
    