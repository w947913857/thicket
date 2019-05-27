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
<title>审核用车加盟信息</title>
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
				<td width="150" style="text-align: center;">车主姓名：</td>
				<td>${joincarJson.theowner }</td> 
				<td width="150" style="text-align: center;">身份证号：</td>
				<td>${joincarJson.idcard }</td>    
			</tr> 
			<tr>
				<td width="150" style="text-align: center;">地 址：</td>
				<td colspan="3">${joincarJson.address }</td>  
			</tr>
			<tr>
				<td width="150" style="text-align: center;">车辆名称/型号：</td>
				<td>${joincarJson.carname }</td> 
				<td width="150" style="text-align: center;">行驶证号：</td>
				<td>${joincarJson.travelnumber }</td>    
			</tr>
			<tr>
				<td width="150" style="text-align: center;">已行驶里程：</td>
				<td>${joincarJson.travelrun }</td> 
				<td width="150" style="text-align: center;">指定驾驶员姓名：</td>
				<td>${joincarJson.drivername }</td>    
			</tr>
			<tr>
				<td width="150" style="text-align: center;">驾驶证号：</td>
				<td>${joincarJson.drivernumber }</td> 
				<td width="150" style="text-align: center;">指定驾驶员电话：</td>
				<td>${joincarJson.driverphone }</td>    
			</tr> 
			<tr>
				<td width="150" style="text-align: center;">车辆保险公司：</td>
				<td>${joincarJson.insurancename }</td> 
				<td width="150" style="text-align: center;">保险证号：</td>
				<td>${joincarJson.insurancenumber }</td>    
			</tr> 
			<tr>
				<td width="150" style="text-align: center;">车辆保险公司电话：</td>
				<td>${joincarJson.insurancephone }</td> 
				<td width="150" style="text-align: center;">加盟时间：</td>
				<td>${joincarJson.jointime }</td>    
			</tr> 
			<tr>
				<td width="150" style="text-align: center;">车主及家庭主要成员简介：</td>
				<td colspan="3">${joincarJson.message }</td>  
			</tr>
			<tr>
				<td width="150" style="text-align: center;">附件下载：</td> 
				<td colspan="3" style="text-align: center;"><a style="color: red;" href="${clxjURI }${joincarJson.fileurl[0]}">合同</a></td>    
			</tr>      
			 <c:if test="${joincarJson.joinstatus=='正在审核'}"> 
			 <tr>   
				<td width="150" style="text-align: center;">审核状态：</td> 
				<td colspan="3"> 
					<input type="hidden" id="driverphone" value="${joincarJson.driverphone }"/>
					<input type="hidden" id="joincarid" value="${joincarJson.id }"/>
					<select id="joinstatus">    
						<option value="2">审核通过</option> 
						<option value="1">审核不通过</option>
					</select>
				</td> 
			 </tr>    
			 <tr>   
				<td colspan="4"><input type="button" value="提交审核" onclick="change()"/></td> 
			 </tr>  
			 </c:if>
			 <c:if test="${joincarJson.joinstatus!='正在审核'}">
			 	 <tr>   
				<td width="150" style="text-align: center;">审核状态：</td> 
				<td colspan="3">${joincarJson.joinstatus}</td> 
			 </tr>   
			 </c:if>
		</table>
	</div>
	<script type="text/javascript">
		function change(){
			var id=document.getElementById("joincarid").value;
			var joinstatus=document.getElementById("joinstatus").value;
			var driverphone=document.getElementById("driverphone").value;
			$.post("<%=path %>/joincar!updateJoincarOfId.action",
					  {"joincar.id":id,"joincar.joinstatus":joinstatus,"joincar.driverphone":driverphone},
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