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
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/"/>
<link rel="stylesheet" type="text/css" id="customSkin"/>
<!--框架必需end-->

<!-- 表单验证start -->
<script src="<%=path%>/libs/js/form/validationRule.js" type="text/javascript"></script>
<script src="<%=path%>/libs/js/form/validation.js" type="text/javascript"></script>
<!-- 表单验证end -->

</head>
<body  style="overflow:hidden;">
<form>   
<table width="100%" style="line-height: 50px;">
	<tr>  
	<td class="ali03">输入原始登录密码：</td> 
	<td>
		<input onblur="checkOldpwd()" type="password" id="oldpwd"  maxlength="16"/> 
		<input type="hidden" id="oldpwd2"  value="${loginedUser.pwd}"/> 
		<input type="hidden" id="id"  value="${loginedUser.id}"/>   
		<span style="color: red;">*</span>
	</td> 
	</tr>
	<tr>
	<td class="ali03">输入新登录密码：</td>
	<td><input onblur="checkNewPwd()" type="password" id="pwd"  maxlength="16"/> <span style="color: red;">*</span>
	</td> 
	</tr>
	<tr> 	
	<td class="ali03">再次输入新登录密码：</td> 
	<td><input onblur="checkRepwd()" type="password" id="repwd" maxlength="16"/> <span style="color: red;">*</span> 
	</td>
	</tr> 
	<tr>   
		<td colspan="2" align="center"><span id="em" style="color:red;"></span></td> 
	</tr>
</table>
</form>
<script>  
var checkPwd = /^[\@A-Za-z0-9\!\#\$\%\^\&\*\.\~]{6,16}$/;  
var checks = false;
var em = document.getElementById("em");
function validateForm(){   
	checkOldpwd();
	if(checks){
		checkNewPwd(); 
		if(checks){
			checkRepwd();
			if(checks){
				$.post("<%=path%>/adminusers!updatePwd.action",{"pwd":$("#repwd").val(),"id":$("#id").val()},function(result){
		    		if(result.isPass){  
		    			top.Dialog.confirm("修改密码成功，是否关闭本窗口",function(){top.Dialog.close(); },function(){location.reload();});
		    		}else{  
		    			top.Dialog.confirm("修改密码失败，是否重试",function(){location.reload(); },function(){top.Dialog.close();});  
		    		}
		    	});
			}
		}
	}
}
function checkOldpwd(){
	var oldpwd = $("#oldpwd").val(); 
	var oldpwd2 = $("#oldpwd2").val(); 
	//旧密码匹配
		if(oldpwd==oldpwd2){
			$("#oldpwd").css("border","");  
			checks = true; 
			em.innerHTML = ""; 
		}else{
			$("#oldpwd").css("border","1px red solid"); 
			checks = false; 
			em.innerHTML = "旧密码不正确";
		} 
}
function checkNewPwd(){
	var pwd = $("#pwd").val(); 
	//新密码 
	if(checkPwd.test(pwd)){   
		$("#pwd").css("border",""); 
		checks = true; 
		em.innerHTML = ""; 
	}else{
		$("#pwd").css("border","1px red solid"); 
		checks = false;
		em.innerHTML = "新密码格式不正确";
	}
}
function checkRepwd(){
	var repwd = $("#repwd").val(); 
	var pwd = $("#pwd").val(); 
	//重复密码
	if(checkPwd.test(repwd)){    
		if(repwd==pwd){ 
			$("#repwd").css("border",""); 
			checks = true; 
			em.innerHTML = "";
		}else{
			$("#repwd").css("border","1px red solid"); 
			checks = false;
			em.innerHTML = "两次密码输入不一致";
		}
	}else{
		$("#repwd").css("border","1px red solid"); 
		checks = false;
		em.innerHTML = "重复新密码格式不正确";
	}
}
</script> 
</body>
</html>