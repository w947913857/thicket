<%@page language="java" pageEncoding="UTF-8"%>
<% 
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/" scrollerY="false"/>
<link rel="stylesheet" type="text/css" id="customSkin"/>
<!--框架必需end-->
<title>查询录音</title>
</head>
<!-- 查询录音start -->
<script type="text/javascript">
function selRecord(){
	var id = document.getElementById("id").value;
	$.post("<%=path %>/record!selRecord.action",
			{"free.id":id},
		function(result) {
			if (result == null) {
				$(".show").html("查询失败！");
				return false;
			}
			if (result.status == "true" || result.status == true) {
				var src = result.message;
				document.getElementById("audio").innerHTML ="<embed src='"+src+"' width='480' height='100' loop='false' autostart='false'> </embed>"
							} else {
								document.getElementById("audio").innerHTML ="未找到该信息";
							}

						}, "json");
	}
</script>
<!-- 查询录音stop -->
<body>
	<form action="" method="post">
		<input type="text" name="id" id="id"/> <input type="button"
			value="查询" onclick="selRecord()" />
	</form>
	<div id="audio"></div>
</body>
</html>