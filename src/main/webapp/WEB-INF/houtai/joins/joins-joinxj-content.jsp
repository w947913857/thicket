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
<title>审核丛林加盟信息</title>
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
				<td width="150" style="text-align: center;">闲居户主名称：</td>
				<td>${joinxjJson.xjname }</td> 
				<td width="150" style="text-align: center;">房屋产权证号：</td>
				<td>${joinxjJson.houseno }</td>    
			</tr> 
			<tr>
				<td width="150" style="text-align: center;">地 址：</td>
				<td colspan="3">${joinxjJson.address }</td>  
			</tr>
			<tr>
				<td width="150" style="text-align: center;">户主身份证号：</td>
				<td>${joinxjJson.houseidcard }</td> 
				<td width="150" style="text-align: center;">户主手机号：</td>
				<td>${joinxjJson.housephone }</td>    
			</tr>
			<tr>
				<td width="150" style="text-align: center;">户主固定电话：</td>
				<td>${joinxjJson.housemobile }</td> 
				<td width="150" style="text-align: center;">房屋共有人名字：</td>
				<td>${joinxjJson.houseperson }</td>    
			</tr>
			<tr>
				<td width="150" style="text-align: center;">房屋共有人身份证号：</td>
				<td>${joinxjJson.idcard }</td> 
				<td width="150" style="text-align: center;">房屋共有人手机：</td>
				<td>${joinxjJson.phone }</td>    
			</tr> 
			<tr>
				<td width="150" style="text-align: center;">邮编：</td>
				<td>${joinxjJson.postcode }</td> 
				<td width="150" style="text-align: center;">加盟时间：</td>
				<td>${joinxjJson.jointime }</td>    
			</tr> 
			<tr>
				<td width="150" style="text-align: center;">户主及家庭主要成员简介：</td>
				<td colspan="3">${joinxjJson.message }</td>  
			</tr>
			<tr>
				<td width="150" style="text-align: center;">附件下载：</td> 
				<td colspan="3" style="text-align: center;"><a style="color: red;" href="${clxjURI }${joinxjJson.fileurl[0]}">合同</a></td>    
			</tr>      
			 <c:if test="${joinxjJson.joinstatus=='正在审核'}"> 
			 <tr>   
				<td width="150" style="text-align: center;">审核状态：</td> 
				<td colspan="3"> 
					<input type="hidden" id="housephone" value="${joinxjJson.housephone }"/>
					<input type="hidden" id="joinxjid" value="${joinxjJson.id }"/>
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
			 <c:if test="${joinxjJson.joinstatus!='正在审核'}">
			 	 <tr>   
				<td width="150" style="text-align: center;">审核状态：</td> 
				<td colspan="3">${joinxjJson.joinstatus}</td> 
			 </tr>   
			 </c:if>
		</table>
	</div>
	<script type="text/javascript">
		function change(){
			var id=document.getElementById("joinxjid").value;
			var joinstatus=document.getElementById("joinstatus").value;
			var housephone=document.getElementById("housephone").value;
			$.post("<%=path %>/joinxj!updateJoinxjOfId.action",
					  {"joinxj.id":id,"joinxj.joinstatus":joinstatus,"joinxj.housephone":housephone},
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