<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>丛林闲居-基金会-我要捐款</title>
    <link rel="stylesheet" href="style/cy.css">
    <link rel="stylesheet" href="style/style.css">
</head>
<body>
<div>
    <!--首页TOP-->
    <div class="yc-txdd1">
         
        <!--首页banner-->
        <jsp:include  page="head.jsp" />   
        <script type="text/javascript">
function Alllogin(){
	window.location.href = "login.jsp?returnurl=/FoundDonations.jsp";
} 
function loginOut(){
	window.location.href = "<%=path%>/reguser!loginOut.action?returnurl=/FoundDonations.jsp";
}
 </script>
        <!--首页轮播图-->


        <!--用车-填写订单-->
        <div class="yc-txdd">
            <div class="yc-mbx">
                <p>当前位置：<a href="index.jsp" class="ll">丛林闲居网</a> > <a href="FoundIndex.jsp" class="ll">基金会</a> > <a href="#"
                                                                                               class="xz">我要捐款</a></p>
            </div>
            <div><img src="images/jjh_03.jpg"></div>
            <div class="jjh-index">
                <div class="wyjk-index-left" style="padding-left:80px;">
                        <div class="jjh-p2">
                            <p class="jjh-p21">捐款须知</p>
                        </div>
                    <p class="ttkk">根据丛林闲居基金会的管理规则，捐赠者可以任意选定所参加的公益项目。丛林闲居基金会根据捐赠者的意愿，负责公益项目的实施和管理，并
                        按该公益项目的实施管理规则，将相关信息反馈给捐赠者。丛林闲居基金会收到捐款后，将开具捐款收据，并按所填写地址将捐款收据寄回至捐
                        赠者。丛林闲居基金会负责有关网上捐赠活动的解释。</p>
                    <div class="jjh-p2">
                        <p class="jjh-p21">银行汇款</p>
                    </div>
                    <p class="esdg">银行转账至（请注明捐助项目）：</p>
                   
 
                    <table class="table2">
                     <tr><td>单位名称： 江西济缘慈善基金会（筹）</td></tr>
                    <tr>
                            <td> <p >户名：江西丛林闲居投资有限公司</p></td>
                        </tr>   
                    	<tr>
                            <td><p>银行账号： 3605-0153-0150-0950-1617</p><p>开户银行： 建行南昌洪都支行</p></td>
                        </tr>   
                        <tr> 
                            <td>捐款热线： 400-688-6798</td>
                        </tr>
                        <tr>     
                            <td>邮箱地址：1415917674@qq.com</td>
                        </tr> 
                        <!--<tr> <td>地 &nbsp;&nbsp;&nbsp;&nbsp;址： 江西省南昌高新开发区高新一路海外大厦北楼4层</td></tr> -->
                        
                   </table> 

                    <div class="jjh-p2">
                        <p class="jjh-p21">现场捐款</p>
                    </div>

                    <p class="address1">地址：江西省南昌高新开发区高新一路海外大厦北楼4层  邮编：330000</p>
                    <div class="wyjk-index-right">
                        <div class="axjz">
                            <img src="images/love_03.jpg">我要捐款
                        </div>
                        <div class="axjz1">
                            <p class="srzs"><i>01/</i>基金会收入总数</p>
                            <p class="sun"><em id="em1" style="float: left;margin-left: -30px;"></em></p>
                            <p><a href="DonationLove.jsp">查看善款公示</a> </p>
                        </div> 
                        <div class="axjz1" style="border: none;">
                            <p class="srzs"><i>02/</i>基金会支出总数</p>
                            <p class="sun"><em id="em2" style="float: left;margin-left: -30px;"></em></p>
                            <p><a href="PLpublicity.jsp">查看支出细则</a> </p>
                        </div>
                    </div>
                </div>
                <div class="jjh-index-right">
                    <a href="FoundRescue.jsp"><div>
                        <img src="images/brower_03.jpg" class="enheng">
                        <p>我要求助</p>
                        <img src="images/brower_07.jpg" >
                    </div></a>
                    <a href="DonationLove.jsp"><div>
                        <img src="images/brower_11.jpg" class="enheng">
                        <p>我要查询</p>
                        <img src="images/brower_07.jpg">
                    </div></a>
                    <a href="FoundDonations.jsp"><div>
                        <img src="images/brower_15.jpg" class="enheng" style="margin-top: 15px;">
                        <p>我要捐款</p>
                        <img src="images/brower_07.jpg">
                    </div></a>
                    <a href="UserPquery.jsp"><div>
                        <img src="images/brower_19.jpg" class="enheng" style="margin-top: 23px;">
                        <p>求助进度</p>
                        <img src="images/brower_07.jpg">
                    </div></a>
                    <a href="FoundJzfzlist.jsp"><div>
                        <img src="images/brower_23.jpg" style="margin-top: 16px;">
                        <p>公示列表</p>
                    </div></a>
                </div>

            </div>
        </div>
        <%@ include  file="bottom.jsp"%>
    </div>


</div>
<script src="js/jquery.min.js"></script>
<script src="../../js"></script>
<script type="text/javascript">
var em1 = document.getElementById("em1");
var em2 = document.getElementById("em2");
$(document).ready(function() { 
	$.ajax({  
        type : "post",  
         url : "<%=path%>/donation!selMoneysCount.action",  
         dataType: "json",
         async : false,    
         success : function(results){  
        	 em1.innerHTML = results.incomeMoneyStr;  
        	 em2.innerHTML = results.expenditureMoneyStr;
         }  
    }); 
}); 
</script>
</body>
</html>