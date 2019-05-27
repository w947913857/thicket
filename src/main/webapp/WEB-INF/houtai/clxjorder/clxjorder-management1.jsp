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
				<td width="150">订单编号：</td>
				<td  width="250"><s:property value="%{clxjorderJson.oid}" /></td>
				<td>入住人员姓名：</td>
				<td><s:property value="%{clxjorderJson.checkperson}" /></td>
				
			</tr>
			<tr>
				<td>入住开始时间：</td>
				<td><s:property value="%{clxjorderJson.checkstartdate}" /></td>
				<td>入住结束时间：</td>
				<td><s:property value="%{clxjorderJson.checkenddate}" /></td>
			</tr>
			<tr>
				<td>入住丛林闲居名称：</td>
				<td><s:property value="%{clxjorderJson.cid}" /></td>
				<td>总价：</td>
				<td><s:property value="%{clxjorderJson.total}" /></td>
			</tr>
			<tr>
				<td>联系人：</td>
				<td><s:property value="%{clxjorderJson.relperson}" /></td>
				<td>联系人电话：</td>
				<td><s:property value="%{clxjorderJson.relphone}" /></td>
			</tr>
			<tr>
				<td>联系人邮箱：</td>
				<td><s:property value="%{clxjorderJson.relemail}" /></td>
				<td>预定时间：</td>
				<td><s:property value="%{clxjorderJson.reservetime}" /></td>
			</tr>
			<tr>
				<td>下单用户：</td>
				<td><s:property value="%{clxjorderJson.uid}" /></td>
				<td>交易状态：</td>
				<td><c:if test="${isjoinstatus ==1}">
						<input type="hidden"   id="oid" value="${clxjorderJson.oid}"/>
						<select id="orderfocheckstatus">
							<option value="0">完成</option>
							<option value="2">取消</option>
						</select>
					</c:if>
					<c:if test="${isjoinstatus !=1}"><s:property value="%{clxjorderJson.state}" /></c:if>	
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
			$.post("<%=path %>/clxjorder!updateOfId.action",
					  {"clxjorder.oid":id,"clxjorder.state":orderfocheckstatus},
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