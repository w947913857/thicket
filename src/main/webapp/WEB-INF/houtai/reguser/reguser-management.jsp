<%@page language="java" pageEncoding="UTF-8"%>
<% 
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册用户管理</title>
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/" scrollerY="false"/>
<link rel="stylesheet" type="text/css" id="customSkin"/>
<!--框架必需end-->

<!--树组件start -->
<script type="text/javascript" src="<%=path%>/libs/js/tree/ztree/ztree.js"></script>
<link href="<%=path%>/libs/js/tree/ztree/ztree.css" rel="stylesheet" type="text/css"/>
<!--树组件end -->

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
		<td width="100%" class="ver01" >
			<div class="box2" panelTitle="查询" showStatus="false">
				<form action="<%=path%>/regusers!getRegUsersOfPager.action" id="queryForm" method="post">
				<table>
					<tr>
						<td>姓名：</td>
						<td>
							<input type="text" id="searchInput" name="reguser.username"/>
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
				{ display: '用户名', name: 'username',     align: 'center', width: "10%"},
			    { display: '密码', name: 'pwd', 	 align: 'center', width: "10%"},
			    { display: '手机', name: 'mobile', align: 'center', width: "10%"},
			    { display: 'email', name: 'email', 	 align: 'center',  width:"10%"} ,
			    { display: '真实姓名', name: 'realname', 	 align: 'center',  width:"5%"} ,
			    { display: '性别', name: 'sex', 	 align: 'center',  width:"5%"} ,
			    { display: '证件号码', name: 'idcard', 	 align: 'center',  width:"15%"} ,
			    //{ display: '所在城市', name: 'city', 	 align: 'center',  width:"10%"} ,//
			    { display: '注册时间', name: 'regtime', 	 align: 'center',  width:"15%"} ,
			    /**{ display: '操作', isAllowHide: false, align: 'center', width:"5%",
						 render: function (rowdata, rowindex, value, column){
	                 	    return '<div class="padding_top4 padding_left5">'
	                                 + '<span class="img_list hand" title="查看" onclick="onView(' + rowdata.userId + ')"></span>'
	                             + '</div>';
		                 }
		            },*/
		        { display: '是否启用', isAllowHide: false, align: 'center', width:"10%",
						 render: function (rowdata, rowindex, value, column){
	                 	    return "1"==rowdata.enableflag?"<input type='button' id='b"+rowdata.id+"' name='b"+rowdata.id+"' value='禁用' relValue='1' onclick='changestatus("+rowdata.id+")'>":"<input type='button' id='b"+rowdata.id+"' name='b"+rowdata.id+"' value='启用' relValue='0' onclick='changestatus("+rowdata.id+")'>";
		                 }
		        }
			  ],
		 url: '<%=path%>/regusers!getRegUsersOfPager.action', sortName: 'id',rownumbers:true,checkbox:true,
         height: '100%', width:"100%",pageSize:10
        
         /**toolbar:{
			  items:[
        		  {text: '新增', click: addUnit,    iconClass: 'icon_add'},
        		  { line : true },
        		  {text: '批量删除', click: deleteUnit, iconClass: 'icon_delete'},
        		  { line : true },
        		  {text: '导入', click: showImportDialog, iconClass: 'icon_import'},
        		  { line : true },
        		  {text: '导出当前页', click: exportPageData, iconClass: 'icon_export'},
        		  { line : true },
        		  {text: '导出全部', click: exportTotalData, iconClass: 'icon_export'}
        		
         	}]*/
		});
	}
	
	
	//新增
	function addUnit() {
		var orgid = $("#parentId").val();
		top.Dialog.open({
				URL:"<%=path%>/sample/unit/user-management-content.jsp?orgid=" + orgid,
				Title:"添加",Width:500,Height:350});
	}
	//查看
	function onView(rowid){
		top.Dialog.open({
			URL:"<%=path%>/users!getUserDetail.action?userinfor.userId=" + rowid,
			Title:"查看",Width:500,Height:350});
	}
	//修改	
	function onEdit(rowid){
		top.Dialog.open({
			URL:"<%=path%>/sample/unit/user-management-contentAjax.jsp?userId=" + rowid,
			Title:"修改",Width:500,Height:350});
	}
	//删除	
	function onDelete(rowid,rowidx){
		top.Dialog.confirm("确定要删除该记录吗？",function(){
		  	//删除记录
		  	$.post("<%=path%>/users!deleteUser.action",
		  			{"ids":rowid},
		  			function(result){
		  				handleResult(result.status);
					},"json");
					//刷新表格数据 
					grid.loadData();
			});
	}
		
		
	//批量删除
	function deleteUnit() {
		var rows = grid.getSelectedRows();
		var rowsLength = rows.length;
		
		if(rowsLength == 0) {
			//top.Dialog.alert("请选中要删除的记录!");
			//return;
		}
		top.Dialog.confirm("确定要删除吗？",function(){
			$.post("<%=path%>/users!deleteUser.action",
					//获取所有选中行
					getSelectIds(grid),
					function(result){
						handleResult(result.status);
					},
					"json");
		});
	}
	
	
	//删除后的提示
	function handleResult(result){
		if(result == 1){
			top.Dialog.alert("删除成功！",null,null,null,1);
			grid.loadData();
		}else{
			top.Dialog.alert("删除失败！");
		}
	}
	
	//获取所有选中行获取选中行的id 格式为 ids=1&ids=2 
	function getSelectIds(grid) {
		var selectedRows = grid.getSelectedRows();
		var selectedRowsLength = selectedRows.length;
		var ids = "";
		
		for(var i = 0;i<selectedRowsLength;i++) {
			ids += selectedRows[i].userId + ",";
		}
		return {"ids":ids};
	}
	
	//导入
	function showImportDialog(){
		top.Dialog.open({Title:"导入用户信息", 
						Message:"请上传excel文件", 
						URL:"<%=path%>/sample/unit/uploadFile.jsp?type=1",
						Width:350,Height:130});
	}
	
	//导出本页
	function exportPageData(){
		exportData(true);
	}
	
	//导出全部
	function exportTotalData(){
		exportData(false);
	}
	
	//导出处理
	function exportData(isPage){
		var pageNo = grid.options.page;
		var pagerSize = grid.options.pageSize;;
		var sort = grid.options.sortName;
		var direction = grid.options.sortOrder;
		var parentid = $("#parentId").val();
		var userName = $("#userName").val();
		var url = "<%=path%>/users!exportData.action";
		if(isPage){
			url += "?pager.pageSize=" + pagerSize;
			url += "&pager.pageNo=" + pageNo;
			url += "&sort=" + sort;
			url += "&direction=" + direction;
			url += "&isPage=1";
		}else{
			url += "?isPage=0";
		}
		url += "&parentId=" + parentid;
		url += "&userinfor.userName" + userName;
		
		window.location = url;
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


	function changestatus(id)
	{
		
		var $switch = $("#b"+id);
		var val = $switch.attr("relValue");

		var bool=val=='0'?true:false;

		
		$.post("regusers!updateBeUse.action?reguser.id=" + id +"&reguser.enableflag=" + bool, function(data) {
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