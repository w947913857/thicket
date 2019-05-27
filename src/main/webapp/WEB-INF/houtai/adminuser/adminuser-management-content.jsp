<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<% 
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>
	<s:if test="%{adu.id != null && '' != adu.id}">修改</s:if><s:else>添加</s:else>
	<%--<c:if test="${userinfor.userId != null && '' != userinfor.userId }"></c:if>
	<c:if test="${userinfor.userId == null || '' == userinfor.userId }">添加</c:if>--%>
	</title>
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/"/>
<link rel="stylesheet" type="text/css" id="customSkin"/>
<!--框架必需end-->

<!-- 日期控件start -->
<script type="text/javascript" src="<%=path%>/libs/js/form/datePicker/WdatePicker.js"></script>
<!-- 日期控件end -->

<!-- 树组件start -->
<script type="text/javascript" src="<%=path%>/libs/js/tree/ztree/ztree.js"></script>
<link type="text/css" rel="stylesheet" href="<%=path%>/libs/js/tree/ztree/ztree.css"></link>
<!-- 树组件end -->

<!-- 树形下拉框start -->
<script type="text/javascript" src="<%=path%>/libs/js/form/selectTree.js"></script>
<!-- 树形下拉框end -->

<!-- 表单验证start -->
<script src="<%=path%>/libs/js/form/validationRule.js" type="text/javascript"></script>
<script src="<%=path%>/libs/js/form/validation.js" type="text/javascript"></script>
<!-- 表单验证end -->

<!-- 表单异步提交start -->
<script src="<%=path%>/libs/js/form/form.js" type="text/javascript"></script>
<!-- 表单异步提交end -->

</head>
<body>
	<form id="myFormId" action="<%=path%>/adminusers!saveUser.action" method="post" target="frmright">
	<div class="box1" id="formContent" whiteBg="true">
	<table class="tableStyle" formMode="transparent">
		<input type="hidden" name="adu.id" value="<s:property value="adu.id"/>" />
		<s:if test="%{adu.id != null && '' != adu.id}">
		<input type="hidden" name="isupdate" value="1"/>
		</s:if>
		<tr>
			<td width="150">用户名：</td>
			<td>
			<s:if test="%{adu.id != null && '' != adu.id}">
			<s:property value="adu.username"/>
			<input type="hidden" name="adu.username" value="<s:property value="adu.username"/>"/>
			</s:if>
			<s:else>
			<input type="text" name="adu.username" value="<s:property value="adu.username"/>" class="validate[required,custom[noSpecialCaracters],ajax[ajaxAdminUser]]" watermark="请输入英文或数字"/><span class="star">*</span>
			</s:else>
			</td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="text" name="adu.pwd" value="<s:property value="adu.pwd"/>" id="pwd" class="validate[required,length[6,11],custom[noSpecialCaracters]]"/><span class="star">*</span> </td>
		</tr>
		<tr>
			<td>密码确认：</td>
			<td><input type="text" class="validate[required,confirm[pwd]]" value="<s:property value="adu.pwd"/>"/><span class="star">*</span></td>
		</tr>
		<tr>
			<td width="150">姓名：</td>
			<td><input type="text" name="adu.name" value="<s:property value="adu.name"/>" class="validate[required,custom[chinese],length[0,20]]"/><span class="star">*</span></td>
		</tr>
		<tr>
			<td>手机号码：</td>
			<td><input  type="text" maxlength="11" name="adu.mobile" value="<s:property value="adu.mobile"/>" class="validate[custom[mobilephone]]"/></td>
		</tr> 
		<tr>
			<td>用户类型：</td>
			<td><select selectedValue="<s:property value="adu.usertype"/>" name="adu.usertype"  data='{"list":[{"value":"0","key":"管理员"},{"value":"1","key":"僧侣"}]}'></select></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" id="sub" value="提交"/>
				<input type="button" value="取消" onclick="top.Dialog.close()"/>
			</td>
		</tr>
	</table>
	</div>
	</form>
<!-- 异步提交start -->
<script type="text/javascript">
function initComplete(){
    //表单提交
    $('#sub').click(function(){ 
	    //判断表单的客户端验证是否通过
			var valid = $('#myFormId').validationEngine({returnIsValid: true});
			if(valid){
			   $('#myFormId').ajaxSubmit({
			        //表单提交成功后的回调
			        success: function(responseText, statusText, xhr, $form){
			            top.Dialog.alert(responseText.message,function(){
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
function closeWin(){
	var update = false;
	var isupdate = '<s:property value="adu.id"/>';
	if(isupdate != ''){
		update = true;
	}else{
		update = false;
	}
	//刷新数据
	top.frmright.refresh(update);
	//关闭窗口
	top.Dialog.close();
}
</script>
<!-- 异步提交end -->	
</body>
</html>