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
      <title>丛林闲居-用户中心-加盟进度查询</title>
    <link rel="stylesheet" href="style/cy.css">
    <link rel="stylesheet" href="style/style.css">
</head>
<body style="background-color:#f6f6f6;">
<c:if test="${sessionUser==null }">
<script type="text/javascript">
window.location.href = "<%=path%>/login.jsp";
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
                <li > <a href="UserJAOrder.jsp"> <p class="clxjdd"></p>丛林闲居订单</a></li>
                <li> <a href="UserCarOrder.jsp"><p class="ycdd"></p>我的用车订单</a></li>
                <li> <a href="UserPquery.jsp"><p class="qzjd"></p>求助进度查询</a></li>
                <li  class="yhzxsp yhzxs3"> <a href="javascript:void(0)"><p class="jmcx"></p>加盟进度查询</a></li>
            </ul>
        </div>

        <div class="per-cont-right">
            <div class="yhzx-jmjdcx">
                <div class="jmjdcx-top">
                    <span class="dywr" onclick="initTab(2)">丛林(<em id="cl"></em>)</span> |<span onclick="initTab(3)">闲居(<em id="xj"></em>)</span> |<span onclick="initTab(4)">用车(<em id="car"></em>)</span>
                </div> 
                <div class="jmjdcx-nr"> 
                    <div class="jmjdx-one">
                        <table border="1px solid #ccc" id="tab">
                        </table>
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
getCount();
var cl =0;
var xj = 0;
var car = 0;
function getCount(){
	$.ajax({  
        type : "post",  
         url : "<%=path%>/joincl!selJoinCount.action",    
         data: {"uid":$("#uid").val()},
         dataType: "json",
         async : false,   
         success : function(results){   
        		cl =  results.cl;  
        		xj =  results.xj;
        		car =  results.car;  
			 	document.getElementById("cl").innerHTML = cl; 
			 	document.getElementById("xj").innerHTML =  xj;  
			 	document.getElementById("car").innerHTML =  car;
			 	initTab(2); 
         }  
    });
}
function initTab(type){ 
	var t1=document.getElementById("tab"); 
	var rowNum=t1.rows.length; 
	if(rowNum>0) 
	{ 
	for(i=0;i<rowNum;i++) 
	{ 
	t1.deleteRow(i); 
	rowNum=rowNum-1; 
	i=i-1; 
	}  
	} 
	var innerTD1 = "<tr><td>序号</td><td>加盟名字</td><td>加盟进度</td><td>申请时间</td></tr>";
	$(innerTD1).appendTo("#tab"); 
	$.ajax({   
        type : "post",  
         url : "<%=path%>/joincl!selJoinOfType.action",     
         data: {"uid":$("#uid").val(),"type":type}, 
         dataType: "json",
         async : false,   
         success : function(results){  
             if(results.joins.length>0){  
             for(var i=0;i<results.joins.length;i++){
                 var id =i+1;//序号
                 var title = results.joins[i].title;//加盟名字
                 var joinstatus = "";//加盟进度   
                 var ids =results.joins[i].id; 
                 var type ="";
                 switch (results.joins[i].type) { 
 				case 2:
 					type = "joincl";
 					break;  
 				case 3:  
 					type = "joinxj";
 					break;
 				case 4:
 					type = "joincar";
 					break; 
 				}  
                switch (results.joins[i].joinstatus) { 
				case 0:
					joinstatus="审核中";
					break;  
				case 1:  
					joinstatus="审核失败&nbsp;<a href='<%=path %>/"+type+"!update.action?"+type+".id="+ids+"'>重新加盟</a>";
					break;
				case 2:
					joinstatus="审核通过";      
					break; 
				}  
                var time = results.joins[i].time; //申请时间  
                var innerTD = "<tr><td>"+id+"</td><td>"+title+"</td><td>"+joinstatus+"</td><td>"+time+"</td></tr>";
                $(innerTD).appendTo("#tab");
                 }
         }else{
        	 var innerTD = "<tr><td  colspan='4'>暂时无加盟哦</td></tr>";  
        	 $(innerTD).appendTo("#tab");
             }  
      }
    });
}
</script>
</body>
</html>