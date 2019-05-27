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
<title>修改车辆信息</title>
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/" />
<link rel="stylesheet" type="text/css" id="customSkin" />
<!--框架必需end-->

<!-- 日期控件start -->
<script type="text/javascript"
	src="<%=path%>/libs/js/form/datePicker/WdatePicker.js"></script>
<!-- 日期控件end -->


<!-- 表单验证start -->
<script src="<%=path%>/libs/js/form/validationRule.js"
	type="text/javascript"></script>
<script src="<%=path%>/libs/js/form/validation.js"
	type="text/javascript"></script>
<!-- 表单验证end -->

<!-- 表单异步提交start -->
<script src="<%=path%>/libs/js/form/form.js" type="text/javascript"></script>
<!-- 表单异步提交end -->

</head>
<body>
	<form id="myFormId" action="<%=path%>/carinfo!saveCarinfo.action"
		method="post" target="frmright" enctype="multipart/form-data">
		<div class="box1" id="formContent" whiteBg="true">
			<table id="mytable" class="tableStyle" formMode="transparent">
				<input type="hidden" value="${carinfoJson.id }" name="carinfo.id" />
				<input type="hidden" value="1" name="isupdate" />
				<tr>
					<td>丛林闲居名称：</td>
					<td><input type="text" disabled="disabled"
						value="${carinfoJson.clxjname }" /> <input type="hidden"
						value="${carinfoJson.cid }" name="carinfo.cid" /></td>
					<td width="100px">申请人名字：</td>
					<td><input type="text" disabled="disabled"
						value="${carinfoJson.joinName }" /> <input type="hidden"
						value="${carinfoJson.joinid }" name="carinfo.joinid" /></td>
				</tr>
				<tr>
					<td>标题：</td>
					<td><input type="text" name="carinfo.cartitle"
						class="validate[required]" value="${carinfoJson.cartitle }" /><span
						class="star">*</span></td>
					<td>汽车牌照：</td>
					<td width="200"><input type="text" name="carinfo.licence"
						class="validate[required]" value="${carinfoJson.licence }" /><span
						class="star">*</span></td>
				</tr>
				<tr>
					<td>价格：</td>
					<td><input type="text" name="carinfo.price"
						class="validate[required,custom[onlyNumber]]"
						value="${carinfoJson.price }" /><span class="star">*</span></td>
						<input type="hidden" value="${carinfo.checkstatus }" name="carinfo.checkstatus"/>
					<%-- <td>审核状态：</td>
					<td><select name="carinfo.checkstatus">
							<option value="2" <c:if test="${carinfo.checkstatus ==2}">selected="selected"</c:if> >审核通过</option>
							<option value="1" <c:if test="${carinfo.checkstatus ==1}">selected="selected"</c:if> >审核不通过</option>
							<option value="0" <c:if test="${carinfo.checkstatus ==0}">selected="selected"</c:if> >正在审核</option>
					</select></td> --%>
				</tr>
				<tr>
					<td valign="top">轮换图：</td>
					<td id="more"><input type="button" value="增加" onclick="addNewRow2()"><br />
					</td>
				</tr>
				
				<!-- 轮换图的解决方法 start-->
				<c:forEach items="${url }" var="imgurl">
					<c:set var="sum" value="${sum+1}" scope="request" />
					<!-- 每一次循环的不同照片的url，id随着sum改变 -->
					<input type="hidden" id="img<%=request.getAttribute("sum") %>" value="${imgurl }" />
					<script type="text/javascript">
							addNewRow(img<%=request.getAttribute("sum") %>,<%=request.getAttribute("sum") %>);
					</script>
				</c:forEach>
				<!-- num开始是之前总数量，随着我们增加控件而增加，从而控制控件的ID不同 -->
				<input type="hidden" id="num" value="<%=request.getAttribute("sum")%>" />
				<!-- sum修改之前总数量 -->
				<input type="hidden" id="sum" value="<%=request.getAttribute("sum")%>" />
				<!-- imgurl之前的图片的url，随着删除也改变 -->
				<input type="hidden" id="imgurl" name="carinfo.carouselImg" />
				<!-- 轮换图的解决方法stop -->
				
				<tr>
					<td colspan="4" align="center">
						<input type="submit" value="提交" />
						<input type="button" value="取消" onclick="top.Dialog.close()" />
					</td>
				</tr>
			</table>
		</div>
	</form>

	<!-- 异步提交start -->
	<script type="text/javascript">
		function initComplete() {
			//表单提交
			$('#myFormId').submit(
					function() {
						getfile();
						//判断表单的客户端验证是否通过
						var valid = $('#myFormId').validationEngine({
							returnIsValid : true
						});
						if (valid) {
							$(this).ajaxSubmit(
									{
										//表单提交成功后的回调
										success : function(responseText,
												statusText, xhr, $form) {
											top.Dialog.alert(
													responseText.message,
													function() {
														closeWin();
													})
										}
									});
						}
						//阻止表单默认提交事件
						return false;
					});
		}
		//如果File为空则用之前的值
		function getfile(){
			var sum = document.getElementById("sum").value;
			var imgurl = "";
			for(var i = 1;i<=sum;i++){
				var imgi="img"+i;
				var filei="file"+i;
				//当某个控件被删除
				if(document.getElementById(filei)!=null){ 
				var img = document.getElementById(imgi).value;
				var file = document.getElementById(filei).value;
				//当控件没有上传新图片
				if(file==""){
					imgurl+=img+"|";
					}
				}else{
					imgurl+="";
				}
			}
			//将剩下的空间的图片传给隐藏域
			document.getElementById("imgurl").value=imgurl;
		}
		//重置
		function closeWin() {
			//刷新数据
			top.frmright.refresh(true);
			//关闭窗口
			top.Dialog.close();
		}
		//控件1，imgurl代表的是图片的src,num是指第一张图片
		function addNewRow(imgurl,num) {
			//图片路径
			var imgurl=imgurl.value;
			imgurl="<%=path%>" + imgurl;
			//创建图片
			var $img = $('<img id="imgurl'+num+'" src="'+imgurl+'"width="200" height="100"/>');
			//创建上传控件
			var $file = $('<input type="file" id="file'+num+'" name="carinfoFileJson.file" keepDefaultStyle="true" width="20"/><br/>');
			//创建按钮
			var $delBtn = $('<input type="button" value="移除"  keepDefaultStyle="true" align="left"/>')
			//创建表格行
			var $tr = $('<tr width="100" style=" border: none; background-color: transparent;"><td width="220" style="text-align: right; padding-top: 3px; padding-bottom: 3px; border: none;"></td><td style="padding-top: 3px; padding-bottom: 3px; border: none;"></td><td colspan="2" align="left" style="text-align: right; padding-top: 3px; padding-bottom: 3px; border: none;"></td></tr>');
			//添加进入页面
			$tr.find("td").eq(1).append($img);
			$tr.find("td").eq(2).append($file);
			$tr.find("td").eq(2).append($delBtn);
			$("#mytable").find("tr").last().before($tr);

			//点击移除的时候删除控件
			$delBtn.click(function() {
				//将所在的行删除
				$(this).parents("tr").remove()
			});

			//file改变图片也改变
			$file.change(function() {
				var url;
				if (navigator.userAgent.indexOf("MSIE") >= 1) { // IE 
					url = document.getElementById("file" + num).value;
				} else if (navigator.userAgent.indexOf("Firefox") > 0) { // Firefox 
					url = window.URL.createObjectURL(document
							.getElementById("file" + num).files.item(0));
				} else if (navigator.userAgent.indexOf("Chrome") > 0) { // Chrome 
					url = window.URL.createObjectURL(document
							.getElementById("file" + num).files.item(0));
				}
				document.getElementById("imgurl" + num).src = url;
			});
		}
		//控件2
		function addNewRow2() {
			var num = document.getElementById("num").value;
			num =parseInt(num)+1
			document.getElementById("num").value=num; 
			//创建图片
			var $img = $('<img id="imgurl'+num+'" width="200" height="100"/>');
			//创建上传控件
			var $file = $('<input type="file" id="file'+num+'"  name="carinfoFileJson.file" keepDefaultStyle="true" width="20"/><br/>');
			//创建按钮
			var $delBtn = $('<input type="button" value="移除"  keepDefaultStyle="true" align="left"/>')
			//创建表格行
			var $tr = $('<tr width="100" style=" border: none; background-color: transparent;"><td width="220" style="text-align: right; padding-top: 3px; padding-bottom: 3px; border: none;"></td><td style="padding-top: 3px; padding-bottom: 3px; border: none;"></td><td colspan="2" align="left" style="text-align: right; padding-top: 3px; padding-bottom: 3px; border: none;"></td></tr>');
			//添加进入页面
			$tr.find("td").eq(1).append($img);
			$tr.find("td").eq(2).append($file);
			$tr.find("td").eq(2).append($delBtn);
			$("#mytable").find("tr").last().before($tr);

			//点击移除的时候删除控件
			$delBtn.click(function() {
				//将所在的行删除
				$(this).parents("tr").remove()
			});

			//file改变图片也改变
			$file.change(function() {
				var url;
				if (navigator.userAgent.indexOf("MSIE") >= 1) { // IE 
					url = document.getElementById("file" + num).value;
				} else if (navigator.userAgent.indexOf("Firefox") > 0) { // Firefox 
					url = window.URL.createObjectURL(document
							.getElementById("file" + num).files.item(0));
				} else if (navigator.userAgent.indexOf("Chrome") > 0) { // Chrome 
					url = window.URL.createObjectURL(document
							.getElementById("file" + num).files.item(0));
				}
				document.getElementById("imgurl" + num).src = url;
			});
		}
	</script>
	<!-- 异步提交end -->
</body>
</html>