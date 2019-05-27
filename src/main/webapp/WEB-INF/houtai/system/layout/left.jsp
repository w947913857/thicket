<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/" scrollerY="false"/>
<link rel="stylesheet" type="text/css" id="customSkin"/>
<!--框架必需end-->

<!-- 树start-->
<script type="text/javascript" src="<%=path%>/libs/js/tree/ztree/ztree.js"></script>
<link href="<%=path%>/libs/js/tree/ztree/ztree.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">
	var setting = {
		callback: {
			onClick: onClick
		}
	};
	
	//var zNodes =[
		//{ id:3013, parentId:0, 	  name:"管理员后台管理", isParent: true},
		//{ id:1301, parentId:3013, name:"注册用户管理",url:"<%=path%>/reguser/reguser-management.jsp", target:"frmright"},
		//{ id:1302, parentId:3013, name:"后台用户管理",url:"<%=path%>/adminuser/adminuser-management.jsp", target:"frmright"},
		//{ id:1303, parentId:3013, name:"丛林审核",url:"<%=path%>/release/cl-management.jsp", target:"frmright"},
		//{ id:1304, parentId:3013, name:"闲居审核",url:"<%=path%>/release/xj-management.jsp", target:"frmright"},
		//{ id:1305, parentId:3013, name:"用车审核",url:"<%=path%>/release/car-management.jsp", target:"frmright"},
		//{ id:1306, parentId:3013, name:"求助信息管理",url:"<%=path%>/common/404.jsp", target:"frmright"},
		//{ id:1307, parentId:3013, name:"爱心捐赠管理",url:"<%=path%>/common/404.jsp", target:"frmright"},
		//{ id:1308, parentId:3013, name:"月底支出管理",url:"<%=path%>/common/404.jsp", target:"frmright"},
		//{ id:1309, parentId:3013, name:"款物发放管理",url:"<%=path%>/common/404.jsp", target:"frmright"},
		//{ id:1310, parentId:3013, name:"test",url:"<%=path%>/sample/unit/user-management.jsp", target:"frmright"},
		
		//{ id:3014, parentId:0, 	  name:"僧侣后台管理", isParent: true}, 
		//{ id:1401, parentId:3014, name:"解脱及忏悔管理",url:"<%=path%>/confession/confession-management.jsp", target:"frmright"},
		
		//{ id:3015, parentId:0, 	  name:"加盟商后台管理", isParent: true}, 
		//{ id:1501, parentId:3015, name:"丛林管理",url:"<%=path%>/clxjmain/cl-management.jsp", target:"frmright"},
		//{ id:1502, parentId:3015, name:"丛林订单管理",url:"<%=path%>/common/404.jsp", target:"frmright"},
		//{ id:1503, parentId:3015, name:"闲居管理",url:"<%=path%>/clxjmain/xj-management.jsp", target:"frmright"},
		//{ id:1504, parentId:3015, name:"闲居订单管理",url:"<%=path%>/common/404.jsp", target:"frmright"},
		//{ id:1505, parentId:3015, name:"用车管理",url:"<%=path%>/carinfo/carinfo-management.jsp", target:"frmright"},
		//{ id:1506, parentId:3015, name:"用车订单管理",url:"<%=path%>/common/404.jsp", target:"frmright"}
	//];
	
	function initComplete(){

		$.post("<%=path%>/adminusers!getAuthTree.action", {}, function(result){
			//此处返回的是treeNodes
			$.fn.zTree.init($("#treeDemo"), setting, result.treeNodes);
			//每次刷新时保持上次打开的
			showContent();
		}, "json");

		
		//$.fn.zTree.init($("#treeDemo"), setting, zNodes);
		
	}
	function showContent(){
		var treeNodeId=jQuery.jCookie('leftTreeNodeId');
		if(treeNodeId==false||treeNodeId=="false"){}
		else{
			var zTree = $.fn.zTree.getZTreeObj("treeDemo");
			var node = zTree.getNodeByParam("id", treeNodeId);
			zTree.selectNode(node);
			if(node.url){
				//每次刷新时设置当前位置内容
				if(node.name=="当前位置"){
					top.positionType="normal";
					top.positionContent="当前位置："+node.getParentNode().name+">>"+node.name;
				}
				else{
					top.positionType="none";
				}
				top.frmright.location=node.url;
			}
		}
	}
		
	function onClick(e,treeId, treeNode){
		//单击展开
		var zTree = $.fn.zTree.getZTreeObj("treeDemo");
		zTree.expandNode(treeNode);
		//出现进度条
		if(treeNode.url!=null&&treeNode.showProgess!=false){
			showProgressBar();
		}
		
		//可以设置某些页面出现或者某些页面不出现当前位置组件
		if(treeNode.name=="当前位置"){
			//每次点击时设置当前位置内容
			top.positionContent="当前位置："+treeNode.getParentNode().name+">>"+treeNode.name;
			top.positionType="normal";
		}
		else{
			top.positionType="none";
		}
		//存储点击节点id
		jQuery.jCookie('leftTreeNodeId',treeNode.id.toString());
	}

	function  showAll(){
		var treeObj=$.fn.zTree.getZTreeObj("treeDemo");
		treeObj.expandAll(true);
	}
	function  hideAll(){
		var treeObj = $.fn.zTree.getZTreeObj("treeDemo")
		treeObj.expandAll(false);
	}
	function customHeightSet(contentHeight){
		var windowWidth=document.documentElement.clientWidth;
		$("#scrollContent").width(windowWidth-4);
		$("#scrollContent").height(contentHeight-50);
	}
</script>
<!-- 树end -->
<style>
.ztree *{
	font-family:sans-serif!important;
}
</style>
</head>

<body leftFrame="true">
<div class="padding_top5 ali02">
	<a onclick="showAll()">全部展开</a>&nbsp;&nbsp;<a onclick="hideAll()">全部收缩</a>
	<!-- <div class="red">（含*号表示该项实现由后台支持）</div> -->
</div>

<div id="scrollContent" style="overflow-x:hidden;">

	<div>
		<ul id="treeDemo" class="ztree"></ul>
	</div>
		
</div>	
</body>
</html>