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

<!-- 异步上传控件start -->
<script type="text/javascript"
	src="<%=path%>/libs/js/form/upload/fileUpload.js"></script>
<script type="text/javascript"
	src="<%=path%>/libs/js/form/upload/handlers.js"></script>
<!-- 异步上传控件end -->

<!-- 表单异步提交start -->
<script src="<%=path%>/libs/js/form/form.js" type="text/javascript"></script>
<!-- 表单异步提交end -->
</head>
<body>
<form action="<%=path%>/adminusers!updateApk.action" id="myFormId" enctype="multipart/form-data" method="post">
<table class="tableStyle" formMode="transparent" style="margin-top: 20px;">
		<tr>
			<td>上传文件：</td>
			<td>
				<input type="file" id="file" name="apk.apkfile"/>
				<input type="hidden"  name="apk.apkType" value="2"/>  
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input onclick="upload()" type="button" value="提交"/>
			</td>
		</tr>
</table>
</form>
<script type="text/javascript">
function initComplete() {
	//表单提交
	$('#myFormId').submit( 
			function() {
					$(this).ajaxSubmit(
							{
								//表单提交成功后的回调
								success : function(responseText,
										statusText, xhr, $form) {
									top.Dialog.alert(
											responseText.message,
											function() {
												closeWin();
											});
								}
							});
				//阻止表单默认提交事件 
				return false;
			});
}
function upload(){
	var file = document.getElementById("file").value;   
	if(file==""||file==null){  
		top.Dialog.alert("上传Apk不能为空");  
	}else{
		var fileType = (file.substring(file.lastIndexOf(".")+1,file.length)).toLowerCase();
		if(fileType!="apk"){  
			top.Dialog.alert("只能上传Apk安装包");  
		}else{
			$('#myFormId').submit(); 
		}
	}
}
//重置
function closeWin() {  
	//关闭窗口
	top.Dialog.close();
}
</script>
</body>
</html>