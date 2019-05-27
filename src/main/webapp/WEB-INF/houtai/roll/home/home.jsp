<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*" %>  
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

<!--基本选项卡start-->
<script type="text/javascript" src="<%=path%>/libs/js/nav/basicTab.js"></script>
<!--基本选项卡end-->
 
</head> 
<body>     
<%Date date = new Date(); %>   
 <div class="basicTab" style="width: 100%;height: 100%;" id="check">   
		<div name="滚动图1" align="center">     
			<img  src="<%=path%>/roll/home/lbt1.png?id=<%=date %>" width="100%" height="380px;">        
			<input type="button" value="更换" onclick="changeImg(1)" style="margin-top: 30px;"/>
		</div>       
		<div name="滚动图2" align="center">
			 <img  src="<%=path%>/roll/home/lbt2.png?id=<%=date %>" width="100%" height="380px;">
			 <input type="button" value="更换" onclick="changeImg(2)" style="margin-top: 30px;"/>  
		</div>
		<div name="滚动图3" align="center">
			<img  src="<%=path%>/roll/home/lbt3.png?id=<%=date %>" width="100%" height="380px;">
			<input type="button" value="更换" onclick="changeImg(3)"/> 
		</div>  
		<div name="滚动图4" align="center"> 
			<img  src="<%=path%>/roll/home/lbt4.png?id=<%=date %>" width="100%" height="380px;">
			<input type="button" value="更换" onclick="changeImg(4)"/> 
		</div>
		<div name="滚动图5" align="center">          
			<img  src="<%=path%>/roll/home/lbt5.png?id=<%=date %>" width="100%" height="380px;">
			<input type="button" value="更换" onclick="changeImg(5)"/> 
		</div>
	</div>
<script type="text/javascript"> 
window.onload = getLine();  
//获取地址栏
function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
     var str = url.substr(1);
      strs = str.split("&");
      for(var i = 0; i < strs.length; i ++) {
      	 theRequest[strs[i].split("=")[0]]=(strs[i].split("=")[1]);
      	 }
       } 
     return theRequest;
}
function changeImg(line){
	switch (line) { 
	case 1: 
		top.Dialog.open({URL:"<%=path%>/roll/home/update/update1.jsp",Title:"滚动图1",Width:300,Height:100});   
		break;  
	case 2:
		top.Dialog.open({URL:"<%=path%>/roll/home/update/update2.jsp",Title:"滚动图2",Width:300,Height:100});    
		break; 
	case 3:   
		top.Dialog.open({URL:"<%=path%>/roll/home/update/update3.jsp",Title:"滚动图3",Width:300,Height:100}); 		
		break;
	case 4:   
		top.Dialog.open({URL:"<%=path%>/roll/home/update/update4.jsp",Title:"滚动图4",Width:300,Height:100}); 
		break; 
	case 5:    
		top.Dialog.open({URL:"<%=path%>/roll/home/update/update5.jsp",Title:"滚动图5",Width:300,Height:100}); 
		break;

	}
}	
function updateLine(line){  
	var url = location.href;
	url = url.split('?')[0]; 
	location.href = url+"?line="+line;      
}
function getLine(){
	var Request = new Object();
	Request = GetRequest();  
	var returnUrl;
	returnUrl = Request['line']; 
	selLine(returnUrl); 
}   
function selLine(line){    
	$("#check").basicTabSetIdx(line);
}  
</script>
</body>
</html>