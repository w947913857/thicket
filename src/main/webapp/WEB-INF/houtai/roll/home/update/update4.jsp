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
<form action="<%=path%>/adminusers!updateImg.action" id="myFormId" enctype="multipart/form-data" method="post">
<table class="tableStyle" formMode="transparent" style="margin-top: 20px;">
		<tr> 
			<td>上传图片：</td>
			<td> 
				<input type="file" id="file" name="img.img"/>
				<input type="hidden"  name="img.imgType" value="2"/>  
				<input type="hidden"  name="img.imgType2" value="3"/>   
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="提交" onclick="upload()"/>    
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
								success : function(results,
										statusText, xhr, $form) {
									top.Dialog.alert( 
											results.message, 
											function() {
												closeWin(results.line); 
											});
								}
							});
				//阻止表单默认提交事件 
				return false;  
			});
}
function upload(){
	var file = document.getElementById("file").value;  
	var check = false; 
	if(file==""||file==null){  
		top.Dialog.alert("上传图片不能为空");  
	}else{
		var fileType = (file.substring(file.lastIndexOf(".")+1,file.length)).toLowerCase();
		var suppotFile = new Array();
		   suppotFile[0] = "jpg";
		   suppotFile[1] = "gif";
		   suppotFile[2] = "bmp";
		   suppotFile[3] = "png";
		   suppotFile[4] = "jpeg";
		  for(var i =0;i<suppotFile.length;i++) {
			   if (suppotFile[i]==fileType) {
				   check = true;
			        break;
			   } else{
			 } 
		  }  
		if(!check){  
			top.Dialog.alert("文件类型不合法,只能是jpg、gif、bmp、png、jpeg类型！");   
		}else{
			$('#myFormId').submit();  
			}
	}
}  
//重置
function closeWin(line) {      
	top.document.getElementById("_DialogFrame_a2").contentWindow.updateLine(line);
	top.Dialog.close();   
}
</script>
</body>
</html>