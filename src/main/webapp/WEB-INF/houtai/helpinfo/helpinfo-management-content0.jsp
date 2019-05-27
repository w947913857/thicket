<%@page language="java" pageEncoding="UTF-8"%>
<% 
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>加盟信息</title>
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
<%String helpid = request.getParameter("helpid"); %>

	<div class="padding_right5">
		<div id="maingrid"></div>
    </div>
	<script type="text/javascript">

       
       //数据表格使用
        var g;
			 g = $("#maingrid").quiGrid({
               columns:[
			{ display: '求助人', name: 'helpid',     align: 'left', width: "20%"},
		    { display: '评论人', name: 'uid', 	 align: 'left', width: "20%"},
		    { display: '评论内容', name: 'content', align: 'left', width: "40%"},
		    { display: '评论时间', name: 'time', 	 align: 'left',  width:"20%"} ,
		  ],
	  sortName: 'userId',rownumbers:true,checkbox:true,url:'',
	    height: '100%', width:"100%",pageSize:1,percentWidthMode:true,hideScrollerX:true,

    height: '100%', width:"99%",pageSize:10
            });
        function loaddataHandler(){
			g.setOptions({url:"<%=path%>/helpcomment!getHelpcommentOfPager.action?helpcomment.helpid=<%=helpid %>"})
		}
    </script>
    <script type="text/javascript">loaddataHandler();</script>	
</body> 

</html>