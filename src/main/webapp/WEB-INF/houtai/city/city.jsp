<%@page language="java" pageEncoding="UTF-8"%>
<% 
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>城市信息</title>
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/" scrollerY="false"/>
<link rel="stylesheet" type="text/css" id="customSkin"/>
<!--框架必需end-->


<!--数据表格start-->
<script src="<%=path%>/libs/js/table/quiGrid.js" type="text/javascript"></script>
<!--数据表格end-->

<!-- 表单start -->
<script src="<%=path%>/libs/js/form/form.js" type="text/javascript"></script>
<!-- 表单end -->

</head>
<body>
	<table width="100%" >
	<tr>
		<!--右侧区域start-->
		<td width="100%" class="ver01" >
			<div class="box2" panelTitle="查询" showStatus="false">
				<form action="<%=path%>/city!getCityOfPager.action" id="queryForm" method="post">
				<table>
					<tr>
						<td>城市中文：</td>
						<td>
							<input type="text" id="name" name="city.chinese"/>
							<input type="text" style="width:2px;display:none;"/>
						</td>
						<td><button type="button" onclick="searchHandler()"><span class="icon_find">查询</span></button></td>
						<td><button type="button" onclick="resetSearch()"><span class="icon_reload">重置查询</span></button></td>
					</tr>
				</table>
				</form>  
				</div>
				<div class="padding_right5">
					<div id="dataBasic"></div>
				</div>
		</td>
		<!--右侧区域end-->
	</tr>
	</table>
<script type="text/javascript">
	
	//定义grid
	var grid = null;
	//初始化函数
	function initComplete(){
		//当提交表单刷新本页面时关闭弹窗
		top.Dialog.close();
		
		//初始化grid组件
		initGrid();
		//监听查询框的回车事件 
		 $("#searchInput").keydown(function(event){
		 	if(event.keyCode==13){
				searchHandler();
			}
		 })
	}
	
	//初始化Grid处理
	function initGrid() {
		grid = $("#dataBasic").quiGrid({
			columns:[
				{ display: '城市中文', name: 'chinese', 	 align: 'align', width: "10%"},
				{ display: '城市拼音', name: 'pinyin', 	 align: 'align', width: "10%"},
				{ display: '城市拼音缩写', name: 'abbreviations', 	 align: 'align', width: "10%"},
				{ display: '城市所属分组', name: 'groupType', 	 align: 'align', width: "15%"},
				{ display: '是否禁用', isAllowHide: false, align: 'center', width:"10%", 
					 render: function (rowdata, rowindex, value, column){
                	    return "1"==rowdata.status?"<input type='button' id='b"+rowdata.id+"' name='b"+rowdata.id+"' value='禁用' relValue='1' onclick='changestatus("+rowdata.id+")'>":"<input type='button' id='b"+rowdata.id+"' name='b"+rowdata.id+"' value='启用' relValue='0' onclick='changestatus("+rowdata.id+")'>";
	                 } 
	        	},  
			    { display: '操作', isAllowHide: false, align: 'align', width:"5%",   
						 render: function (rowdata, rowindex, value, column){
	                 	    return '<div class="padding_top4 padding_left5">' 
	                                 + '<span class="img_list hand" title="修改" onclick="onView(' + rowdata.id + ')"></span>'
	                                /*  + '<span class="img_edit hand" title="修改" onclick="onEdit(' + rowdata.id + ')"></span>' 
	                                 + '<span class="img_delete hand" title="删除" onclick="onDelete(' + rowdata.id+','+rowindex + ')"></span>'
	                             + '</div>' */;    
		                 }
		            }
			  ],  
		 url: '<%=path%>/city!getCityOfPager.action', sortName: 'id',rownumbers:true,
         height: '100%', width:"100%",pageSize:10, 
        
         toolbar:{ 
        	 items:[
        		  {text: '新增', click: addUnit,    iconClass: 'icon_add'},
        		  { line : true }/*,
        		  {text: '批量删除', click: deleteUnit, iconClass: 'icon_delete'},
        		  { line : true },
        		   {text: '导入', click: showImportDialog, iconClass: 'icon_import'},
        		  { line : true },
        		  {text: '导出当前页', click: exportPageData, iconClass: 'icon_export'},
        		  { line : true },
        		  {text: '导出全部', click: exportTotalData, iconClass: 'icon_export'} */
        		]
         	}
		});
	}
	

	//新增
	function addUnit() {
		top.Dialog.open({
				URL:"<%=path%>/city/addcity.jsp",   
				Title:"添加",Width:700,Height:450});  
	} 
	
	//修改
	function onView(rowid){
		top.Dialog.open({
			URL:"<%=path%>/city!getCityOfid.action?city.id=" + rowid,
			Title:"修改",Width:700,Height:430}); 
	} 
		
    
    //查询
    function searchHandler(){
    	 var query = $("#queryForm").formToArray(); 
		 grid.setOptions({ params : query});
		 //页号重置为1
		 grid.setNewPage(1);
		//刷新表格数据 
		grid.loadData();
    }
    
    //重置查询
    function resetSearch(){
    	$("#queryForm")[0].reset();
		searchHandler();
    }
    
    //刷新表格数据并重置排序和页数
    function refresh(isUpdate){
    	if(!isUpdate){
    		//重置排序
        	grid.options.sortName='userId';
        	grid.options.sortOrder="desc";
        	//页号重置为1
    		grid.setNewPage(1);
    	}
    	
    	grid.loadData();
    } 
	
	//处理高度自适应，每次浏览器尺寸变化时触发
	function customHeightSet(contentHeight){
		$(".cusBoxContent").height(contentHeight-55)
	}
	//改变城市状态
	function changestatus(id)
	{
		
		var $switch = $("#b"+id);
		var val = $switch.attr("relValue");

		var bool=val=='0'?true:false;

		
		$.post("city!updateStatus.action?city.id=" + id +"&city.status=" + bool, function(data) {
			//console.log(data);
			//alert(data.r);
		}, "json");
		
		if(val == 0){
			$switch.attr('value','禁用');
			$switch.attr('relValue',1);
		}else{
			$switch.attr('value','启用');
			$switch.attr('relValue',0);
		}
	}
</script>	
</body>
</html>