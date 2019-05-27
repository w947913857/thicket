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
<title>查看丛林闲居信息</title>
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
		<table class="tableStyle" formMode="view">
			<input type="hidden" id="clxjmainid" value="${clxjmain.id }"/>
			<tr>
				<th colspan="4">丛林闲居信息</th>
			</tr>
			<tr>
				<td width="150">名字：</td>
				<td><s:property value="%{clxjmain.name}" /></td>
				<td>地址类型：</td>
				<td><s:if test="%{clxjmain.type1 == null}"></s:if> <s:else>
						<s:if test="%{clxjmain.type1 == false}">国外</s:if>
						<s:else>国内</s:else>
					</s:else></td>
			</tr>
			<tr>
				<td>住址类型：</td>
				<td><s:if test="%{clxjmain.type2 == null}"></s:if> <s:else>
						<s:if test="%{clxjmain.type2 == false}">闲居</s:if>
						<s:else>丛林</s:else>
					</s:else></td>
				<td>所属城市：</td>
				<td><s:property value="%{clxjmain.belongCity}" /></td>
			</tr>
			<tr>
				<td>首图：</td>
				<td colspan="3"><img width="580px" height="300px" src="<%=path %>${clxjmain.firstImgBig}" width="242px"
					height="100px"></td>
			</tr>
			<tr>
				<td>列表图：</td>
				<td colspan="3"><img  width="580px" height="300px" src="<%=path %>${clxjmain.firstImgMin}" width="242px"
					height="100px"></td>
			</tr>
			<tr>
				<td>轮播图片：</td>
				<td colspan="3"><c:forEach items="${url }" var="imgurl">
						<img width="442px" height="300px" src="<%=path %>${imgurl}" width="242px" height="100px">
					</c:forEach></td>
			</tr>
			<tr>
				<td>介绍：</td>
				<td colspan="3">
					<div>
						${clxjmain.introduction }	
					</div>
				</td>
			</tr>
			<tr><c:if test="${clxjmain.type2 ==false}">
				<td>价格：</td>
				<td><s:property value="%{clxjmain.price}" /></td>
				</c:if>
				<td>中文地址：</td>
				<td><s:property value="%{clxjmain.address}" /></td>
			</tr>
			<tr>
				<td>联系号码：</td>  
				<td><s:property value="%{clxjmain.mobile}" /></td>
			</tr>
			<!--<tr> 
				<td>经度：</td>
				<td><s:property value="%{clxjmain.longitude}" /></td>
				<td>纬度：</td>
				<td><s:property value="%{clxjmain.latitude}" /></td>
			</tr>
			--><tr>
				<td>预定次数：</td>
				<td><s:property value="%{clxjmain.reserveNum}" /></td>
				<td>是否推荐：</td>
				<td>
					<c:if test="${ischeckstatus ==1}">
						<c:if test="${clxjmain.checkStatus==2 }">
						<select id="recommend">
							<option value="true" <c:if test="${clxjmain.recommend==true }"> selected="selected"</c:if>>推荐</option>
							<option value="false" <c:if test="${clxjmain.recommend==false }"> selected="selected"</c:if>>不推荐</option>
						</select>
						</c:if>
						<c:if test="${clxjmain.checkStatus!=2 }">
							不推荐
						</select>
						</c:if> 
					</c:if>
					<c:if test="${ischeckstatus !=1}">
  							<c:if test="${clxjmain.recommend ==true}">推荐</c:if> 
 							<c:if test="${clxjmain.recommend ==false}">不推荐</c:if> 
					</c:if> 
				</td>
			</tr>
			<tr>
				<td>注册时间：</td>
				<td><s:property value="%{clxjmain.createtime}" /></td>
				<td>审核状态：</td>
				<td>
					<c:if test="${ischeckstatus ==1}">
						<c:if test="${clxjmain.checkStatus==0 }">
							<select id="clxjmaincheckstatus">
								<option value="2">审核通过</option>
								<option value="1">审核不通过</option>
							</select>
						</c:if>
						<c:if test="${clxjmain.checkStatus==2 }">
								审核通过
						</c:if>
					</c:if>
					<c:if test="${ischeckstatus !=1}">
						<c:choose> 
  							<c:when test="${clxjmain.checkStatus ==0}">正在审核</c:when> 
 							<c:when test="${clxjmain.checkStatus ==1}">审核不通过</c:when>
 							<c:otherwise>
 								审核通过<input type="hidden" id="clxjmaincheckstatus" value="2"/>
 							</c:otherwise> 
						</c:choose> 
					</c:if>
				</td>
			</tr>
			<c:if test="${clxjmain.type2 ==true}">
			<tr>
				<td>寺院主持：</td>
				<td><s:property value="%{clxjmain.abbot}" /></td>
				<td>开放时间：</td>
				<td><s:property value="%{clxjmain.opentime}" /></td>
			</tr>
			<tr>
				<td>介绍：</td>
				<td colspan="3">
					<div> 
						${clxjmain.abbotresume }
					</div>
				</td>
			</tr> 
			</c:if>
  			<c:if test="${ischeckstatus ==1}">
  			<tr>
				<td colspan="4" align="center">
  						<c:if test="${clxjmain.checkStatus==2 }"><input type="button" onclick="change()" value="更改推荐"/></c:if> 
  						<c:if test="${clxjmain.checkStatus==0 }"><input type="button" onclick="change()" value="提交审核"/></c:if>
  					</td>
			</tr>  
  			</c:if>   
		</table>
	</div>
	<script type="text/javascript">
		function change(){
			var id=document.getElementById("clxjmainid").value;
			var recommend=document.getElementById("recommend");
			if(recommend!=null){
				recommend = recommend.value;
			}else{
				recommend = false;
			}
			var checkstatus=document.getElementById("clxjmaincheckstatus");
			if(checkstatus!=null){
				checkstatus = checkstatus.value;
			}else{
				checkstatus = 2;
			}
			$.post("<%=path %>/clxjmain!updateclxjmainOfId.action",
					  {"clxjmain.id":id,"clxjmain.checkStatus":checkstatus,"clxjmain.recommend":recommend},
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