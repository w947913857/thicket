<%@page language="java" pageEncoding="UTF-8"%>
<% 
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="<%=path%>/js/jquery.js"></script>

<title>查询录音</title>
<!-- 查询录音start -->
<script type="text/javascript">
function selRecord(){
	var id = document.getElementById("id").value;
	$.post("<%=path %>/confession!selConfession.action",
			{"confession.id":id},
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
</head>

<body>
	<form action="" method="post">
		<input type="text" name="id" id="id"/> <input type="button"
			value="查询" onclick="selRecord()" />
	</form>
	<div id="audio"></div>
</body>
</html>