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
<!--修正IE6不支持PNG图start-->
<style>
img {
	behavior:url("<%=path%>/libs/js/method/pngFix/pngbehavior.htc");
}
</style>
<!--修正IE6不支持PNG图end-->

<!--动画方式入场效果start-->
<script type="text/javascript" src="<%=path%>/libs/js/pic/jomino.js"></script>
<script>
	 $(function(){
		$(".navIcon").hide();
		$(".navIcon").jomino();
	});
	function customHeightSet(contentHeight){
		$("#scrollContent").height(contentHeight);
	}
</script>
<!--动画方式入场效果end-->
</head>
<body>  
<div id="scrollContent" style="margin-left: 0px;">  
	<table width="100%" height="90%">   
		<tr><td class="ali02 ver02">
			<div  style="width:800px;margin:0 auto;">
			<table class="ali01 ver01">
				<tr height="146">
					<td width="260">  
						<div class="navIcon" onclick='top.Dialog.open({URL:"<%=path%>/roll/download/download.jsp",ID:"a1",Width:1024,Height:500,Title:"下载Apk页面广告"});'>
							<div class="navIcon_left"><img src="<%=path%>/libs/icons/png/01.png"/></div>          
							<div class="navIcon_right">    
								<div class="navIcon_right_title">下载Apk页面广告</div>
								<div class="navIcon_right_con">
									一共五张图
								</div>
							</div>
							<div class="clear"></div>
						</div>
					</td>   
					<td width="260">  
						<div class="navIcon" onclick='top.Dialog.open({URL:"<%=path%>/roll/home/home.jsp",ID:"a2",Width:1024,Height:500,Title:"首页广告"});'>
							<div class="navIcon_left"><img src="<%=path%>/libs/icons/png/02.png"/></div>
							<div class="navIcon_right"> 
								<div class="navIcon_right_title">首页广告</div>
								<div class="navIcon_right_con">
									一共五张图 
								</div>   
							</div>
							<div class="clear"></div>
						</div>
					</td>
					<td width="260">  
						<div class="navIcon" onclick='top.Dialog.open({URL:"<%=path%>/roll/login/login.jsp",ID:"a3",Width:1024,Height:500,Title:"登录页广告"});'>
							<div class="navIcon_left"><img src="<%=path%>/libs/icons/png/03.png"/></div>
							<div class="navIcon_right"> 
								<div class="navIcon_right_title">登录页面广告</div>
								<div class="navIcon_right_con">
									一共一张图 
								</div>   
							</div>
							<div class="clear"></div>
						</div>
					</td>
				</tr>
			</table>
			</div>
		</td></tr>
	</table>
</div>
</body>
</html>