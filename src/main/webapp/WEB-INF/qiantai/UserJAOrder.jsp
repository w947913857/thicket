<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>丛林闲居-用户中心-丛林闲居订单</title>
    <link rel="stylesheet" href="style/cy.css">
    <link rel="stylesheet" href="style/style.css">
    <style rel="stylesheet">  
.pagination {font-family: Tahoma;font-size: 12px;height: 22px;margin: 5px 10px;text-align: right;}  
.pagination a,.page-cur,.page-start,.page-end,.page-disabled,.page-skip {  
height:22px;line-height:22px;margin:0 3px 0 0;text-align:center;vertical-align:middle;white-space:nowrap;}  
.pagination input {border-width: 1px;}  
.page-start, .pagination a, .page-end, .page-disabled {border: 1px solid #CCCCCC;padding: 0 5px;}  
.pagination a {text-decoration: none;}  
.page-cur {background-color: #FFEDE1;border: 1px solid #FD6D01;color: #FD6D01;font-weight: 700;padding: 0 5px;}  
.page-disabled {color: #CCCCCC;}  
.page-skip {color: #666666;padding: 0 3px;}  
</style> 
</head>
<body style="background-color:#f6f6f6;">
<c:if test="${sessionUser==null }">
<script type="text/javascript">
window.location.href = "<%=path%>/login.jsp";
</script>
</c:if>
<c:if test="${isUpdate ==1}">
<script type="text/javascript">
	alert("取消预定成功");
	window.location.href = "<%=path%>/UserJAOrder.jsp"; 
</script>
</c:if>
<c:if test="${isUpdate ==0}">
<script type="text/javascript">
	alert("取消预定失败，请重试");
	window.location.href = "<%=path%>/UserJAOrder.jsp";
</script>
</c:if>
<div>
    <!--首页TOP-->
     
    <!--首页banner-->
     <jsp:include  page="head.jsp" />
   <script type="text/javascript">
   function loginOut(){
		window.location.href = "<%=path%>/reguser!loginOut.action?returnurl=/clxjmain!Homepage.action";
	}
   </script>
    <!--首页轮播图-->
    <!--用车-填写订单-->
    <div class="personal-content">
        <div><img src="images/ayw_03.gif"></div>
        <div class="per-cont-left">
            <ul class="left-top">
                <li class="top-one">
                    <ul class="lf one-i">
                        <li><c:if test="${sessionUser.sex ==true}"><img src="images/touxiagn.png"/></c:if>
                            	<c:if test="${sessionUser.sex ==false}"><img src="images/touxiagnv.jpg"/></c:if>
                            </li>
                    </ul>
                    <ul class="lf one-ii">
                        <li> </li>
                        <li>尊敬的会员！<input type="hidden" id="uid" value="${sessionUser.id }"/></li> 
                        <li class="quit"><em onclick="loginOut()">[退出]</em></li>
                    </ul>
                </li>
                <li class="top-two cf">手机：${sessionUser.mobile }</li>
                <li class="top-two">邮箱：${sessionUser.email }</li>
            </ul>
            <ul class="grzl-banner">
                <li> <a href="UserPersonal.jsp"><p class="grzl"></p>个人资料</a></li>
                <li> <a href="UserCPassword.jsp"><p class="xgmm"></p>密码修改</a></li>
                <li  class="yhzxsp yhzxs"> <a href="javascript:void(0)"> <p class="clxjdd"></p>丛林闲居订单</a></li>
                <li> <a href="UserCarOrder.jsp"><p class="ycdd"></p>我的用车订单</a></li>
                <li> <a href="UserPquery.jsp"><p class="qzjd"></p>求助进度查询</a></li>
                <li > <a href="UserJPquery.jsp"><p class="jmcx"></p>加盟进度查询</a></li>
            </ul>
        </div>

        <div class="per-cont-right">
            <div class="yhzx-jmjdcx">
                <div class="jmjdcx-top">
                   <span class="dywr" onclick="selTable(0)">所有订单(<em id="countAll"></em>)</span> |<span onclick="selTable(1)">未完成(<em id="countNo"></em>)</span> |<span onclick="selTable(2)">已完成(<em id="countOk"></em>)</span>
                </div>
                <div class="jmjdcx-nr">
                    <div class="jmjdx-one">
                        <div class="clxjdd-top">
                            <p class="one">酒店</p>
                            <p class="two">入住时间</p>
                            <p class="two">订单状态</p>
                            <p class="two">订单操作</p>
                        </div>
                        <div class="clxjdd-bot" id="tab"> 
                           
                        </div>
                        <div class="fenye4" style="width: 100%"> 
                            <div id="pageNav"  align="center"></div>     
                        </div>
                    </div>

                </div>
            </div>
        </div>

    </div>
    <%@ include  file="bottom.jsp"%>
</div>
<script src="js/jquery.min.js"></script>
<script src="../../js"></script>
<script type="text/javascript">  
function updateOrder(update){
	var oid = 'oid'+update;
	var state1 ='state'+update;
	var cid1 ='cid'+update;
	var oid = document.getElementById(oid).value;
	var cid = document.getElementById(cid1).value;
	var state = document.getElementById(state1).value;
	if(state==1){  
		window.location.href='<%=path%>/clxjorder!updateOrder.action?clxjorder.state=0&clxjorder.oid='+oid;	  
	}else{   
		window.location.href='<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id='+cid;	   
	}
}
function goClxj(id){
	var cid1 ='cid'+id;
	var cid = document.getElementById(cid1).value;
	window.location.href='<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id='+cid;	   
}
</script>
<script type="text/javascript">
getCount();
var countAll;
var countOk;
var countNo; 
function getCount(){
	$.ajax({  
        type : "post",  
         url : "<%=path%>/clxjorder!selclxjorderCount.action",  
         data: {"uid":$("#uid").val()},
         dataType: "json",
         async : false,   
         success : function(results){  
        	 countAll = results.clxjOrderCount.count;   
			 countOk = results.clxjOrderCount.ok;  
			 countNo = results.clxjOrderCount.no;
			 document.getElementById("countAll").innerHTML =  countAll;
			 document.getElementById("countOk").innerHTML =  countOk;
			 document.getElementById("countNo").innerHTML =  countNo;   
			 testPage(1); 
         }   
    });
}        
function InitTable(index,cflag) { 
	document.getElementById("tab").innerHTML = ""; 
	$.ajax({    
        type : "post",  
         url : "<%=path%>/clxjorder!selclxjorderOfUid.action",      
         data : {"uid":$("#uid").val(),"index":+index,"state":+cflag},     
         dataType: "json",   
         async : false,    
         success : function(results){ 
             if(results.clxjorderJson.length>0){
             for(var i=0;i<results.clxjorderJson.length;i++){
                 var oid = results.clxjorderJson[i].oid;//订单号 
                 var reservetime = results.clxjorderJson[i].reservetime;//预定时间
                 var clxjimg = results.clxjBackurl+results.clxjorderJson[i].cimg;//房间图片 
                 var cid = results.clxjorderJson[i].cid;//房间Id
                 var clxjtitle = results.clxjorderJson[i].name;//房间标题
                 var total = results.clxjorderJson[i].total;//订单总价
                 var company = "元";
                 if(total==0.0){
                	 total="随缘";
                	 company="";
                     }
                 var clxjaddress = results.clxjorderJson[i].address;//房间地址 
                 var checkstartdate = results.clxjorderJson[i].checkstartdate;//入住时间
                 var livedate = results.clxjorderJson[i].livedate;//入住时长
                 var state = results.clxjorderJson[i].state;//订单状态
                 var state2;
                 var show;
                 switch (state) {
					case 0:
						state2 = '交易失败';
						show ='再次预定';
						break;
					case 1:
						state2 = '交易进行中';
						show ='取消预定';
						break;
					case 2: 
						state2 = '交易成功';
						show ='再次预定';
						break;
				}
            	 document.getElementById("tab").innerHTML += "<table><thead><td colspan='4' ><input type='hidden' value='"+cid+"' id='cid"+i+"'/><input type='hidden' value='"+oid+"' id='oid"+i+"'/><input type='hidden' value='"+state+"' id='state"+i+"'/>订单号："+oid+" &nbsp;&nbsp;&nbsp;&nbsp; 预订时间："+reservetime+"</td></thead><tr><td class='jdes'><div><a href='javascript:void(0)' onclick='goClxj("+i+")'><img width='70' height='70' src='"+clxjimg+"'></a></div><div><p class='xdky'><a href='javascript:void(0)' onclick='goClxj("+i+")'>"+clxjtitle+"</a></p><p class='money1'><i>￥"+total+"</i>"+company+"</p><p class='money1'>"+clxjaddress+"</p></div></td><td class='jdes1'><p>"+checkstartdate+"</p><p><i>入住"+livedate+"晚</i></p></td><td>"+state2+"</td><td><p> </p><p class='zcyd'><a href='javascript:void(0)' onclick='updateOrder("+i+")'>"+show+"</a></p></td></tr></table>"; 
                 }
             }else{ 
            	 document.getElementById("tab").innerHTML = "暂时无丛林闲居订单哦";
                 }
         }
    });       
} 
function selTable(sel){
	switch (sel) {
	case 0:
		testPage(1);
		break;
	case 1:
		testPage0(1);
		break;
	case 2:  
		testPage2(1); 
	break;
	}
}
function testPage(curPage){ 
        supage('pageNav','testPage','',curPage,countAll,5);   
        InitTable(curPage,4); 
}
function testPage0(curPage){ 
	if(countNo==0){
		document.getElementById("tab").innerHTML="暂时无丛林闲居订单哦"; 
		document.getElementById("pageNav").innerHTML=""; 
		}else{
    supage('pageNav','testPage0','',curPage,countNo,5);   
    InitTable(curPage,0); }
} 
function testPage2(curPage){ 
	if(countOk==0){ 
		document.getElementById("tab").innerHTML="暂时无丛林闲居订单哦";  
		document.getElementById("pageNav").innerHTML=""; 
		}else{
    supage('pageNav','testPage2','',curPage,countOk,5);    
    InitTable(curPage,2); }
} 
function deleteRows(tabid){
	var tb = document.getElementById(tabid);
    var rowNum=tb.rows.length;
    for (i=0;i<rowNum;i++) 
    {
        tb.deleteRow(i);
        rowNum=rowNum-1;
        i=i-1;
    }
} 
 function supage(divId, funName, params, curPage, total, pageSize){  
	    var output = '<div class="pagination" style="margin-top:0px;margin-left:-60px;width:320px;">';    
	    var pageSize = parseInt(pageSize)>0 ? parseInt(pageSize) : 10;  
	    if(parseInt(total) == 0 || parseInt(total) == 'NaN') return;  
	    var totalPage = Math.ceil(total/pageSize);  
	    var curPage = parseInt(curPage)>0 ? parseInt(curPage) : 1;  
	      
	    //从参数对象中解析出来各个参数  
	    var param_str = '';  
	    if(typeof params == 'object'){  
	        for(o in params){  
	            if(typeof params[o] == 'string'){  
	               param_str += '\'' + params[o] + '\',';  
	            }  
	            else{  
	               param_str += params[o] + ',';  
	            }  
	        }  
	        //alert(111);  
	    }  
	    //设置起始页码  
	    if (totalPage > 10) {  
	        if ((curPage - 5) > 0 && curPage < totalPage - 5) {  
	            var start = curPage - 5;  
	            var end = curPage + 5;  
	        }  
	        else if (curPage >= (totalPage - 5)) {  
	            var start = totalPage - 10;  
	            var end = totalPage;  
	        }  
	        else {  
	            var start = 1;  
	            var end = 10;  
	        }  
	    }  
	    else {  
	        var start = 1;  
	        var end = totalPage;  
	    }  
	      
	    //首页控制  
	    if(curPage>1){  
	        output += '<a href="javascript:'+funName+'(' + param_str + '1);" title="第一页" class="page-first">«</a>';  
	    }  
	    else  
	    {  
	        output += '<span class="page-disabled">«</span> ';  
	    }  
	    //上一页菜单控制  
	    if(curPage>1){  
	        output += '<a href="javascript:'+funName+'(' + param_str + (curPage-1)+');" title="上一页" class="page-previous">‹</a>';  
	    }  
	    else{  
	        output += '<span class="page-disabled">‹</span>';  
	    }  
	      
	    //页码展示  
	    for (i = start; i <= end; i++) {  
	        if (i == curPage) {  
	            output += '<a href="javascript:;" class="page-cur">' + curPage + '</a>';  
	        }  
	        else {  
	            output += '<a href="javascript:'+funName+'(' + param_str + i + ');">' + i + '</a>';  
	        }  
	    }  
	    //下一页菜单控制  
	    if(totalPage>1 && curPage<totalPage){  
	        output += '<a title="下一页" href="javascript:'+funName+'('+param_str + (curPage+1)+');" class="page-next">›</a>';  
	    }  
	    else{  
	        output += '<span class="page-disabled">›</span>';  
	    }  
	    //最后页控制  
	    if(curPage<totalPage){  
	        output += '<a title="最后页" href="javascript:'+funName+'('+param_str + totalPage+');" class="page-end">»</a>';  
	    }  
	    else{  
	        output += '<span class="page-disabled">»</span>';  
	    }  
	      
	    output += '</div>';  
	    //渲染到dom中  
	    if(total<=5){   
	    	document.getElementById(divId).innerHTML ="";
		    }else{ 
	    document.getElementById(divId).innerHTML = output; } 
};
</script>
</body>
</html>