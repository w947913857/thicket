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
<title>查看订单信息</title>
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
				<th colspan="4">订单信息</th>
			</tr>
			<tr>
				<td>订单编号：</td>
				<td><s:property value="%{carorderJson.oid}" /></td>
				<td>用车车牌：</td>
				<td><s:property value="%{carorderJson.cid}" /></td>
				
			</tr>
			<tr>
				<td>始发地点：</td>
				<td><s:property value="%{carorderJson.startplace}" /></td>
				<td>到达地点：</td>
				<td><s:property value="%{carorderJson.endplace}" /></td>
			</tr>
			<tr>
				<td>下单用户：</td>
				<td><s:property value="%{carorderJson.uid}" /></td>
				<td>总价：</td>
				<td><s:property value="%{carorderJson.total}" /></td>
			</tr>
			<tr>
				<td>用车人员姓名：</td>
				<td><s:property value="%{carorderJson.checkperson}" /></td>
				<td>联系人电话：</td>
				<td><s:property value="%{carorderJson.checkphone}" /></td>
			</tr>
			<tr>
				<td>用车时间：</td>
				<td><s:property value="%{carorderJson.usetime}" /></td>
				<td>用车程向：</td>
				<td><s:property value="%{carorderJson.useroption}" /></td>
			</tr>
			<tr>
				<td>留言：</td>
				<td colspan="3"><s:property value="%{carorderJson.message}" /></td>
				
			</tr>
			<tr>
				<td>下单时间：</td>
				<td><s:property value="%{carorderJson.reservetime}" /></td>
				<td>交易状态：</td>
				<td><c:if test="${isjoinstatus ==1}">
						<input type="hidden"   id="oid" value="${carorderJson.oid}"/>
						<select id="orderfocheckstatus">
							<option value="0">完成</option>
							<option value="2">取消</option>
						</select>
					</c:if>
					<c:if test="${isjoinstatus !=1}"><s:property value="%{carorderJson.state}" /></c:if>	
				</td>
			</tr>
			<c:if test="${isjoinstatus ==1}">
				<tr>
					<td colspan="4" align="center"><input type="button" onclick="change()" value="提交"/></td>
				</tr>
			</c:if>
		
		</table>
	</div>
	

	<script type="text/javascript">
		function change(){
			var id=document.getElementById("oid").value;
			var orderfocheckstatus=document.getElementById("orderfocheckstatus").value;
			$.post("<%=path %>/carorder!updateOfId.action",
					  {"carorder.oid":id,"carorder.state":orderfocheckstatus},
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