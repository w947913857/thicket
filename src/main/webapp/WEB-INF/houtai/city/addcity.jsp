<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>增加城市</title>
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/" />
<link rel="stylesheet" type="text/css" id="customSkin" />
<!--框架必需end-->

<!-- 日期控件start -->
<script type="text/javascript"
	src="<%=path%>/libs/js/form/datePicker/WdatePicker.js"></script>
<!-- 日期控件end -->


<!-- 表单验证start -->
<script src="<%=path%>/libs/js/form/validationRule.js"
	type="text/javascript"></script>
<script src="<%=path%>/libs/js/form/validation.js"
	type="text/javascript"></script>
<!-- 表单验证end -->

<!-- 表单异步提交start -->
<script src="<%=path%>/libs/js/form/form.js" type="text/javascript"></script>
<!-- 表单异步提交end -->

<!--提示下拉框start-->
<script src="<%=path%>/libs/js/form/suggestion.js"  type="text/javascript"></script>
<!--提示下拉框end-->


<!-- 异步上传控件start -->
<script type="text/javascript"
	src="<%=path%>/libs/js/form/upload/fileUpload.js"></script>
<script type="text/javascript"
	src="<%=path%>/libs/js/form/upload/handlers.js"></script>
<!-- 异步上传控件end -->

<!-- 双向选择器start -->
<script type="text/javascript" src="<%=path%>/libs/js/form/lister.js"></script>
<!-- 双向选择器end --> 

</head>
<body>

	<form id="myFormId" action="<%=path%>/city!addCity.action"
		method="post" target="frmright" enctype="multipart/form-data">
		<div class="box1" id="formContent" whiteBg="true">
			<table class="tableStyle" formMode="transparent" width="400"
				align="center">
				<tr>
					<td width="100px">城市中文：</td>
					<td>	
     					<input type="text" value="${cityJson.chinese }" name="city.chinese" class="validate[required,custom[chinese],length[0,20]]" watermark="请输入中文"/>					
				   </td> 
				</tr> 
				<tr>
					<td width="100px">城市拼音：</td>
					<td>	
     					<input type="text" value="${cityJson.pinyin }" name="city.pinyin" class="validate[required,custom[onlyLetter]]" watermark="请输入拼音"/>					
				   </td>
				</tr>
				<tr> 
					<td width="100px">城市拼音缩写：</td>
					<td>	  
     					<input type="text" <c:if test="${not empty cityJson}"> value="${cityJson.abbreviations }" </c:if>  name="city.abbreviations" class="validate[required,custom[onlyLetter]]" watermark="请输入拼音缩写"/>					
				   </td>
				</tr> 
				<tr>
					<td width="100px">所属分组：</td>
					<td>	
     					<div id="group" <c:if test="${empty cityJson}"> maxSelection="3"</c:if> <c:if test="${not empty cityJson}"> selectedValue="${cityJson.groupId }" maxSelection="3"</c:if>  class="lister" isterWidth="120" listerHeight="180"   data='{"fromList":[{"value":"1","key":"热门城市"},{"value":"2","key":"A-F"},{"value":"3","key":"G-J"},{"value":"4","key":"K-N"},{"value":"5","key":"O-W"},{"value":"6","key":"X-Z"},{"value":"7","key":"国际城市"},{"value":"8","key":"国内热门目的地"},{"value":"9","key":"国外热门目的地"}],"toList":[]}'></div>
				   		<input type="hidden" id="groups" name="groups"/> 
				   </td>     
				</tr>
				<tr>  
					<td colspan="2" align="center">  
						<c:if test="${not empty cityJson}">
						<input type="hidden" name="city.id" value="${cityJson.id }"/>
						<input type="hidden" name="delete" value="1"/>
						<input type="submit" value="修改" />
						</c:if> 
						<c:if test="${empty cityJson}"><input type="submit" value="提交" /></c:if> 
						<input type="button" value="取消" onclick="top.Dialog.close()" /></td>  
				</tr>
			</table>
		</div>
	</form>
	<!-- 异步提交start -->
	
	<script type="text/javascript">

	function InitTable() { 
		 
	} 
		function initComplete() {
			InitTable();
			//表单提交
			$('#myFormId').submit(
					function() {
						//判断表单的客户端验证是否通过
						var valid = $('#myFormId').validationEngine({
							returnIsValid : true
						});
						if (valid) {
							getValue();
							$(this).ajaxSubmit(
									{
										//表单提交成功后的回调
										success : function(responseText,
												statusText, xhr, $form) {
											top.Dialog.alert(
													responseText.message,
													function() {
														closeWin();
													})
										}
									});
						}
						//阻止表单默认提交事件
						return false;
					});
		}

		//重置
		function closeWin() {
			//刷新数据
			top.frmright.refresh(true);
			//关闭窗口
			top.Dialog.close();
		}
		//获取值
		function getValue(){
			var group = $("#group").attr("relValue");
			document.getElementById("groups").value = group;
		}
	</script>
	<!-- 异步提交end -->
</body>
</html>