<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>丛林闲居</title>
    <link rel="stylesheet" href="style/cy.css">
    <link rel="stylesheet" href="style/style.css">
</head>
<body>
<!--首页TOP-->
    <div class="yc-txdd1">
         
        <!--首页banner-->
         <jsp:include  page="head.jsp" />
               <script type="text/javascript">
function Alllogin(){
	window.location.href = "login.jsp";
} 
function loginOut(){
	window.location.href = "<%=path%>/reguser!loginOut.action?returnurl=/login.jsp";
}
 </script>
        <!--首页轮播图-->



        <div class="passwrod-seek-i seek-top" id="div1">
            <ul class="seek">
                <li class="sk-i">找回登录密码：</li>
                <li class="sk-ii sk-b">第一步：填写账号</li>
                <li class="sk-ii sk-c">第二步：验证</li>
                <li class="sk-ii sk-c">第三步：设置新密码</li>
                <li class="sk-ii sk-c">第四步：设置成功</li>
            </ul>
            <ul class="seek-i">
                <li class="seek-i-one">请输入您的账号</li> 
                <li class="seek-i-two">手机号<input onblur="checkPhone()" maxlength="11" type="text" id="phone" /><span id="span1" class="pwa-pro">提示：用于绑定的手机号</span><span style="color: red"  id="span2"></span></li>
                <li class="seek-i-three">验证码<input maxlength="4" type="text" id="yzm" onblur="checkYZM()"/><img id="yzmImg" style="margin-left: 10px" width="101"  height="36" src="<%=path%>/reguser!exyzmStr.action"/><a href="javascript:void(0)" style="cursor:hand" class="pwa-pro" onclick="changeYzm()">换一换</a><span style="margin-left: 10px;color: red;" id="span3"></span></li>
                <li class="seek-i-four"><input type="button" value="下一步"  onclick="checkdiv1()"/></li>
            </ul>
        </div>

        <div class="passwrod-seek-ii seek-top" style="display:none" id="div2">  
            <ul class="seek">
                <li class="sk-i">找回登录密码：</li>
                <li class="sk-ii sk-a">第一步：填写账号</li>
                <li class="sk-ii sk-b">第二步：验证</li>
                <li class="sk-ii sk-c">第三步：设置新密码</li>
                <li class="sk-ii sk-c">第四步：设置成功</li>
            </ul>
            <ul class="seek-ii">
                <li class="seek-ii-one"><em id="em1"></em></li>
                <li class="seek-ii-two">绑定手机<span class="dness" id="div2phone"></span></li>
                <li class="seek-ii-three">验证码<input onblur="checkphoneYZM()" id="phoneYZM" maxlength="6" type="text" placeholder="请输入6位数的验证码"/><input type="button" id="random" value="免费获取验证码" onclick="getNumRandom()"/><em id="em2" style="margin-left:20px;color:red;"></em></li>
                <li class="seek-ii-four"><input type="button" value="下一步" onclick="checkdiv2()"/></li>
            </ul>
        </div>



        <div class="passwrod-seek-iii seek-top" style="display:none"   id="div3">
            <ul class="seek">
                <li class="sk-i">找回登录密码：</li>
                <li class="sk-ii sk-a">第一步：填写账号</li>
                <li class="sk-ii sk-a">第二步：验证</li>
                <li class="sk-ii sk-b">第三步：设置新密码</li>
                <li class="sk-ii sk-c">第四步：设置成功</li>
            </ul>
            <ul class="seek-iii-two">
                <li class="skthree-newpwa">设置新密码<input maxlength="16" id="pwd" type="password" onblur="checkpwd()" placeholder="请输入6-16位数的密码"/><span class="pwa-pro" id="span4" style="color: red;"></span></li>
                <li class="skthree-conpwa">确认密码<input maxlength="16" id="repwd" type="password" placeholder="请再次输入密码" onblur="checkrepwd()"/><span class="pwa-pro" id="span5" style="color: red;"></span></li>
                <li class="skthree-but"><input type="button" value="确认" onclick="czpwd()"/></li>
            </ul>
        </div>
 <%@ include  file="bottom.jsp"%>
    </div>


<div class="tcc none" id="okok">
    <div class="cgxd4">
            <div class="cgxd4-top"><p class="one"><img src="images/zhmm4_03.jpg">提示</p><p class="two"><img src="images/14_01.png" class="close3"></p></div>
            <div class="cgxd4-main">
                您的登录密码设置成功！
            </div>
            <div class="cgxd4-buttom">
                <a href="javascript:void(0)" onclick="goLogin()">确&nbsp;认</a>  
            </div>
        </div>

