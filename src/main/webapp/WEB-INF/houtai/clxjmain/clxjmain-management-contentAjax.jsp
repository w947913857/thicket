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
<title>修改</title>
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

<!-- 树组件start -->
<script type="text/javascript"
	src="<%=path%>/libs/js/tree/ztree/ztree.js"></script>
<link type="text/css" rel="stylesheet"
	href="<%=path%>/libs/js/tree/ztree/ztree.css"></link>
<!-- 树组件end -->

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
			<table  class="tableStyle" formMode="transparent" id="mytable" > 
			<input type="hidden" value="${clxjmain.id }" name="clxjmain.id"/>
			<input type="hidden" value="1" name="isupdate"/>
				<tr>
					<td width="200">名称：</td>
					<td><input type="text" name="clxjmain.name" id="name" class="validate[required]" 
						watermark="请输入中文" value="${clxjmain.name }" /><span class="star">*</span>
					</td>
				</tr>
				<tr>
					<td>地址类型：</td>
					<td><select name="clxjmainJson.type1"
						class="validate[required]">
							<option value="国内"
								<c:if test="${clxjmain.type1 ==true}">selected="selected"</c:if>>国内</option>
							<option value="国外"
								<c:if test="${clxjmain.type1 ==false}">selected="selected"</c:if>>国外</option>
					</select><span class="star">*</span></td>
					<td width="100">所属城市：</td>
					<td><%-- <input type="text" name="clxjmain.belongCity" id="belongCity" 
						value="${clxjmain.belongCity }" class="validate[required]" />
						<span class="star">*</span> --%>
						<input type="text"    placeholder="输入城市名" id="zmx" data-wholename="" value="${clxjmain.belongCity }">
						<input type="hidden" name="clxjmain.belongCity" id="city"/>
					</td>
					<input type="hidden" name="clxjmain.type2" value="${clxjmain.type2 }"/>
					<%-- <td>住房类型：</td>
					<td><select name="clxjmainJson.type2"
						class="validate[required]">
							<option value="丛林"
								<c:if test="${clxjmain.type2 ==true}">selected="selected"</c:if>>丛林</option>
							<option value="闲居"
								<c:if test="${clxjmain.type2  ==false}">selected="selected"</c:if>>闲居</option>
					</select><span class="star">*</span></td> --%>
				</tr>
				<tr>
					<td width="100" valign="top">首页首图：</td>
					<td colspan="3"><img src="<%=path %>${clxjmain.firstImgBig}" id="imgPre" width="580px" height="300px"/> 
						<input type="hidden" value="${clxjmain.firstImgBig}" name="clxjmain.firstImgBig" id="big"/>
						<input type="file" keepDefaultStyle="true" name="clxjmainFilejson.firstImgBig"
						id="firstImgBig" onchange="preImg(this.id,'imgPre');">
					</td>
				</tr>
				<tr>
					<td width="100" valign="top">列表首图：</td>
					<td colspan="3"><img src="<%=path %>${clxjmain.firstImgMin}" id="imgPre2" width="580px" height="300px"/>
						<input type="hidden" value="${clxjmain.firstImgMin}" name="clxjmain.firstImgMin" id="min"/>
						<input type="file" keepDefaultStyle="true" name="clxjmainFilejson.firstImgMin"
						id="firstImgMin" onchange="preImg2(this.id,'imgPre2');">
					</td>
				</tr>
				<tr>
					<td width="100" valign="top">轮换图：</td>
					<td  width="300"></td>
					<td valign="top"><input type="button" value="增加" onclick="addNewRow2()"></td>
					<td></td>
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
				<input type="hidden" id="imgurl" name="clxjmain.carouselImg" />
				<!-- 轮换图的解决方法stop -->
				
				<tr  id="more">
					<td valign="top">介绍：<input type="hidden" id="url" name="clxjmain.introduction"/></td>
					<td colspan="3">
						<script type="text/plain" id="myEditor">${clxjmain.introduction }</script> 
					</td>
				</tr>
				
				<tr>
					<c:if test="${clxjmain.type2 ==false}">
					<td>价格：</td>
					<td><input type="text" name="clxjmain.price" class="validate[required,custom[onlyNumber]]"
						value="${clxjmain.price }" /><span class="star">*</span>
					</td>
					</c:if>
					<c:if test="${clxjmain.type2 ==true}">
					<input type="hidden" name="clxjmain.price" value="0"/>
					</c:if>
					<td>中文地址：</td>
					<td><input type="text" name="clxjmain.address" class="validate[required]" 
						value="${clxjmain.address }" /><span class="star">*</span>
					</td>
				</tr>
				<tr>
					<td>联系号码：</td>
					<td><input type="text" name="clxjmain.mobile" value="${clxjmain.mobile }" /></td>
				</tr> 
				<input type="hidden" name="clxjmain.longitude" value="${clxjmain.longitude }"/>
				<input type="hidden" name="clxjmain.latitude" value="${clxjmain.latitude }"/>
				<!--<tr>
					<td>经度：</td>
					<td><input type="text" name="clxjmain.longitude" class="validate[required]" 
						value="${clxjmain.longitude }" /><span class="star">*</span>
					</td>
					<td>纬度：</td>
					<td><input type="text" name="clxjmain.latitude" class="validate[required]" 
						value="${clxjmain.latitude }" /><span class="star">*</span>
					</td>
				</tr>
				--><%-- <tr>
					<td>预定次数：</td>
					<td><input type="text" value="${clxjmain.reserveNum}" name="clxjmain.reserveNum"/></td>
					<td>是否推荐：</td>
					<td><select name="clxjmain.recommend" class="validate[required]">
							<option value="true"
								<c:if test="${clxjmain.recommend ==true}">selected="selected"</c:if>>推荐</option>
							<option value="flase"
								<c:if test="${clxjmain.recommend  ==false}">selected="selected"</c:if>>不推荐</option>
						</select><span class="star">*</span>
					</td>
				</tr> --%>
					<input type="hidden" name="clxjmain.reserveNum" value="${clxjmain.reserveNum }"/>
					<input type="hidden" name="clxjmain.recommend" value="${clxjmain.recommend }"/>
					<input type="hidden" name="clxjmain.createtime" value="${clxjmain.createtime }"/>
					<input type="hidden" name="clxjmain.checkStatus" value="${clxjmain.checkStatus }"/>
					<input type="hidden" name="clxjmain.joinid" value="${loginedUser.id}"/>
					<c:if test="${clxjmain.type2 ==true}">
				<tr>
					<td>寺院主持：</td>
					<td><input type="text" name="clxjmain.abbot" value="${clxjmain.abbot }" /></td>
					<td>开放时间：</td>
					<td><input type="text" name="clxjmain.opentime" class="date" value="${clxjmain.opentime }" /></td>
				</tr>
				<tr>
					<td valign="top">主持简介：<input type="hidden" id="url2" name="clxjmain.abbotresume"/></td>
					<td colspan="3">  
						<script type="text/plain" id="myEditor2">${clxjmain.abbotresume }</script> 
						<input type="hidden" id="abbotresume" value="1"/>
					</td>  
				</tr>
				</c:if>
				<tr>
					<td colspan="4">
						<input type="button" id="sub" value="提交" /> 
						<input type="button" value="取消" onclick="top.Dialog.close()" />
					</td>
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
			$('#sub').click(
					function() {
						//获取编辑器的内容 
						GetUrl();
						var abbotresume = $("#abbotresume").val();
						if(abbotresume!=null){
						GetUrl2();
						}
						getFirstfile();
						getfile();
						getCity();
						//判断表单的客户端验证是否通过
						var valid = $('#myFormId').validationEngine({
							returnIsValid : true
						});
						if (valid) {
							$('#myFormId').ajaxSubmit(
									{
										async: false,
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
   			if (navigator.userAgent.indexOf("MSIE")>=1) { // IE 
   			url = document.getElementById(sourceId).value; 
   		} else if(navigator.userAgent.indexOf("Firefox")>0) { // Firefox 
   			url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0)); 
   		} else if(navigator.userAgent.indexOf("Chrome")>0) { // Chrome 
   			url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0)); 
   		} 
   		return url; 
  	 	} 
   		//如果首页和列表图图片都更改了，要把隐藏域清空
		function getFirstfile(){
			if(document.getElementById("firstImgBig").value!=null
					&&document.getElementById("firstImgBig").value!=""){
				document.getElementById("big").value=null;
			}
			if(document.getElementById("firstImgMin").value!=null
					&&document.getElementById("firstImgMin").value!=""){
			document.getElementById("min").value=null;
			}
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
		//控件1，imgurl代表的是图片的src,num是指第一张图片
		function addNewRow(imgurl,num) {
			//图片路径
			var imgurl=imgurl.value;
			imgurl="<%=path%>" + imgurl;
			//创建图片
			var $img = $('<img id="imgurl'+num+'" src="'+imgurl+'"width="442" height="300"/>');
			//创建上传控件
			var $file = $('<input type="file" id="file'+num+'" name="clxjmainFilejson.carouselImg" keepDefaultStyle="true" width="20"/><br/>');
			//创建按钮
			var $delBtn = $('<input type="button" value="移除"  keepDefaultStyle="true" align="left"/>')
			//创建表格行
			var $tr = $('<tr width="100" style=" border: none; background-color: transparent;"><td width="220" style="text-align: right; padding-top: 3px; padding-bottom: 3px; border: none;"></td><td colspan="2" style="padding-top: 3px; padding-bottom: 3px; border: none;"></td><td align="left" style="text-align: right; padding-top: 3px; padding-bottom: 3px; border: none;"></td></tr>');
			//添加进入页面
			$tr.find("td").eq(1).append($img);
			$tr.find("td").eq(2).append($file);
			$tr.find("td").eq(2).append($delBtn);
			$("#mytable").find("#more").before($tr); 
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
					url = window.URL.createObjectURL(document.getElementById("file" + num).files.item(0));
				} else if (navigator.userAgent.indexOf("Chrome") > 0) { // Chrome 
					url = window.URL.createObjectURL(document.getElementById("file" + num).files.item(0));
				}
				document.getElementById("imgurl" + num).src = url;
			});
		}
		//控件2
		function addNewRow2() {
			var num = document.getElementById("num").value;
			num =parseInt(num)+1;  
			document.getElementById("num").value=num; 
			//创建图片
			var $img = $('<img id="imgurl'+num+'" width="442" height="300"/>');
			//创建上传控件
			var $file = $('<input type="file" id="file'+num+'"  name="clxjmainFilejson.carouselImg" keepDefaultStyle="true" width="20"/><br/>');
			//创建按钮
			var $delBtn = $('<input type="button" value="移除"  keepDefaultStyle="true" align="left"/>')
			//创建表格行
			var $tr = $('<tr width="100" style=" border: none; background-color: transparent;"><td width="220" style="text-align: right; padding-top: 3px; padding-bottom: 3px; border: none;"></td><td colspan="2" style="padding-top: 3px; padding-bottom: 3px; border: none;"></td><td align="left" style="text-align: right; padding-top: 3px; padding-bottom: 3px; border: none;"></td></tr>');
			//添加进入页面
			$tr.find("td").eq(1).append($img);
			$tr.find("td").eq(2).append($file); 
			$tr.find("td").eq(2).append($delBtn);
			$("#mytable").find("#more").before($tr);

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
		//获取编辑器的内容
		function GetUrl() {
			var arr = [];
			arr.push(UE.getEditor('myEditor').getContent());
			document.getElementById("url").value = arr;
		}
		//获取编辑器2的内容
		function GetUrl2() {
			var arr2 = [];
			arr2.push(UE.getEditor('myEditor2').getContent());
			document.getElementById("url2").value = arr2;
		} 
		//将城市转换为拼音
		function getCity(){
			var citypy = $('#zmx').attr('data-wholename');
			var city = document.getElementById("city");
			if(citypy!=""){
				city.value = citypy+"|"+$('#zmx').val(); 
			}else{
				city.value = $('#zmx').val();
				}
		}  
	</script>
	<!-- 异步提交end -->
	<!-- //编辑器 -->
	<script type="text/javascript">
								var editorOption = {};
								var editor_a = new baidu.editor.ui.Editor(editorOption);
								editor_a.render('myEditor');
								var abbotresume = $("#abbotresume").val();
								if(abbotresume!=null){
								var editorOption2 = {};
								var editor_a2 = new baidu.editor.ui.Editor(editorOption2);
								editor_a2.render('myEditor2');
								}
	</script>
</body>
</html>