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
<title>查看车辆信息</title>
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/" />
<link rel="stylesheet" type="text/css" id="customSkin" />
<!--框架必需end-->
</head>
<body>
	<div class="box1" id="formContent" whiteBg="true">
		<table class="tableStyle" formMode="view" width="400" align="center">
			<tr>
				<td width="150">丛林闲居名称：</td>
				<td><s:property value="%{carinfoJson.clxjname}" /></td>
			</tr>
			<tr>
				<td>标题：</td>
				<td><s:property value="%{carinfoJson.cartitle}" /></td>
			</tr>
			<tr>
				<td valign="top">轮换图：</td>
				<td><c:forEach items="${url }" var="imgurl">
						<img src="<%=path %>${imgurl}" width="242px" height="100px">
					</c:forEach></td>
			</tr>
			<tr>
				<td>价格：</td>
				<td><s:property value="%{carinfoJson.price}" /></td>
			</tr>
			<tr>
				<td>汽车牌照：</td>
				<td><s:property value="%{carinfoJson.licence}" /></td>
			</tr>
			<tr>
				<td>申请人名字：</td>
				<td><s:property value="%{carinfoJson.joinName}" /></td>
			</tr>
			<tr>
				<td>申请状态：</td>
				<td><c:if test="${ischeckstatus ==1}">
						<input type="hidden" id="carinfoid" value="${carinfo.id }"/>
						<select id="carinfocheckstatus">
							<option value="2">审核通过</option>
							<option value="1">审核不通过</option>
						</select>
					</c:if>
					<c:if test="${ischeckstatus !=1}"><s:property value="%{carinfoJson.checkstatus}" /></c:if>
				</td>
			</tr>
			<c:if test="${ischeckstatus ==1}">
				<tr>
					<td colspan="2" align="center"><input type="button" onclick="change()" value="提交审核"/></td>
				</tr>
			</c:if>
		</table>
	</div>
	<script type="text/javascript">
		function change(){
			var id=document.getElementById("carinfoid").value;
			var checkstatus=document.getElementById("carinfocheckstatus").value;
			$.post("<%=path %>/carinfo!updateCarinfoOfId.action",
					  {"carinfo.id":id,"carinfo.checkstatus":checkstatus},
					  function(result){
							  top.Dialog.alert(
									  result.message,
										function() {
											closeWin();
									})
					  },"json");
		}
		//重置
		function closeWin() {
			//刷新数据
			top.frmright.refresh(true);
			//关闭窗口
			top.Dialog.close();
		}
	</script>
</body>
</html>