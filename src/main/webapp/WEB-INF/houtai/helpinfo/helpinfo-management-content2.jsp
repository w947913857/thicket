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
<title>查看救助信息</title>
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
				<th colspan="4">求助信息</th>
			</tr>
			<tr>
				<td width="150">加盟姓名：</td>
				<td  width="250"><s:property value="%{helpinfoJson.name}" /></td>
				<td width="150">性别：</td>
				<td ><s:property value="%{helpinfoJson.sex}" /></td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><s:property value="%{helpinfoJson.age}" /></td>
				<td>身份证：</td>
				<td><s:property value="%{helpinfoJson.idcard}" /></td>
			</tr>
			<tr>
				<td>手机号：</td>
				<td><s:property value="%{helpinfoJson.phonenum}" /></td>
				<td>邮箱：</td>
				<td><s:property value="%{helpinfoJson.email}" /></td>
			</tr>
			<tr>
				<td>地址：</td>
				<td><s:property value="%{helpinfoJson.address}" /></td>
				<td>家庭年收入：</td>
				<td><s:property value="%{helpinfoJson.income}" /></td>
			</tr>
			<tr>
				<td>是否享受低保：</td>
				<td><s:property value="%{helpinfoJson.basicliving}" /></td>
				<td>申请金额：</td>
				<td><s:property value="%{helpinfoJson.applymoney}" /></td>
			</tr>
			<tr>
				<td width="150" >申请描述：</td>
				<td   colspan="3" width="580px" height="300px" ><s:property  value="%{helpinfoJson.applycontent}" /></td>
			</tr>
			<tr>
				<td valign="top">下载文档：</td>
				<td colspan="3"><c:forEach items="${f }" var="f">
						<a href="${clxjBackfreeURI}${f.filepath}" width="242px" height="100px">${f.filename}</a>
					</c:forEach></td>
			</tr>
			<tr>
				<td>审核状态：</td>
				
					<c:if test="${isapplystatus ==1}">
						<input type="hidden" id="helpinfoid" value="${helpinfo.id}"/>
					<td>
						<select id="helpinfocheckstatus">							
							<option value="1">初审通过</option>
							<option value="3">审核不通过</option>
						</select>
					</td>
					</c:if>
					<c:if test="${isapplystatus ==2}">
						<input type="hidden" id="helpinfoid" value="${helpinfo.id}"/>
						<input type="hidden" id="helpinfouid" value="${helpinfo.uid}"/>
					<td>
						<select id="helpinfocheckstatus">							
							<option value="2">终审通过</option>
							<option value="3">审核不通过</option>
						</select>
					</td>
					<td>
						评论
					</td>
					<td>
						<input type="button" value="查看评论"  
		onclick="top.Dialog.open({URL:'<%=path%>/helpinfo/helpinfo-management-content0.jsp?helpid=${helpinfo.id}',ShowMaxButton:true,Title:'评论',Width:650,Height:400});"/>
					</td>	
					</c:if>
					<c:if test="${isapplystatus ==0}"><td><s:property value="%{helpinfoJson.applystatus}" /></td></c:if>
				
			</tr>		
		<c:if test="${isapplytype ==1}">
			<tr>
				<td>申请资金使用期限：</td>
				<td><s:property value="%{helpinfoJson.applymoneyusertime}" /></td>
				<td>担保人姓名：</td>
				<td><s:property value="%{helpinfoJson.vouchname}" /></td>
			</tr>

			<tr>
				<td>担保人身份证号码：</td>
				<td><s:property value="%{helpinfoJson.vouchidcard}" /></td>
				<td>担保人工作单位：</td>
				<td><s:property value="%{helpinfoJson.vouchcompany}" /></td>
			</tr>
			<tr>
				<td>担保人单位固定电话；</td>
				<td><s:property value="%{helpinfoJson.vouchphonenum}" /></td>
				<td>担保人个人联系电话：</td>
				<td><s:property value="%{helpinfoJson.vouchmobile}" /></td>
			</tr>
		</c:if>
				
			<c:if test="${isapplystatus ==1 || isapplystatus ==2 }">
				<tr>
					<td colspan="4" align="center"><input type="button" onclick="change()" value="提交审核"/></td>
				</tr>
			</c:if>
		</table>
	</div>
	

	<script type="text/javascript">
		function change(){
			var id=document.getElementById("helpinfoid").value;
			var helpinfocheckstatus=document.getElementById("helpinfocheckstatus").value;
			$.post("<%=path %>/helpfo!updateHelpinfoOfId.action",
					  {"helpinfo.id":id,"helpinfo.applystatus":helpinfocheckstatus},
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