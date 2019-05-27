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
<title>查看加盟信息</title>
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
				<td width="150">加盟姓名：</td>
				<td><s:property value="%{joinsJson.name}" /></td>
			</tr>
			<tr>
				<td>手机号：</td>
				<td><s:property value="%{joinsJson.phone}" /></td>
			</tr>
			<tr>
				<td valign="top">下载文档：</td>
				<td><c:forEach items="${f }" var="f">
						<a href="${clxjBackfreeURI}/${f.filepath}" width="242px" height="100px">${f.filename}</a>
					</c:forEach></td>
			</tr>
			<tr>
				<td>加盟地址：</td>
				<td><s:property value="%{joinsJson.address}" /></td>
			</tr>
			<tr>
				<td>加盟类型：</td>
				<td><s:property value="%{joinsJson.type}" /></td>
			</tr>
			<tr>
				<td>审核状态：</td>
				<td><c:if test="${isjoinstatus ==1}">
						<input type="hidden" id="joinsid" value="${joins.id}"/>
						<select id="joinsfocheckstatus">
							<option value="2">审核通过</option>
							<option value="1">审核不通过</option>
						</select>
					</c:if>
					<c:if test="${isjoinstatus !=1}"><s:property value="%{joinsJson.joinstatus}" /></c:if>
				</td>
			</tr>
			<c:if test="${isjoinstatus ==1}">
				<tr>
					<td colspan="2" align="center"><input type="button" onclick="change()" value="提交审核"/></td>
				</tr>
			</c:if>
		</table>
	</div>
	<script type="text/javascript">
		function change(){
			var id=document.getElementById("joinsid").value;
			var joinstatus=document.getElementById("joinsfocheckstatus").value;
			$.post("<%=path %>/joins!updateJoinsfoOfId.action",
					  {"joins.id":id,"joins.joinstatus":joinstatus},
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