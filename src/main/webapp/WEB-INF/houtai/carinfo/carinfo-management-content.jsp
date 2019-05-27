<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>增加车辆</title>
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


<!-- 树形下拉框start -->
<script type="text/javascript"
	src="<%=path%>/libs/js/form/selectTree.js"></script>
<!-- 树形下拉框end -->

<!-- 表单验证start -->
<script src="<%=path%>/libs/js/form/validationRule.js"
	type="text/javascript"></script>
<script src="<%=path%>/libs/js/form/validation.js"
	type="text/javascript"></script>
<!-- 表单验证end -->

<!-- 表单异步提交start -->
<script src="<%=path%>/libs/js/form/form.js" type="text/javascript"></script>
<!-- 表单异步提交end -->

<!--提示下拉框start-->
<script src="<%=path%>/libs/js/form/suggestion.js"  type="text/javascript"></script>
<!--提示下拉框end-->


<!-- 异步上传控件start -->
<script type="text/javascript"
	src="<%=path%>/libs/js/form/upload/fileUpload.js"></script>
<script type="text/javascript"
	src="<%=path%>/libs/js/form/upload/handlers.js"></script>
<!-- 异步上传控件end -->

</head>
<body>

	<form id="myFormId" action="<%=path%>/carinfo!saveCarinfo.action"
		method="post" target="frmright" enctype="multipart/form-data">
		<div class="box1" id="formContent" whiteBg="true">
			<table class="tableStyle" formMode="transparent" width="400"
				align="center">
				<tr>
					<td width="100px">丛林闲居名称：</td>
					<td>	
     					
 						<div class="suggestion" id="suggestion2" keepDefaultStyle="true" name="carinfo.cid" 
						class="validate[required]" ></div><span
						class="star">*</span><input type="hidden" value="0"
						name="isupdate" /><input type="hidden" value="${loginedUser.id}"
						name="carinfo.joinid" />						
				   </td>
				</tr>
				<tr>
					<td>标题：</td>
					<td><input type="text" name="carinfo.cartitle"
						class="validate[required]" /><span class="star">*</span></td>
				</tr>
				<tr>
					<td valign="top">轮换图：</td>
					<td id="more"><input type="button" value="增加"
						onclick="addMore()" /><br />
					<img src="" id="imgPre" width="242px" height="100px"><input
							type="file" keepDefaultStyle="true"
							name="carinfoFileJson.file" id="file"
							onchange="preImg(this.id,'imgPre');" /></td>
				</tr>
				<tr>
					<td>价格：</td>
					<td><input type="text" name="carinfo.price"
						class="validate[required,custom[onlyNumber]]" /><span
						class="star">*</span></td>
				</tr>
				<tr>
					<td>汽车牌照：</td>
					<td><input type="text" name="carinfo.licence"
						class="validate[required]" /><span class="star">*</span></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="提交" />
						<input type="button" value="取消" onclick="top.Dialog.close()" /></td>
				</tr>
			</table>
		</div>
	</form>
	<!-- 异步提交start -->
	
	<script type="text/javascript">

	function InitTable() {  
		$.ajax({  
	        type : "post",  
	         url : "<%=path%>/clxjmain!ClxjmainName.action",   
	         async : false,   
	         success : function(results){ 
	        	 var lists = [];  
	               for(var i=0;i<results.list.length;i++){
	            	   var a=results.list[i];
	            	    lists[i]={value:a.id,key:a.name,suggest:a.name};
	               }   
	               var listdata={"list":lists};
	      			$("#suggestion2").data("data",listdata);
	    			$("#suggestion2").render();
	         }      
	    });     
	} 


	


	
		function initComplete() {
			InitTable();

			//表单提交
			$('#myFormId').submit(
					function() {
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

		//重置
		function closeWin() {
			//刷新数据
			top.frmright.refresh(true);
			//关闭窗口
			top.Dialog.close();
		}
		/** 
		 * 从 file 域获取 本地图片 url 
		 */
		function getFileUrl(sourceId) {
			var url;
			if (navigator.userAgent.indexOf("MSIE") !=-1) { // IE 
				var file = document.getElementById(sourceId);
				file.select();
				url = document.selection.createRange().htmlText;    
			} else if (navigator.userAgent.indexOf("Firefox") > 0) { // Firefox 
				url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0));
			} else if (navigator.userAgent.indexOf("Chrome") > 0) { // Chrome 
				url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0));
			}else{
				url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0));}
			return url;
		}
		/**  
		 * 轮换图片显示到浏览器上   
		 */
		function preImg(sourceId, targetId) {
			var url = getFileUrl(sourceId);
			var imgPre = document.getElementById(targetId);
			if (navigator.userAgent.indexOf("MSIE") !=-1) { // IE 
				imgPre.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale);";
			   	imgPre.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = url;
			}else{
				imgPre.src = url;
			}
		}
		//增加上传器
		function addMore() {
			var td = document.getElementById("more");
			var br = document.createElement("br");
			var input = document.createElement("input");
			var button = document.createElement("input");
			var newImg = document.createElement("img");
			
			newImg.width = "242";
			newImg.height = "100";

			input.type = "file";
			input.name = "carinfoFileJson.file";

			button.type = "button";
			button.value = "移除";

			input.onchange = function() {
				var url;
				if (navigator.userAgent.indexOf("MSIE") >= 1) { // IE 
					url = input.value;
				} else if (navigator.userAgent.indexOf("Firefox") > 0) { // Firefox 
					url = window.URL.createObjectURL(input.files.item(0));
				} else if (navigator.userAgent.indexOf("Chrome") > 0) { // Chrome 
					url = window.URL.createObjectURL(input.files.item(0));
				}else{
					url = window.URL.createObjectURL(input.files.item(0));
				}
				newImg.src = url;
			};

			button.onclick = function() {
				td.removeChild(br);
				td.removeChild(newImg);
				td.appendChild(br);
				td.removeChild(button);
				td.removeChild(input);
			}
			td.appendChild(br);
			td.appendChild(newImg);
			td.appendChild(br);
			td.appendChild(button);
			td.appendChild(input);
		}
		function dynamic(){
			var $sugg = $('<div type="text" class="selectSuggestion"></div>');
			$sugg.data("data",listdata);
			$("#testBtn").after($sugg);   
			$("#testBtn").after($("<br/>"));   
			//渲染
			$sugg.render();
		}

		
	</script>
	<!-- 异步提交end -->
</body>
</html>