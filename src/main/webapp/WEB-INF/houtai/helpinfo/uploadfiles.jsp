<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/" />
<link rel="stylesheet" type="text/css" id="customSkin" />
<!--框架必需end-->

<!-- 异步上传控件start -->
<script type="text/javascript"
	src="<%=path%>/libs/js/form/upload/fileUpload.js"></script>
<script type="text/javascript"
	src="<%=path%>/libs/js/form/upload/handlers.js"></script>
<!-- 异步上传控件end -->
</head>
<body>
	<span id="uploadBtn"></span>
	<div id="uploadList"></div><br/>
	<input type="button"  value="测试" onclick="save()"/>
	<script type="text/javascript">
	var upload;
	var catalogId;
	function initComplete(){
		   //生成catalogId
		    catalogId = $.fileUpload.generateCatalogId("<%=path%>/uploadfiles!generateCatalogId.action");
			//初始化上传控件
			upload = $.fileUpload.start({
				contextPath: "<%=path%>",
				buttonContainer : "uploadBtn",
				fileListContainer : "uploadList",
				deleteContainer : "uploadDeleteAll",
				moduleId : 'files',
				kind : 'template',
				catalogId : catalogId,
				uploadUrl : "/uploadfiles!upLoadFile.action",
				deleteUrl : "/uploadfiles!deleteFile.action?id=",
				fileNameWidth : 240
			});
		}
	function save(){
		window.location.href = "<%=path%>/helpinfo!saveHelpinfo.action?catalogId="+catalogId;
	}
	</script>
</body>
</html>