</div>
<script src="js/jquery.min.js"></script>
<script src="../../js"></script>
<script type="text/javascript">
var checks = false;//全局变量，用于判断是否能下一步
var wait=120;//倒计时获取验证码时间
	//验证手机号码是否存在
	function checkPhone(){
		var span1 = document.getElementById("span1");
		var span2 = document.getElementById("span2");
		var phone = $('#phone').val();
		var phoneNum = /^(0|86|17951)?(13[0-9]|15[012356789]|17[678]|18[0-9]|14[57])[0-9]{8}$/; //手机号码
		var phoneNumCheck = !!(phone).match(phoneNum);
		if(!phoneNumCheck){
			span1.innerHTML ="";  
			span2.innerHTML ="手机号码格式有误"; 
			checks = false;
		}else{
			$.ajax({  
		        type : "post",  
		         url : "<%=path%>/reguser!checkMobile.action",  
		         data: {"reguser.username":phone}, 
		         dataType: "json",
		         async : false,   
		         success : function(results){  
		        	if(results.status==true||results.status=="true"){
		        		checks = false;
		        		span1.innerHTML ="";  
		    			span2.innerHTML ="该号码还未注册，请核对"; 
			        	}else{
			        		checks = true;
			        		span1.innerHTML ="";  
			    			span2.innerHTML =""; 
				        	}
		         }   
		    }); 
		}
	}
	//改变图形验证码
	function changeYzm(){
		$("#yzmImg").attr("src","<%=path%>/reguser!exyzmStr.action?x=" + Math.random());
			}
	//检验图形验证码
	function checkYZM(){
		var yzm = $('#yzm').val();
		var span3 = document.getElementById("span3");
		if(yzm.length<4){
			checks = false;
			span3.innerHTML="请输入正确的验证码格式";
			}else{
				$.ajax({  
			        type : "post",  
			         url : "<%=path %>/reguser!checkLoginYZM.action",  
			         data: {"YZM":yzm}, 
			         dataType: "json",
			         async : false,   
			         success : function(results){  
			        	if(results.status==true||results.status=="true"){
			        		checks = true;
			        		span3.innerHTML ="";  
				        	}else{
				        		checks = false;
				        		span3.innerHTML ="验证码不正确";   
					        }
			         }   
			    }); 
			}
		}
	//检验第一步
	function checkdiv1(){
		checkPhone();
		if(checks){
			checkYZM();
			if(checks){
				var phone = $('#phone').val();
				document.getElementById("div1").style.display="none";
				document.getElementById("div2phone").innerHTML =phone; 
				getNumRandom();
				document.getElementById("div2").style.display="block";
				}
			}
		}
	//获取验证码
	function getNumRandom(){
		var random= document.getElementById("random"); //发送按钮
		time(random); 
		var ok = "<img src='images/gougou.jpg'/>验证码已经发送到你的手机，请注意查收！"; //发送短信成功提示语
		var em1 = document.getElementById("em1");//显示框 
		var phone = $('#phone').val();
		$.post("<%=path %>/reguser!getNumRandom.action",
				{"reguser.username":phone},  
				  function(result){
					  if(result == null){
						  em1.innerHTML = "服务器发生了点小意外，请刷新页面试试";
						  checks = false;
					  }
					  if(result.status=="true"||result.status==true){
						  em1.innerHTML = ok;
						  checks = true; 
					  }else{
						  em1.innerHTML = result.message;
						  checks = false;
					  }
				  },"json");
		}
	//倒计时按钮
	function time(o) {
	        if (wait == 0) {
	            o.removeAttribute("disabled");            
	            o.value="免费获取验证码";
	            wait = 120;
	        } else {
	            o.setAttribute("disabled", true);
	            o.value="重新发送(" + wait + ")";
	            wait--; 
	            setTimeout(function() {
	                time(o);
	            },
	            1000); 
	     	}
		}
	//检验手机验证码是否正确
	function checkphoneYZM(){
		var phone = $('#phone').val();
		var phoneYZM = document.getElementById("phoneYZM").value;
		var check = !!phoneYZM.match(/^\d{6}$/); 
		var em2 = document.getElementById("em2");
		if(phoneYZM==""){
			em2.innerHTML="&nbsp;&nbsp;验证码不能为空";
			checks = 0;
		}else if(check==false){ 
			em2.innerHTML="&nbsp;&nbsp;请正确输入6位纯数字验证码";
			checks = 0;
		}else{
			$.post("<%=path %>/reguser!checkYZM.action",
					  {"mobileYZM":phoneYZM,"reguser.username":phone},
					  function(result){
						  if(result == null){
							  em2.innerHTML = "&nbsp;&nbsp验证出错，请重试";
							  checks = false;
						  }
						  if(result.status=="true"||result.status==true){
							  em2.innerHTML = result.message;
							  checks = true;
						  }else{
							  em2.innerHTML = result.message;
							  checks = false;
						  }
					  },"json");
		}
	}
	function checkdiv2(){
		checkphoneYZM();
		if(checks){
			document.getElementById("div2").style.display="none";
			document.getElementById("div3").style.display="block";
			}
		}
	//检查密码
	function checkpwd(){ 
		var pwd = $('#pwd').val();
		var pwdsss=/[0-9 | A-Z | a-z]{6,16}/;
		var check = pwdsss.test(pwd); 
		var span4 = document.getElementById("span4");
		if(!check){
			span4.innerHTML="密码格式不正确";
			checks = false;
			}else{
				span4.innerHTML="";
				checks = true;
			}
		}
	//检查再次输入密码
	function checkrepwd(){
		var pwd = $('#pwd').val();
		var repwd = $('#repwd').val();
		var span5 = document.getElementById("span5");
		checkpwd();
		if(checks){
			if(pwd==repwd){
					checks = true;
					span5.innerHTML="";  
				}else{
					checks = false;
					span5.innerHTML="两次密码必须输入一致"; 
				}
			}
		}
	//重置密码
	function czpwd(){
		checkrepwd();
		if(checks){
			var repwd = $('#repwd').val(); 
			var phone = $('#phone').val(); 
			$.post("<%=path %>/reguser!updateUser.action",
					  {"reguser.pwd":repwd,"reguser.username":phone,"retrievePwd":1},
					  function(result){
						  if(result == null){
							  alert("发生了未知错误，我们感到十分抱歉,请重试");
							  window.location.href = "<%=path%>/RetrievePassword.jsp";
						  }
						  if(result.status=="true"||result.status==true){
							  document.getElementById("okok").style.display="block";
						  }else{ 
							  alert("发生了未知错误，我们感到十分抱歉,请重试");
							  window.location.href ="<%=path%>/RetrievePassword.jsp"; 
						  }
					  },"json");
			}
		}
	//跳到登录页面
	function goLogin(){
		window.location.href ="<%=path%>/login.jsp"; 
		}
</script>
</body>
</html>