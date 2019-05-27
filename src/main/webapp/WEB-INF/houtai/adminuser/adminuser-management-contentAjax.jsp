<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%  
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修改</title>
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
		<input type="hidden" name="adu.id" value="<%=request.getParameter("id")%>"/>
		<input type="hidden" name="adu.regtime" id="regtime"/>
		<input type="hidden" name="adu.userflag" id="userflag"/>
		<input type="hidden" id="isupdate" name="isupdate" value="1"/>
		<tr>
			<td width="150">用户名：</td>
			<td>
				<input type="text" name="adu.username"  id="displayUserLoginName" /> 
			</td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="text" name="adu.pwd" value="" id="pwd" class="validate[required,length[6,11],custom[noSpecialCaracters]]" /><span class="star">*</span> </td>
		</tr>
		<tr>
			<td>密码确认：</td>
			<td><input type="text" id="pwdchk" class="validate[required,confirm[pwd]]" value=""/><span class="star">*</span></td>
		</tr>
		<tr>
			<td width="150">姓名：</td>
			<td><input type="text" name="adu.name" value="" class="validate[required,custom[chinese],length[0,20]]"/><span class="star">*</span></td>
		</tr>
		<tr>
			<td>手机号码：</td>
			<td><input  type="text" maxlength="11" name="adu.mobile" value="" class="validate[custom[mobilephone]]"/></td>
		</tr>
		<tr>  
			<td><div id="type1" style="display: none;">用户类型：</div></td> 
			<td><div id="type2" style="display: none;"><select id="usertype" name="adu.usertype"  data='{"list":[{"value":"0","key":"管理员"},{"value":"1","key":"僧侣"}]}'></select></div></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="提交"/>
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
    $('#myFormId').submit(function(){ 
	    //判断表单的客户端验证是否通过
			var valid = $('#myFormId').validationEngine({returnIsValid: true});
			if(valid){
			   $(this).ajaxSubmit({ 
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
   	$.post("<%=path%>/adminusers!preUpdateUserAjax.action",{"adu.id":"<%=request.getParameter("id")%>"},
			function(result){
		   		$("#displayUserLoginName").val(result.adu.username);
		   		$("#pwdchk").val(result.adu.pwd);
		   		$("#userflag").val(result.adu.userflag);
		   		$("#regtime").val(result.adu.regtime);
				$('#myFormId').ajaxWrite({data:result});
				if(result.adu.usertype==0||result.adu.usertype==1){
		   			$("#type1").css("display", "block");
		   			$("#type2").css("display", "block"); 
			   	}else{
				   	$("#usertype").empty();
				   	$("#usertype").append("<option select='select' value='"+result.adu.usertype+"'>usertype</option>");
				} 
				$("#isupdate").val("1");
			},"json");
}


/**
 * 重置
 */
function closeWin(){
	//刷新数据
	top.frmright.refresh(true);
	//关闭窗口
	top.Dialog.close();
}
</script>
<!-- 异步提交end -->	
</body>
</html>