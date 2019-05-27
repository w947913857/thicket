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
				<td width="150" style="text-align: center;">寺 院 名 称：</td>
				<td>${joinclJson.clname }</td> 
				<td width="150" style="text-align: center;">宗教场所许可证号：</td>
				<td>${joinclJson.permitno }</td>   
			</tr> 
			<tr>
				<td width="150" style="text-align: center;">地 址：</td>
				<td colspan="3">${joinclJson.address }</td>  
			</tr>
			<tr>
				<td width="150" style="text-align: center;">法人代表名字：</td>
				<td>${joinclJson.legalname }</td> 
				<td width="150" style="text-align: center;">法人代表手机号：</td>
				<td>${joinclJson.legalphone }</td>    
			</tr>
			<tr>
				<td width="150" style="text-align: center;">法人代表身份证号：</td>
				<td>${joinclJson.legalidcard }</td> 
				<td width="150" style="text-align: center;">联系人名字：</td>
				<td>${joinclJson.contactsname }</td>    
			</tr>
			<tr>
				<td width="150" style="text-align: center;">联系人固定电话：</td>
				<td>${joinclJson.contactsmobile }</td> 
				<td width="150" style="text-align: center;">联系人手机：</td>
				<td>${joinclJson.contactsphone }</td>    
			</tr> 
			<tr>
				<td width="150" style="text-align: center;">邮编：</td>
				<td>${joinclJson.postcode }</td> 
				<td width="150" style="text-align: center;">加盟时间：</td>
				<td>${joinclJson.jointime }</td>    
			</tr> 
			<tr>
				<td width="150" style="text-align: center;">寺院的简要介绍：</td>
				<td colspan="3">${joinclJson.message }</td>  
			</tr>
			<tr>
				<td width="150" style="text-align: center;">附件下载：</td> 
				<td colspan="3" style="text-align: center;"><a style="color: red;" href="${clxjURI }${joinclJson.fileurl[0]}">合同</a></td>    
			</tr>      
			 <c:if test="${joinclJson.joinstatus=='正在审核'}">
			 <tr>   
				<td width="150" style="text-align: center;">审核状态：</td> 
				<td colspan="3"> 
					<input type="hidden" id="contactsphone" value="${joinclJson.contactsphone }"/>
					<input type="hidden" id="joinclid" value="${joinclJson.id }"/>
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
			 <c:if test="${joinclJson.joinstatus!='正在审核'}">
			 	 <tr>   
				<td width="150" style="text-align: center;">审核状态：</td> 
				<td colspan="3">${joinclJson.joinstatus}</td> 
			 </tr>   
			 </c:if>
		</table>
	</div>
	<script type="text/javascript">
		function change(){
			var id=document.getElementById("joinclid").value;
			var joinstatus=document.getElementById("joinstatus").value;
			var contactsphone=document.getElementById("contactsphone").value;
			$.post("<%=path %>/joincl!updateJoinclOfId.action",
					  {"joincl.id":id,"joincl.joinstatus":joinstatus,"joincl.contactsphone":contactsphone},
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