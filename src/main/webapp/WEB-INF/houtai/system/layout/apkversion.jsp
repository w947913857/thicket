<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/"
	scrollerY="false" />
<link rel="stylesheet" type="text/css" id="customSkin" />
<!--框架必需end-->
</head>
<body>
<div style="width: 100%">
丛林闲居Apk版本：
<input id="clxj" type="text" /> 
<input onclick="updateApkVersion(1)" type="button" value="修改" style="margin-left: 10px;" />
<input  type="button" value="上传新版本" style="margin-left: 10px;" onclick="dialog(1)" />
<br />
<br />
司&nbsp;&nbsp;机Apk版本：
<input id="car" type="text" />
<input onclick="updateApkVersion(2)" type="button" value="修改" style="margin-left: 10px;" />
<input  type="button" value="上传新版本" style="margin-left: 10px;" onclick="dialog(2)"/>
<br />
<br />
订&nbsp;&nbsp;房Apk版本：
<input id="orderclxj" type="text" />
<input onclick="updateApkVersion(3)" type="button" value="修改" style="margin-left: 10px;" />
<input  type="button" value="上传新版本" style="margin-left: 10px;" onclick="dialog(2)"/>
<br /> 
</div> 
<script type="text/javascript">
getVersion(); 
var clxj;
var car;
var orderclxj;
function getVersion(){
	$.ajax({  
        type : "post",  
         url : "<%=path%>/adminusers!getApkversion.action",  
         data: {},
         dataType: "json",
         async : false,   
         success : function(results){    
        	 clxj = results.clxj;
        	 car = results.car;
        	 orderclxj = results.orderclxj;
             document.getElementById("clxj").value= clxj;   
             document.getElementById("car").value= car;
             document.getElementById("orderclxj").value= orderclxj;      
             }  
    }); 
}  
function updateApkVersion(line){
	var checks = false;
	var clxj2 = $("#clxj").val();
	var car2 = $("#car").val();
	var orderclxj2 = $("#orderclxj").val();
	switch (line) {  
	case 1:
		if(clxj2==clxj){ 
			checks = false;
			top.Dialog.alert("丛林闲居Apk版本号没有改变");
			}else{
				clxj1 = clxj.replace(/\./g,"");
				clxj21 = clxj2.replace(/\./g,"");
				if(clxj21>clxj1){ 
					checks = true; 	
				}else{ 
					top.Dialog.alert("丛林闲居Apk新版本号必须高于旧版本哦");
					checks = false; 
				}
			}
		break;
	case 2:
		if(car2==car){
			checks = false;
			top.Dialog.alert("司机Apk版本号没有改变");
			}else{
				car1 = car.replace(/\./g,"");
				car21 = car2.replace(/\./g,"");
				if(car21>car1){ 
					checks = true; 	
				}else{ 
					top.Dialog.alert("司机Apk新版本号必须高于旧版本哦");
					checks = false; 
				}
			}
		break;
	case 3:
		if(orderclxj2==orderclxj){
			checks = false;
			top.Dialog.alert("订房Apk版本号没有改变");
			}else{
				orderclxj1 = orderclxj.replace(/\./g,"");
				orderclxj21 = orderclxj2.replace(/\./g,"");
				if(orderclxj21>orderclxj1){   
					checks = true; 	
				}else{  
					top.Dialog.alert("订房Apk新版本号必须高于旧版本哦");
					checks = false; 
				}
			}
		break;
	}
	if(checks){
	$.ajax({  
        type : "post",   
         url : "<%=path%>/adminusers!updateApkversion.action",
			data : {"clxj" : clxj2,"car" : car2,"orderclxj" : orderclxj2}, 
			dataType : "json",
			async : false,
			success : function(results) {
				isUpdate = results.isUpdate;
				if (isUpdate == true || isUpdate == "true") {
					top.Dialog.alert("修改成功！");
				} else {
					top.Dialog.alert("修改失败！");
				}
			}
	});
	}
}	  
function dialog(type){ 
	switch (type) {
	case 1:
		top.Dialog.open({URL:"<%=path%>/apk/upload/uploadapk1.jsp",Title:"上传丛林闲居Apk",Width:300,Height:100});   
		break;
	case 2:
		top.Dialog.open({URL:"<%=path%>/apk/upload/uploadapk2.jsp",Title:"上传司机Apk",Width:300,Height:100});   
		break;
	case 3:   
		top.Dialog.open({URL:"<%=path%>/apk/upload/uploadapk3.jsp",Title:"上传订房Apk",Width:300,Height:100});   
		break;

	}
}
</script>
</body>
</html>