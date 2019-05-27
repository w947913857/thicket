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
 <title>丛林闲居-订房-成功下单</title>
    <link rel="stylesheet" href="style/cy.css">
    <link rel="stylesheet" href="style/style.css">
</head>
<body style="background-color: #e7f2ff;">
<c:if test="${sessionUser==null }">
<script type="text/javascript">
window.location.href = "<%=path%>/login.jsp";
</script>
</c:if>
<!--登录页TOP-->
<div class="index-top1">
    <div class="left">
        <span class="one"><a href="                   "><img src="images/logo1.png"></a></span>
    </div>   
    <div class="right1"> 
        <div class="three1">
            <span><img src="images/index_03.png"></span>
            <ul>
                <li class="rx">客户服务热线:</li>
                <li class="phone">400-688-6798</li>
            </ul>
        </div>
    </div>
</div>
<div class="df-txdd">
    <div class="dt-main">
        <div class="dtm-left">
            <div class="top">
                <p class="one"><img src="images/txdd_03.jpg">${clxjmain.name }</p>
                <p class="two">地址:${clxjmain.address }</p>
            </div>
        </div>
        <div class="dtm-right">
            <div class="dr-main">
                <div class="top1">
                    <div><span class="two">1 </span><img src="images/xj_03.jpg"> <span class="one">2</span></div>
                    <p>填写订单</p><p class="special">订单完成</p>
                </div>
            </div>
        </div>
        <div class="cgxd">
            <div class="cgxd-main">
                <p class="xdcg"><img src="images/xdcg.png"> </p> 
                <p class="ddbh">订单编号：<i>${clxjorder.oid }</i> [请牢记您的订单编号]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单总价：<i>${clxjorder.total }</i> （该订单属于线下支付类型）</p>
                <p class="fhdd">您可以：<a href="UserJAOrder.jsp" class="fh">返回我的订单</a><a href="carinfo!selCarofCid.action?clxjmain.id=${clxjmain.id }" class="jx">继续预定用车</a>（如有疑问请联系丛林闲居客服QQ:2897968708）</p>
                <p class="wxts"><i>*温馨提示：</i>IE6.0及更低版本浏览器用户请检查您的浏览器是否支持128位密钥长度，如果不支持，请升级您的浏览器。</p>
            </div>
        </div>
    </div>
</div> 
<footer>
    <ul>
        <li>江西省丛林闲居投资有限公司，工业和信息化部网站备案许可证编号：赣ICP备15010915号</li>
        <li>Copyright © 2015 <a href="#">丛林闲居</a>  版权所有 3wcl.com | 客服中心：400-688-6798</li>
    </ul>
    <p><a href="#"><img src="images/index_48.jpg"></a><a href="#"><img src="images/index_50.jpg"></a><a href="#"><img src="images/index_52.jpg"></a> <a href="#"><img src="images/index_54.jpg"></a><a href="#"><img src="images/index_56.jpg"></a> <a href="#"><img src="images/index_58.jpg"></a>    </p>
</footer>
<script src="js/jquery.min.js"></script>
<script src="../../js"></script>

</body>
</html>