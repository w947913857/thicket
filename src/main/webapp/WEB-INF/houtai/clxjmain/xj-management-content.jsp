<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>增加</title>
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

<!-- 异步上传控件start -->
<script type="text/javascript"
	src="<%=path%>/libs/js/form/upload/fileUpload.js"></script>
<script type="text/javascript"
	src="<%=path%>/libs/js/form/upload/handlers.js"></script>
<!-- 异步上传控件end -->

<!--ueEditor编辑器start-->
<script>
 window.UEDITOR_HOME_URL = "<%=path%>/libs/thirdparty/ueditor/";
</script>
<script type="text/javascript" charset="utf-8"
	src="<%=path%>/libs/thirdparty/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8"
	src="<%=path%>/libs/thirdparty/ueditor/ueditor.all.js"></script>
<!--ueEditor编辑器stop-->
<!-- 城市选择器start -->
<!--<script type='text/javascript' src='<%=path%>/libs/js/citylist.js'></script>-->
<script type='text/javascript' src='<%=path%>/libs/js/querycityback.js'></script>
<link href='<%=path%>/libs/css/cityquery.css' rel="stylesheet" type="text/css" />
<!-- 城市选择器stop -->
</head>
<body>
	<form id="myFormId" action="<%=path%>/clxjmain!saveClxjmain.action"
		method="post" target="frmright" enctype="multipart/form-data">
		<div class="box1" id="formContent" whiteBg="true">
			<table class="tableStyle"  formMode="transparent">  
			<input type="hidden" name="clxjmain.joinid" value="${loginedUser.id}"/>
				<tr>
					<td width="20">名称：</td>
					<td><input type="text" name="clxjmain.name"
						class="validate[required]" watermark="请输入中文" /><span
						class="star">*</span><input type="hidden" value="0"
						name="isupdate" /></td>
					<td width="100">所属城市：</td>
					<td><input type="text"    placeholder="输入城市名" id="zmx" data-wholename="" />
						<input type="hidden" name="clxjmain.belongCity" id="city"/></td>
				</tr>
				<tr>   
					<td>地址类型：</td> 
					<td><select name="clxjmainJson.type1"
						class="validate[required]">
							<option value="国内">国内</option>
							<option value="国外">国外</option>
					</select><span class="star">*</span></td>
					<%-- <td>住房类型：</td>
					<td><select name="clxjmainJson.type2"
						class="validate[required]">
							<option value="丛林">丛林</option>
							<option value="闲居">闲居</option>
					</select><span class="star">*</span></td> --%> 
					<input type="hidden" name="clxjmain.type2" value="false" />
				</tr>
				<tr>
					<td width="100" valign="top">首页首图：</td>
					<td colspan="3"><img src="" id="imgPre" width="580px" height="300px"/> 
							<input type="file" keepDefaultStyle="true"
							name="clxjmainFilejson.firstImgBig" id="firstImgBig"
							onchange="preImg(this.id,'imgPre');"/></td>
				</tr>
				<tr>
					<td width="100" valign="top">列表首图：</td>
					<td colspan="3"><img src="" id="imgPre2" width="580px" height="300px"/>
							<input type="file" keepDefaultStyle="true"
							name="clxjmainFilejson.firstImgMin" id="firstImgMin"
							onchange="preImg2(this.id,'imgPre2');"/></td>
				</tr>
				<tr>
					<td width="100" valign="top">轮换图：</td>
					<td id="more" width="300" colspan="2"><img src="" id="imgPre3"
						width="442px" height="300px"/><input type="file"
							keepDefaultStyle="true" name="clxjmainFilejson.carouselImg"
							id="carouselImg" onchange="preImg3(this.id,'imgPre3');" /></td>
					<td valign="top"><input type="button" value="增加" onclick="addMore()"/> </td>
				</tr>
				<tr>
					<td valign="top">介绍：<input type="hidden" id="url" name="clxjmain.introduction"/></td>
					<td colspan="3"><script type="text/plain" id="myEditor"></script> 
					</td>
				</tr> 
				<tr>
					<td>价格：</td>
					<td><input type="text" class="validate[required,custom[onlyNumber]]"  name="clxjmain.price"/><span class="star">*</span></td>
					<td>中文地址：</td>
					<td><input type="text" name="clxjmain.address"
						class="validate[required]" /><span class="star">*</span></td>
				</tr>
				<tr>
					<%-- <td>价格：</td>
					<td><input type="text" name="clxjmain.price"
						class="validate[required,custom[onlyNumber]]" /><span
						class="star">*</span></td> --%>
					<td>联系号码：</td>  
					<td><input type="text" name="clxjmain.mobile"
						class="validate[required]" /><span class="star">*</span></td>
				</tr>
				<input type="hidden" name="clxjmain.longitude" value="11"/>
				<input type="hidden" name="clxjmain.latitude" value="11"/>
				<!--<tr>
					<td>经度：</td>
					<td><input type="text" name="clxjmain.longitude"
						class="validate[required]" /><span class="star">*</span></td>
					<td>纬度：</td>
					<td><input type="text" name="clxjmain.latitude"
						class="validate[required]" /><span class="star">*</span></td>
				</tr>
				--><!-- <tr>
					<td>寺院主持：</td>
					<td><input type="text" name="clxjmain.abbot" /></td>
					<td>开放时间：</td>
					<td><input type="text" name="clxjmain.opentime"
						class="date" /></td>
				</tr> -->
				<tr>
					<td colspan="4"><input type="submit" value="提交" /> <input
						type="button" value="取消" onclick="top.Dialog.close()" /></td>  
				</tr>
			</table>
		</div>
	</form>
	<!-- 异步提交start -->
	<script type="text/javascript">
	//新方法，从数据库获得每种类型的城市的id
	var labelFromcity = new Array(); 
	labelFromcity['热门城市'] = new Array();  
	labelFromcity ['A-F'] = new Array(); 
	labelFromcity ['G-J'] = new Array();  
	labelFromcity ['K-N'] = new Array(); 
	labelFromcity ['O-W'] = new Array(); 
	labelFromcity ['X-Z'] = new Array();
	labelFromcity ['国际城市'] = new Array();
	var hotList = new Array(14,15,16,17,18,19);
	$.ajax({  
	    type : "post",  
	     url : "<%=path %>/city!selCityType.action",  
	     data: {},
	     dataType: "json",
	     async : false,     
	     success : function(results){   
	         for(var i =0;i<results.citytypes.rm.length;i++){
	        	 labelFromcity['热门城市'][i]=results.citytypes.rm[i].id;
	          }
	         for(var i =0;i<results.citytypes.a_f.length;i++){
	        	 labelFromcity[['A-F']][i]=results.citytypes.a_f[i].id;
	          }
	         for(var i =0;i<results.citytypes.g_j.length;i++){
	        	 labelFromcity[['G-J']][i]=results.citytypes.g_j[i].id;
	          }  
	         for(var i =0;i<results.citytypes.k_n.length;i++){
	        	 labelFromcity[['K-N']][i]=results.citytypes.k_n[i].id;
	          }  
	         for(var i =0;i<results.citytypes.o_w.length;i++){
	        	 labelFromcity[['O-W']][i]=results.citytypes.o_w[i].id;
	          }  
	         for(var i =0;i<results.citytypes.x_z.length;i++){
	        	 labelFromcity[['X-Z']][i]=results.citytypes.x_z[i].id;
	          }
	         for(var i =0;i<results.citytypes.gjcs.length;i++){
	        	 labelFromcity ['国际城市'][i]=results.citytypes.gjcs[i].id;
	          }    
	     }   
	});
		function initComplete() {
			//新方法，加载页面的时候把所有的城市的数据加载出来
			var citysFlight=new Array();
			$.ajax({  
		        type : "post",  
		         url : "<%=path %>/city!initializeCity.action",  
		         data: {},
		         dataType: "json",
		         async : false,     
		         success : function(results){  
		             for(var i =0;i<results.citys.length;i++){
		            	 citysFlight[results.citys[i].id]=new Array('',results.citys[i].chinese,results.citys[i].pinyin,results.citys[i].abbreviations);
		                 }
		         }   
		    });
			$('#zmx').querycity({'data':citysFlight,'tabs':labelFromcity,'hotList':hotList});
			//表单提交
			$('#myFormId').submit(
					function() {
						GetUrl(); 
						getCity();
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
		 * 将首页首图 显示到浏览器上 
		 */
		function preImg(sourceId, targetId) {
			var url = getFileUrl(sourceId);
			var imgPre = document.getElementById(targetId);
			imgPre.src = url;
		}
		/** 
		 * 将列表图 显示到浏览器上  
		 */
		function preImg2(sourceId, targetId) {
			var url = getFileUrl(sourceId);
			var imgPre2 = document.getElementById(targetId);
			imgPre2.src = url;
		}
		/** 
		 * 从 file 域获取 本地图片 url 
		 */
		function getFileUrl(sourceId) {
			var url;
			if (navigator.userAgent.indexOf("MSIE") >= 1) { // IE 
				url = document.getElementById(sourceId).value;
			} else if (navigator.userAgent.indexOf("Firefox") > 0) { // Firefox 
				url = window.URL.createObjectURL(document
						.getElementById(sourceId).files.item(0));
			} else if (navigator.userAgent.indexOf("Chrome") > 0) { // Chrome 
				url = window.URL.createObjectURL(document
						.getElementById(sourceId).files.item(0));
			}
			return url;
		}
		/** 
		 * 轮换图片显示到浏览器上   
		 */
		function preImg3(sourceId, targetId) {
			var url = getFileUrl(sourceId);
			var imgPre3 = document.getElementById(targetId);
			imgPre3.src = url;
		}
		//增加上传器
		function addMore() {
			var td = document.getElementById("more");
			var br = document.createElement("br");
			var input = document.createElement("input");
			var button = document.createElement("input");
			var newImg = document.createElement("img");
			
			newImg.width = "442";
			newImg.height = "300";

			input.type = "file";
			input.name = "clxjmainFilejson.carouselImg";

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
		//获取编辑器的内容
		function GetUrl() {
			var arr = [];
			arr.push(UE.getEditor('myEditor').getContent());
			document.getElementById("url").value = arr;
		}
		//将城市转换为拼音
		function getCity(){
			var citypy = $('#zmx').attr('data-wholename');
			var city = document.getElementById("city");
			city.value = citypy+"|"+$('#zmx').val();
		}
	</script>
	<script type="text/javascript">
								var editorOption = {};
								var editor_a = new baidu.editor.ui.Editor(
										editorOption);
								editor_a.render('myEditor');
							</script>
	<!-- 异步提交end -->
</body>
</html>