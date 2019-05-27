<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<% 
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>导入文件</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--框架必需start-->
	<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
	<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
	<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
	<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/"/>
	<link rel="stylesheet" type="text/css" id="customSkin"/>
	<!--框架必需end-->
	<!-- 表单验证start -->
<script src="<%=path%>/libs/js/form/validationRule.js" type="text/javascript"></script>
<script src="<%=path%>/libs/js/form/validation.js" type="text/javascript"></script>
<!-- 表单验证end -->
	
	<!-- 表单异步提交start -->
<script src="<%=path%>/libs/js/form/form.js" type="text/javascript"></script>
<!-- 表单异步提交end -->
  </head>
  
  <body>
  	<form action='<%=path%>/grant!importData.action' target="frmright"  enctype='multipart/form-data' method='post' id='uplodFileForm'>
  	<input type="hidden" name="type" value="<%=request.getParameter("type") %>"/>
  	<input type="hidden" name="suffix" id="suffix"/>
  	<div class="padding_top20 padding_left25">
  	<table>
  		<tr>
  			<td><input type='file' id='grantDataFile' name='grantDataFile' showInfo="false"/></td>
  			<td>
  			<button type="button" id="sub"><span class="icon_xls">导入</span></button>
  			</td>
  		</tr>
  		<tr>
  			<td colspan="2" class="padding_top5">说明：导入的excel需要遵循规定的格式</td>
  		</tr>
  		<tr>
  			<td colspan="2"><a href="<%=path%>/grant/grant.xls" class="red underline">点击这里</a>下载导入的excel数据模板</td>
  		</tr>
  	</table>
  	</div>
	</form>
	<script>
	function initComplete(){
	    //表单提交
	    $('#sub').click(function(){ 
		    //判断表单的客户端验证是否通过
		    var fileurl=$("#grantDataFile").val();
		    var suffix=fileurl.substring(fileurl.lastIndexOf("."),fileurl.length) ;
	    	if($("#grantDataFile").val()==""){
				top.Dialog.alert("请选择Excel文件");
				return false;
			}
			if(suffix.toLowerCase()!=".xls"&&suffix.toLowerCase()!=".xlsx")
			{
				top.Dialog.alert("请选择Excel文件");
				return false;
				}
			$("#suffix").val(suffix.toLowerCase());
				var valid = $('#uplodFileForm').validationEngine({returnIsValid: true});
				if(valid){
				   $('#uplodFileForm').ajaxSubmit({
				        //表单提交成功后的回调
				        success: function(responseText, statusText, xhr, $form){

					   //alert(responseText.status);
				        
				       if(responseText.status=="true"){
				    	   top.Dialog.confirm(responseText.message+", 需要继续操作吗?",function(){
					    	                  
					    	                  		$("#uplodFileForm")[0].reset();
					    	                  		window.location.reload();
					    	                  },function(){
						    	                  
					    	                	  	top.frmright.searchHandler();
					    	                	  	top.Dialog.close();
						    	               });
				    	  	
					    }else{

					    	  top.Dialog.alert(responseText.message);
					    	  window.location.reload();
					    }
				        }
				    }); 
				 }
			    //阻止表单默认提交事件
			    return false; 
		});
	}
	</script>
  </body>
</html>
